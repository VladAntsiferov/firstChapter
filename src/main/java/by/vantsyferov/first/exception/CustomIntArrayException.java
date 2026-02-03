package by.vantsyferov.first.exception;

public class CustomIntArrayException extends Exception {
  CustomIntArrayException() {
    super();
  }

  public CustomIntArrayException(String message) {
    super(message);
  }

  CustomIntArrayException(Throwable cause) {
    super(cause);
  }

  CustomIntArrayException(String message, Throwable cause) {
    super(message, cause);
  }
}
