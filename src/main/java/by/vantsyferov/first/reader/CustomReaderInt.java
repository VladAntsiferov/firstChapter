package by.vantsyferov.first.reader;

import by.vantsyferov.first.exception.ReadingFileException;

import java.nio.file.NoSuchFileException;
import java.util.List;

public interface CustomReaderInt {

  List<String> readFile(String customFileName) throws NoSuchFileException, ReadingFileException;

  List<String> readDefaultFile() throws NoSuchFileException, ReadingFileException;
}
