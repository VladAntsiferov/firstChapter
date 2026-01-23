package by.vantsyferov.first.exception;

public class FactoryIllegalSizeException extends Exception {

  FactoryIllegalSizeException() {
    super();
  }

  public FactoryIllegalSizeException(String message) {
    super(message);
  }

  FactoryIllegalSizeException(Throwable cause) {
    super(cause);
  }

  FactoryIllegalSizeException(String message, Throwable cause) {
    super(message, cause);
  }

}
