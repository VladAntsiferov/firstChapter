package by.vantsyferov.first.exception;

public class ErrorReadingFileException extends Exception {

  public ErrorReadingFileException() {
    super();
  }

  public ErrorReadingFileException(String message) {
    super(message);
  }

  public ErrorReadingFileException(Throwable cause) {
    super(cause);
  }

  public ErrorReadingFileException(String message, Throwable cause) {
    super(message, cause);
  }
}
