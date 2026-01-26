import by.vantsyferov.first.exception.FileIsEmptyException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import by.vantsyferov.first.exception.ErrorReadingFileException;
import by.vantsyferov.first.reader.CustomReaderInt;
import by.vantsyferov.first.reader.impl.CustomReaderImpl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CustomReaderImplTest {
  CustomReaderInt customReader = new CustomReaderImpl();

  @Test
  void shouldReadExistingFile(@TempDir Path tempDir) throws IOException, ErrorReadingFileException, FileIsEmptyException {
    Path file = tempDir.resolve("test.txt");
    Files.write(file, List.of("one", "two", "three"));


    List<String> result = customReader.readFile(file.toString());

    assertEquals(List.of("one", "two", "three"), result);
  }

  @Test
  void shouldReadDefaultFileIfCustomNotExists() throws IOException, ErrorReadingFileException, FileIsEmptyException {
    List<String> defaultFile = customReader.readDefaultFile();
    List<String> result = customReader.readFile("missing.txt");

    assertEquals(defaultFile, result);
  }

  @Test
  void shouldThrowFileIsEmptyException(@TempDir Path tempDir) throws IOException {
    Path file = tempDir.resolve("empty.txt");
    Files.createFile(file);

    FileIsEmptyException e = assertThrows(
            FileIsEmptyException.class,
            () -> customReader.readFile(file.toString())
    );

    assertEquals("File is empty", e.getMessage());
  }
}
