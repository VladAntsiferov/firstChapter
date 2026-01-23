package by.vantsyferov.first.entity;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public final class IntArray {
  static Logger logger = LogManager.getLogger();
  private int[] array;
  private final long id;

  public IntArray(int[] array, int id) {
    this.array = array;
    this.id = id;
    logger.info("IntArray created. Size: {}", array.length);
  }


  public void setArray(int[] newArray) {
    logger.info("setArray(int[] newArray called");
    if (newArray == null) {
      logger.error("setArray called with null");
      throw new IllegalArgumentException("Array cannot be null");
    }
    this.array = newArray.clone();
    logger.info("IntArray setArray called, new size: {}", array.length);
  }

  public int[] getArray() {
    logger.info("IntArray getArray() called (returning clone)");
    return array.clone();
  }

  public int getSize() {
    logger.info("IntArray getSize() initialized");
    return array.length;
  }

  public int getByIndex(int index) {
    if (index < 0 || index >= array.length) {
      logger.error("Index out of bound");
      throw new ArrayIndexOutOfBoundsException("Index out of bound");
    }
    logger.info("IntArray getByIndex(int index) initialized");
    return array[index];
  }

  public long getId(){
    return id;
  }

}
