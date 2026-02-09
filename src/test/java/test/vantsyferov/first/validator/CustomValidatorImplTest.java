package test.vantsyferov.first.validator;


import by.vantsyferov.first.validator.CustomValidatorInt;
import by.vantsyferov.first.validator.impl.CustomValidatorImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

class CustomValidatorImplTest {

  private CustomValidatorInt validator;

  @BeforeEach
  void setUp() {
    validator = new CustomValidatorImpl();
  }

  @Test
  void validateLineIntValidInputShouldReturnTrue() {
    assertAll(
            () -> assertTrue(validator.validateLineInt("1")),
            () -> assertTrue(validator.validateLineInt("1,2,3")),
            () -> assertTrue(validator.validateLineInt("10, 20,30")),
            () -> assertTrue(validator.validateLineInt("5,   6,7"))
    );
  }

  @Test
  void validateLineIntInvalidInputShouldReturnFalse() {
    assertAll(
            () -> assertFalse(validator.validateLineInt(null)),
            () -> assertFalse(validator.validateLineInt("")),
            () -> assertFalse(validator.validateLineInt("1,")),
            () -> assertFalse(validator.validateLineInt(",1")),
            () -> assertFalse(validator.validateLineInt("1,,2")),
            () -> assertFalse(validator.validateLineInt("a,b,c")),
            () -> assertFalse(validator.validateLineInt("1 2 3"))
    );
  }
}