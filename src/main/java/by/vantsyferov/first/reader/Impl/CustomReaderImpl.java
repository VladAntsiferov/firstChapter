package by.vantsyferov.first.reader.Impl;

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
  private static final String DEFAULT_FILENAME = "/data/input.txt";

  @Override
  public List<String> readFile(String customFileName) throws NoSuchFileException {
    logger.info("Function readFile(String customFileName) called");
    List<String> list;
    Path filePath = Paths.get(customFileName);

    if (!Files.exists(filePath)) {
      logger.warn("File {} found, fallback to {}", customFileName, DEFAULT_FILENAME);
      filePath = Path.of(DEFAULT_FILENAME);
    }

    try {
      list = Files.readAllLines(filePath, StandardCharsets.UTF_8);
      logger.info("File {} read successfully", filePath);
      if (list.isEmpty()) {
        logger.warn("File {} is empty", filePath);
        throw new IOException("File is empty");
      }
    } catch (NoSuchFileException e) {
      logger.error(e.getMessage());
      throw new NoSuchFileException("File not found");
    } catch (IOException e) {
      logger.error(e.getMessage());
      throw new RuntimeException("Error reading file");
    }
    return list;
  }
}
