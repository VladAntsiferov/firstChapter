
import by.vantsyferov.first.validator.CustomValidatorInt;
import by.vantsyferov.first.validator.impl.CustomValidatorImpl;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CustomValidatorImplTest {
  CustomValidatorInt customValidator = new CustomValidatorImpl();

  @Test
  void shouldValidateString() {
    String input = "1, 2,     3";
    assertTrue(customValidator.validateLineInt(input));
  }

  @Test
  void shouldNotValidateStringWhenStringNotNumbers() {
    String input = "asd";
    assertFalse(customValidator.validateLineInt(input));
  }
}
