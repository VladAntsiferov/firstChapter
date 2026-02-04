package by.vantsyferov.first.entity;


import by.vantsyferov.first.exception.CustomIntArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Objects;

public final class IntArray {
  static Logger logger = LogManager.getLogger();
  private long id;
  private int[] array;

  public IntArray(int[] array, long id) {
    this.array = array.clone();
    this.id = id;
    logger.info("IntArray created. Size: {}", array.length);
  }

  public void setArray(int[] newArray) {
    logger.info("setArray(int[] newArray called");
    this.array = newArray.clone();
  }

  public int[] getArray() {
    logger.info("IntArray getArray() called (returning clone)");
    return array.clone();
  }

  public int getSize() {
    logger.info("IntArray getSize() called");
    return array.length;
  }

  public int getByIndex(int index) throws CustomIntArrayException {
    logger.info("IntArray getByIndex(int index) called");
    if (index < 0 || index >= array.length) {
      logger.error("Index out of bound");
      throw new CustomIntArrayException("Index out of bound");
    }
    return array[index];
  }

  public void setByIndex(int index, int number) throws CustomIntArrayException {
    logger.info("IntArray setByIndex(int index, int[] arrayOfInt) called");
    if (index < 0 || index >= array.length) {
      logger.error("Index out of bound");
      throw new CustomIntArrayException("Index out of bound");
    }
    this.array[index] = number;
  }

  public long getId() {
    logger.info("getId() called");
    return id;
  }

  public void setId(long id) {
    logger.info("setId() called");
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    IntArray intArray = (IntArray) o;
    return id == intArray.id && Objects.deepEquals(array, intArray.array);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, Arrays.hashCode(array));
  }

  @Override
  public String toString() {
    return "IntArray{" +
            "id=" + id +
            ", array=" + Arrays.toString(array) +
            '}';
  }

  public int getFirstElement() {
    return array[0];
  }
}
