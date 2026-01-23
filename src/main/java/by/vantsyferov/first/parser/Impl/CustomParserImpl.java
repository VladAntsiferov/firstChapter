package by.vantsyferov.first.parser.Impl;

import by.vantsyferov.first.parser.CustomParserInt;
import by.vantsyferov.first.validator.Impl.CustomValidatorImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;


public class CustomParserImpl implements CustomParserInt {
  static Logger logger = LogManager.getLogger();
  private final static CustomValidatorImpl customValidator = new CustomValidatorImpl();
  private static String line;
  private static final String REGEX = "\\s*,\\s*";

  @Override
  public int[] parseToIntArray(List<String> stringArray) {
    logger.info("Function parseToIntArray(Lust<String> line) called");
    for (String stringArrayElement : stringArray){
      if (customValidator.validateLine(stringArrayElement)) {
        String[] parts = stringArrayElement.split("\\s*,\\s*");
      }
    }

    return new int[0];
  }

}
