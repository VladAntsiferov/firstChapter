package test.vantsyferov.first.service;

import by.vantsyferov.first.exception.CustomIntArrayException;
import by.vantsyferov.first.service.IntArrayOperation;
import by.vantsyferov.first.service.impl.IntArrayOperationImpl;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class IntArrayOperationImplTest {
  IntArrayOperation intArrayOperation = new IntArrayOperationImpl();

  @Test
  void maxShouldReturn() {
    int[] array = {1, 5, 3, 9, 2};

    int result = intArrayOperation.max(array);

    assertEquals(9, result);
  }

  @Test
  void maxShouldThrowExceptionWhenArrayIsNull() {
    assertThrows(IllegalArgumentException.class, () ->
            intArrayOperation.max(null)
    );
  }

  @Test
  void maxShouldThrowExceptionWhenArrayIsEmpty() {
    assertThrows(IllegalArgumentException.class, () ->
            intArrayOperation.max(new int[]{})
    );
  }

  @Test
  void minShouldReturn() {
    int[] array = {9, 7, 1, 5, 2};

    int result = intArrayOperation.min(array);

    assertEquals(1, result);
  }

  @Test
  void minShouldThrowExceptionWhenArrayIsNull() {
    assertThrows(IllegalArgumentException.class,
            () -> intArrayOperation.min(null)
    );
  }

  @Test
  void minShouldThrowExceptionWhenArrayIsEmpty() {
    assertThrows(IllegalArgumentException.class,
            () -> intArrayOperation.min(new int[]{})
    );
  }

  @Test
  void sumShouldReturn() throws CustomIntArrayException {
    int[] array = {9, 7, 1, 5, 2};

    double result = intArrayOperation.sum(array);

    assertEquals(24.0, result, 0.00001);
  }

  @Test
  void selectionSortShouldReturn() throws CustomIntArrayException {
    int[] input = {9, 7, 1, 5, 2};
    int[] result = intArrayOperation.selectionSort(input);

    assertArrayEquals(result, new int[]{1, 2, 5, 7, 9});
  }

  @Test
  void bubbleSortShouldReturn() throws CustomIntArrayException {
    int[] input = {9, 7, 1, 5, 2};
    int[] result = intArrayOperation.bubbleSort(input);

    assertArrayEquals(result, new int[]{1, 2, 5, 7, 9});
  }

  @Test
  void selectionSortShouldThrowExceptionWhenArrayIsEmpty() {
    int[] input = {};

    IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> intArrayOperation.selectionSort(input)
    );

    assertEquals("Array is null or empty", exception.getMessage());
  }

  @Test
  void bubbleSortShouldThrowExceptionWhenArrayIsEmpty() {
    int[] input = {};

    IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> intArrayOperation.bubbleSort(input)
    );

    assertEquals("Array is null or empty", exception.getMessage());
  }

  @Test
  void selectionSortShouldThrowExceptionWhenArrayIsNull() {
    IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> intArrayOperation.selectionSort(null)
    );

    assertEquals("Array is null or empty", exception.getMessage());
  }

  @Test
  void bubbleSortShouldThrowExceptionWhenArrayIsNull() {
    IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> intArrayOperation.selectionSort(null)
    );

    assertEquals("Array is null or empty", exception.getMessage());
  }

}
