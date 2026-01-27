package by.vantsyferov.first.entity;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

}
