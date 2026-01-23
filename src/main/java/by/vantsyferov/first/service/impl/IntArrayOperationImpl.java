package by.vantsyferov.first.service.impl;

import by.vantsyferov.first.service.IntArrayOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IntArrayOperationImpl implements IntArrayOperation {
  static Logger logger = LogManager.getLogger();

  @Override
  public int max(int[] intArray) {
    logger.info("Calculating max of array");
    if (intArray == null || intArray.length == 0) {
      throw new IllegalArgumentException("Array is null or empty");
    }

    int max = intArray[0];
    for (int value : intArray) {
      if (value > max) {
        max = value;
      }
    }
    return max;
  }

  @Override
  public int min(int[] intArray) {
    logger.info("Calculating min of array");
    if (intArray == null || intArray.length == 0) {
      throw new IllegalArgumentException("Array is null or empty");
    }

    int min = intArray[0];
    for (int value : intArray) {
      if (value < min) {
        min = value;
      }
    }
    return min;
  }

  @Override
  public double sum(int[] intArray) {
    logger.info("Calculating sum of array");

    if (intArray == null || intArray.length == 0) {
      throw new IllegalArgumentException("Array is null or empty");
    }

    double sum = 0;
    for (int value : intArray) {
      sum += value;
    }
    return sum;
  }

  @Override
  public int[] bubbleSort(int[] intArray) {
    logger.info("Sorting array using bubble sort");
    if (intArray == null || intArray.length == 0) {
      throw new IllegalArgumentException("Array is null or empty");
    }

    int[] intArrayClone = intArray.clone();
    int n = intArrayClone.length;

    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (intArrayClone[j] > intArrayClone[j + 1]) {
          int temp = intArrayClone[j];
          intArrayClone[j] = intArrayClone[j + 1];
          intArrayClone[j + 1] = temp;
        }
      }
    }

    return intArrayClone;
  }

  @Override
  public int[] selectionSort(int[] intArray) {
    logger.info("Sorting array using selection sort");
    if (intArray == null || intArray.length == 0) {
      throw new IllegalArgumentException("Array is null or empty");
    }

    int[] intArrayClone = intArray.clone();
    int n = intArrayClone.length;

    for (int i = 0; i < n - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (intArrayClone[j] < intArrayClone[minIndex]) {
          minIndex = j;
        }
      }
      int temp = intArrayClone[i];
      intArrayClone[i] = intArrayClone[minIndex];
      intArrayClone[minIndex] = temp;
    }

    return intArrayClone;
  }
}

