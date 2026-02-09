package by.vantsyferov.first.validator.impl;

import by.vantsyferov.first.validator.CustomValidatorInt;

public class CustomValidatorImpl implements CustomValidatorInt {
  private static final String INTEGER_LINE_VALIDATION_REGEX = "\\d+(,\\s*\\d+)*";

  @Override
  public boolean validateLineInt(String line) {
    return (line != null && line.matches(INTEGER_LINE_VALIDATION_REGEX));
  }
}
