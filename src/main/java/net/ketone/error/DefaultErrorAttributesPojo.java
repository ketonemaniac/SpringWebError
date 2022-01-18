package net.ketone.error;

import org.springframework.validation.ObjectError;

import java.time.Instant;

/**
 * DefaultErrorAttributes POJO
 * @see https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/web/servlet/error/DefaultErrorAttributes.html
 */
public class DefaultErrorAttributesPojo {

    /**
     * The time that the errors were extracted
     */
    private Instant timestamp;

    /**
     * The status code
     */
    private String status;

    /**
     * The error reason
     */
    private String error;

    /**
     * The class name of the root exception (if configured)
     */
    private Class exception;

    /**
     * The exception message (if configured server.error.include-message)
     */
    private String message;

    /**
     * Any ObjectErrors from a BindingResult exception (if configured server.error.include-binding-errors)
     */
    private ObjectError errors;

    /**
     * The exception stack trace (if configured server.error.include-stacktrace)
     */
    private Throwable trace;

    /**
     * The URL path when the exception was raised
     */
    private String path;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Class getException() {
        return exception;
    }

    public void setException(Class exception) {
        this.exception = exception;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ObjectError getErrors() {
        return errors;
    }

    public void setErrors(ObjectError errors) {
        this.errors = errors;
    }

    public Throwable getTrace() {
        return trace;
    }

    public void setTrace(Throwable trace) {
        this.trace = trace;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
