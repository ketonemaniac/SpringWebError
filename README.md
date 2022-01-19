# SpringWebError
Project to show how to decode Spring Web Default Error Attributes. The useful class is `DefultErrorAttributesPojo`

Blog: https://devdojo.com/ketonemaniac/what-is-that-error-object-from-spring-boot-rest-api

Based on Spring Docs: https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/web/servlet/error/DefaultErrorAttributes.html

## Run
Run `ErrorApplication` and go to Swagger
http://localhost:8080/swagger-ui/index.html

```json
{
  "timestamp": "2022-01-19T14:36:29.443+00:00",
  "status": 500,
  "error": "Internal Server Error",
  "exception": "java.lang.RuntimeException",
  "trace": "java.lang.RuntimeException: die!\n\tat net.ketone.error.ErrorApi.die(ErrorApi.java:14)...",
  "message": "die!",
  "path": "/api"
}
```

## Test Decode
Run `ErrorApplicationTests`