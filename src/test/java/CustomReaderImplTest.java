import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import by.vantsyferov.first.exception.ReadingFileException;
import by.vantsyferov.first.reader.CustomReaderInt;
import by.vantsyferov.first.reader.impl.CustomReaderImpl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CustomReaderImplTest {
  CustomReaderInt customReader = new CustomReaderImpl();

  @Test
  void shouldReadExistingFile(@TempDir Path tempDir) throws IOException, ReadingFileException {
    Path file = tempDir.resolve("test.txt");
    Files.write(file, List.of("one", "two", "three"));
    List<String> result = customReader.readFile(file.toString());

    assertEquals(List.of("one", "two", "three"), result);
  }

  @Test
  void shouldReadDefaultFileIfCustomNotExists() throws IOException, ReadingFileException {
    List<String> defaultFile = customReader.readDefaultFile();
    List<String> result = customReader.readFile("missing.txt");

    assertEquals(defaultFile, result);
  }

}
