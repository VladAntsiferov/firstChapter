package by.vantsyferov.first.validator.Impl;

import by.vantsyferov.first.validator.CustomValidatorInt;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class CustomValidatorImpl implements CustomValidatorInt {
  private static final String REGEX = "\\d+(,\\s*\\d+)*";

  @Override
  public boolean validateLine(String line) {
    if (line != null && line.matches(REGEX)) {
      return TRUE;
    }
    return FALSE;
  }
}
