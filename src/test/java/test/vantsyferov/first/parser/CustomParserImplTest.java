package test.vantsyferov.first.parser;

import by.vantsyferov.first.parser.CustomParserInt;
import by.vantsyferov.first.parser.impl.CustomParserImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CustomParserImplTest {
  CustomParserInt customParser = new CustomParserImpl();

  @Test
  void shouldParseValidStringsToIntArray() {
    List<String> input = List.of(
            "1,2,3",
            "4,5"
    );
    int[] result = customParser.parseToIntArray(input);
    assertArrayEquals(result, new int[]{1, 2, 3, 4, 5});
  }

  @Test
  void shouldIgnoreInvalidLines() {
    List<String> input = List.of(
            "1,2",
            "abc",
            "3, 4"
    );

    int[] result = customParser.parseToIntArray(input);

    assertArrayEquals(
            new int[]{1, 2, 3, 4},
            result
    );
  }

  @Test
  void shouldReturnEmptyArrayForEmptyInput() {
    List<String> input = List.of();

    int[] result = customParser.parseToIntArray(input);

    assertEquals(0, result.length);
  }
}
