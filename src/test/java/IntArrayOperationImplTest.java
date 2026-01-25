import by.vantsyferov.first.service.IntArrayOperation;
import by.vantsyferov.first.service.impl.IntArrayOperationImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class IntArrayOperationImplTest {
  IntArrayOperation intArrayOperation = new IntArrayOperationImpl();

  @Test
  public void maxShouldReturn() {
    int[] array = {1, 5, 3, 9, 2};

    int result = intArrayOperation.max(array);

    assertEquals(9, result);
  }

  @Test
  public void maxShouldThrowExceptionWhenArrayIsNull() {
    assertThrows(IllegalArgumentException.class, () ->
            intArrayOperation.max(null)
    );
  }

  @Test
  public void maxShouldThrowExceptionWhenArrayIsEmpty() {
    assertThrows(IllegalArgumentException.class, () ->
            intArrayOperation.max(new int[]{})
    );
  }

  @Test
  public void minShouldReturn() {
    int[] array = {9, 7, 1, 5, 2};

    int result = intArrayOperation.min(array);

    assertEquals(1, result);
  }

  @Test
  public void minShouldThrowExceptionWhenArrayIsNull() {
    assertThrows(IllegalArgumentException.class, () ->
            intArrayOperation.min(null)
    );
  }

  @Test
  public void minShouldThrowExceptionWhenArrayIsEmpty() {
    assertThrows(IllegalArgumentException.class, () ->
            intArrayOperation.min(new int[]{})
    );
  }

  @Test
  public void sumShouldReturn() {
    int[] array = {9, 7, 1, 5, 2};

    double result = intArrayOperation.sum(array);

    assertEquals(24.0, result,0.00001);
  }

  @Test
  public void selectionSortShouldReturn() {

  }

  @Test
  public void bubbleSortShouldReturn() {

  }
}
