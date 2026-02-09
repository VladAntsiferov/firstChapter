package by.vantsyferov.first.entity;


import by.vantsyferov.first.exception.CustomIntArrayException;
import by.vantsyferov.first.observer.impl.IntArrayObserverImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Objects;

public final class IntArray {
  static Logger logger = LogManager.getLogger();
  private long id;
  private int[] array;
  private IntArrayObserverImpl observer;

  public IntArray(int[] array, long id) {
    this.array = array.clone();
    this.id = id;
    logger.info("IntArray created. Size: {}", array.length);
  }

  public void setArray(int[] newArray) {
    logger.info("setArray(int[] newArray called");
    this.array = newArray.clone();
    notifyObserver();
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
    notifyObserver();
  }

  public long getId() {
    logger.info("getId() called");
    return id;
  }

  public void setId(long id) {
    logger.info("setId() called");
    this.id = id;
    notifyObserver();
  }

  @Override
  public boolean equals(Object o) {
    logger.info("equals(Object o) called");
    if (o == null || getClass() != o.getClass()) return false;
    IntArray intArray = (IntArray) o;
    return id == intArray.id && Objects.deepEquals(array, intArray.array);
  }

  @Override
  public int hashCode() {
    logger.info("hashCode() called");
    return Objects.hash(id, Arrays.hashCode(array));
  }

  @Override
  public String toString() {
    logger.info("toString called");
    return "IntArray{" +
            "id=" + id +
            ", array=" + Arrays.toString(array) +
            '}';
  }

  public int getFirstElement() {
    logger.info("getFirstElement() called");
    return array[0];
  }

  public void setObserver(IntArrayObserverImpl observer) {
    logger.info("setObserver(IntArrayObserverImpl observer) called");
    this.observer = observer;
  }

  private void notifyObserver() {
    if (observer != null) {
      logger.info("Observer notified");
      observer.update(this);
    }
  }
}
