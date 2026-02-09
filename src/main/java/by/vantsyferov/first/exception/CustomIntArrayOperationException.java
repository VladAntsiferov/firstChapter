package by.vantsyferov.first.exception;

public class CustomIntArrayOperationException extends Exception {
  CustomIntArrayOperationException() {
    super();
  }

  public CustomIntArrayOperationException(String message) {
    super(message);
  }

  CustomIntArrayOperationException(Throwable cause) {
    super(cause);
  }

  CustomIntArrayOperationException(String message, Throwable cause) {
    super(message, cause);
  }
}
