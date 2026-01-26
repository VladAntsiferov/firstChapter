import by.vantsyferov.first.entity.IntArray;
import by.vantsyferov.first.parser.CustomParserInt;
import by.vantsyferov.first.parser.impl.CustomParserImpl;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CustomParserImplTest {
  CustomParserInt customParser = new CustomParserImpl();

  @Test
  void shouldParseValidStringsToIntArray() throws IOException {
    List<String> input = List.of(
            "1,2,3",
            "4,5"
    );
    IntArray intArray = customParser.parseToIntArray(input);
    int[] result = intArray.getArray();
    assertArrayEquals(result, new int[]{1, 2, 3, 4, 5});
  }

  @Test
  void shouldIgnoreInvalidLines() throws IOException {
    List<String> input = List.of(
            "1,2",
            "abc",
            "3,4"
    );

    IntArray intArray = customParser.parseToIntArray(input);
    int[] result = intArray.getArray();

    assertArrayEquals(
            new int[]{1, 2, 3, 4},
            result
    );
  }

  @Test
  void shouldReturnEmptyArrayForEmptyInput() throws IOException {
    List<String> input = List.of();

    IntArray intArray = customParser.parseToIntArray(input);
    int[] result = intArray.getArray();

    assertNotNull(result);
    assertEquals(0, result.length);
  }
}
