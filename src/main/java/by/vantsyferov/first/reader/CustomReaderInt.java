package by.vantsyferov.first.reader;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.List;

public interface CustomReaderInt {

  List<String> readFile(String customFileName) throws NoSuchFileException;
}
