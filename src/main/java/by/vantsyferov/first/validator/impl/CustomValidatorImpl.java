package by.vantsyferov.first.validator.impl;

import by.vantsyferov.first.validator.CustomValidatorInt;

public class CustomValidatorImpl implements CustomValidatorInt {
  private static final String REGEX = "\\d+(,\\s*\\d+)*";

  @Override
  public boolean validateLine(String line) {
    return line != null && line.matches(REGEX);
  }
}
