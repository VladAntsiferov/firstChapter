package by.vantsyferov.first.exception;

public class FileIsEmptyException extends Exception {
  public FileIsEmptyException() {
    super();
  }

  public FileIsEmptyException(String message) {
    super(message);
  }

  FileIsEmptyException(Throwable cause) {
    super(cause);
  }

  FileIsEmptyException(String message, Throwable cause) {
    super(message, cause);
  }
}

