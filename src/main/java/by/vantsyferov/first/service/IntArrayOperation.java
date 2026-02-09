package by.vantsyferov.first.service;

import by.vantsyferov.first.exception.CustomIntArrayException;

public interface IntArrayOperation {
  int max(int[] intArray);

  int min(int[] intArray);

  double sum(int[] intArray);

  double average(int[] intArray);

  int[] bubbleSort(int[] intArray);

  int[] selectionSort(int[] intArray);
}
