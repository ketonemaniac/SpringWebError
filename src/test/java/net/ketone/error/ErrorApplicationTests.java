package net.ketone.error;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.net.URI;
import java.net.URISyntaxException;

@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
class ErrorApplicationTests {

	@LocalServerPort
	int randomServerPort;

	@Test
	public void testSpringWebException() throws URISyntaxException, JsonProcessingException {
		RestTemplate restTemplate = new RestTemplate();
		final String baseUrl = "http://localhost:"+randomServerPort+"/api";
		URI uri = new URI(baseUrl);

		try {
			restTemplate.getForEntity(uri, String.class);
		} catch(HttpStatusCodeException ex) {
			DefaultErrorAttributesPojo ea = new ObjectMapper()
					.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
					.registerModule(new JavaTimeModule())
					.readValue(ex.getResponseBodyAsString(), DefaultErrorAttributesPojo.class);
			Assertions.assertThat(ea.getError()).isEqualTo("Internal Server Error");
			System.out.println(ea);
		}
	}

}
