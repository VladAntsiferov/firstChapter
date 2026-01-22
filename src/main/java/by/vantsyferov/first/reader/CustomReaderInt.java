package by.vantsyferov.first.reader;

import java.io.IOException;
import java.util.List;

public interface CustomReaderInt {

  List<String> readFile(String customFileName) throws IOException;
}
