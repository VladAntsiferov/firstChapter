package by.vantsyferov.first.reader;

import by.vantsyferov.first.exception.ErrorReadingFileException;
import by.vantsyferov.first.exception.FileIsEmptyException;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.List;

public interface CustomReaderInt {

  List<String> readFile(String customFileName) throws NoSuchFileException, ErrorReadingFileException, FileIsEmptyException;

  List<String> readDefaultFile() throws NoSuchFileException, ErrorReadingFileException;
}
