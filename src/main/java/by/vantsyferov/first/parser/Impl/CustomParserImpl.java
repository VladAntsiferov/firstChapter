package by.vantsyferov.first.parser.Impl;

import by.vantsyferov.first.parser.CustomParserInt;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class CustomParserImpl implements CustomParserInt {
  static Logger logger = LogManager.getLogger();

  @Override
  public int[] parseToIntArray(List<String> line) {
    return new int[0];
  }

}
