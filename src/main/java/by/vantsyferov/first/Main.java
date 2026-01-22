package by.vantsyferov.first;

import by.vantsyferov.first.parser.Impl.CustomParserImpl;
import by.vantsyferov.first.reader.Impl.CustomReaderImpl;

import java.nio.file.NoSuchFileException;

public class Main {
  static CustomReaderImpl customReader = new CustomReaderImpl();
  static CustomParserImpl customParser = new CustomParserImpl();
  static void main() throws NoSuchFileException {
    customReader.readFile("C:/Users/Vladick/IdeaProjects/firstChapter/src/main/java/by/vantsyferov/first/data/input.txt");
    customParser.parseIntArray(customReader.readFile("C:/Users/Vladick/IdeaProjects/firstChapter/src/main/java/by/vantsyferov/first/data/input.txt"));
  }

}
