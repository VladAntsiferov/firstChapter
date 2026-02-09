package test.vantsyferov.first.comparator;

import by.vantsyferov.first.comparator.IntArrayComparator;
import by.vantsyferov.first.entity.IntArray;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

class IntArrayComparatorTest {

  @Test
  void compareById() {
    IntArray a1 = new IntArray(new int[]{1, 2, 3}, 1);
    IntArray a2 = new IntArray(new int[]{4, 5}, 2);
    IntArray a3 = new IntArray(new int[]{7}, 1);

    assertAll(
            () -> assertTrue(IntArrayComparator.ID.compare(a1, a2) < 0),
            () -> assertTrue(IntArrayComparator.ID.compare(a2, a1) > 0),
            () -> assertEquals(0, IntArrayComparator.ID.compare(a1, a3))
    );
  }

  @Test
  void compareBySize() {
    IntArray a1 = new IntArray(new int[]{1, 2, 3}, 1);
    IntArray a2 = new IntArray(new int[]{4}, 2);
    IntArray a3 = new IntArray(new int[]{9, 8, 7}, 3);

    assertAll(
            () -> assertTrue(IntArrayComparator.SIZE.compare(a1, a2) > 0),
            () -> assertTrue(IntArrayComparator.SIZE.compare(a2, a1) < 0),
            () -> assertEquals(0, IntArrayComparator.SIZE.compare(a1, a3))
    );
  }

  @Test
  void compareByFirstElement() {
    IntArray a1 = new IntArray(new int[]{1, 2, 3}, 1);
    IntArray a2 = new IntArray(new int[]{5, 1}, 1);
    IntArray a3 = new IntArray(new int[]{1, 9}, 3);

    assertAll(
            () -> assertTrue(IntArrayComparator.FIRST_ELEMENT.compare(a1, a2) < 0),
            () -> assertTrue(IntArrayComparator.FIRST_ELEMENT.compare(a2, a1) > 0),
            () -> assertEquals(0, IntArrayComparator.FIRST_ELEMENT.compare(a1, a3))
    );
  }
}