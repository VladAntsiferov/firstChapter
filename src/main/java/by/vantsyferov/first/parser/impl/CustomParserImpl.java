package by.vantsyferov.first.parser.impl;

import by.vantsyferov.first.entity.IntArray;
import by.vantsyferov.first.parser.CustomParserInt;
import by.vantsyferov.first.validator.impl.CustomValidatorImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;


public class CustomParserImpl implements CustomParserInt {
  static Logger logger = LogManager.getLogger();
  private static final String COMMA_SEPARATION_REGEX = "\\s*,\\s*";


  @Override
  public int[] parseToIntArray(List<String> stringArray) {
    logger.info("Function parseToIntArray(Lust<String> line) called");
    List<Integer> numbers = new ArrayList<>();
    final CustomValidatorImpl customValidator = new CustomValidatorImpl();
    for (String stringArrayElement : stringArray) {
      if (customValidator.validateLineInt(stringArrayElement)) {
        String[] parts = stringArrayElement.split(COMMA_SEPARATION_REGEX);
        for (String part : parts) {
          numbers.add(Integer.parseInt(part));
        }
      }
    }

    return numbers.stream()
            .mapToInt(Integer::intValue)
            .toArray();
  }

}
