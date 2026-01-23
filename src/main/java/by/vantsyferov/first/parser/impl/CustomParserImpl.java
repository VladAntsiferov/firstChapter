package by.vantsyferov.first.parser.impl;

import by.vantsyferov.first.parser.CustomParserInt;
import by.vantsyferov.first.validator.impl.CustomValidatorImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;


public class CustomParserImpl implements CustomParserInt {
  static Logger logger = LogManager.getLogger();
  private static String[] line;
  private static final String REGEX = "\\s*,\\s*";

  @Override
  public int[] parseToIntArray(List<String> stringArray) {
    logger.info("Function parseToIntArray(Lust<String> line) called");
    final CustomValidatorImpl customValidator = new CustomValidatorImpl();
    for (String stringArrayElement : stringArray){
      if (customValidator.validateLine(stringArrayElement)) {
        line = stringArrayElement.split(REGEX);
      }
    }

    return Arrays.stream(line)
            .mapToInt(Integer::parseInt)
            .toArray();
  }

}
