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
  private static final String REGEX = "\\s*,\\s*";
  List<Integer> numbers = new ArrayList<>();


  @Override
  public IntArray parseToIntArray(List<String> stringArray) {
    logger.info("Function parseToIntArray(Lust<String> line) called");
    final CustomValidatorImpl customValidator = new CustomValidatorImpl();
    for (String stringArrayElement : stringArray) {
      if (customValidator.validateLine(stringArrayElement)) {
        String[] parts = stringArrayElement.split(REGEX);
        for (String part : parts) {
          numbers.add(Integer.parseInt(part));
        }
      }
    }

    int[] intArray = numbers.stream()
            .mapToInt(Integer::intValue)
            .toArray();

    return new IntArray(intArray, 1);
  }

}
