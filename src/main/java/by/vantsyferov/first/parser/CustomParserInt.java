package by.vantsyferov.first.parser;

import by.vantsyferov.first.entity.IntArray;

import java.io.IOException;
import java.util.List;

public interface CustomParserInt {
  IntArray parseToIntArray(List<String> listArray) throws IOException;
}
