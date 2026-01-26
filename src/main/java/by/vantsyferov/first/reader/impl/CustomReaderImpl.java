package by.vantsyferov.first.reader.impl;

import by.vantsyferov.first.exception.ErrorReadingFileException;
import by.vantsyferov.first.exception.FileIsEmptyException;
import by.vantsyferov.first.reader.CustomReaderInt;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CustomReaderImpl implements CustomReaderInt {
  static Logger logger = LogManager.getLogger();
  private static final String DEFAULT_FILENAME = "data/input.txt";
  List<String> list;

  @Override
  public List<String> readFile(String customFileName) throws NoSuchFileException, ErrorReadingFileException, FileIsEmptyException {
    logger.info("Function readFile(String customFileName) called");
    Path filePath = Paths.get(customFileName);
    if (!Files.exists(filePath)) {
      logger.error("File {} not found, fallback to {}", customFileName, DEFAULT_FILENAME);
      filePath = Path.of(DEFAULT_FILENAME);
    }

    try {
      list = Files.readAllLines(filePath, StandardCharsets.UTF_8);
      logger.info("File {} read successfully", filePath);
      if (list.isEmpty()) {
        throw new FileIsEmptyException();
      }
    } catch (NoSuchFileException e) {
      logger.error("No such file {}", e.getMessage());
      throw new NoSuchFileException("File not found");
    } catch (IOException e) {
      logger.error("Error reading file {}", e.getMessage());
      throw new ErrorReadingFileException("Error reading file");
    } catch (FileIsEmptyException e) {
      logger.error("File {} is empty", e.getMessage());
      throw new FileIsEmptyException("File is empty");
    }
    return list;
  }

  @Override
  public List<String> readDefaultFile() throws NoSuchFileException, ErrorReadingFileException {
    logger.info("Function readDefaultFile() called");
    try {
      list = Files.readAllLines(Path.of(DEFAULT_FILENAME), StandardCharsets.UTF_8);
      logger.info("Default file {} read successfully", DEFAULT_FILENAME);
    } catch (NoSuchFileException e) {
      logger.error("No default file detected {}", e.getMessage());
      throw new NoSuchFileException("File not found");
    } catch (IOException e) {
      logger.error("Error reading default file {}", e.getMessage());
      throw new ErrorReadingFileException("Error reading file");
    }
    return list;
  }
}
