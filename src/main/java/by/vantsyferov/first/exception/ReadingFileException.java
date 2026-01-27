package by.vantsyferov.first.exception;

public class ReadingFileException extends Exception {

  public ReadingFileException() {
    super();
  }

  public ReadingFileException(String message) {
    super(message);
  }

  public ReadingFileException(Throwable cause) {
    super(cause);
  }

  public ReadingFileException(String message, Throwable cause) {
    super(message, cause);
  }
}
