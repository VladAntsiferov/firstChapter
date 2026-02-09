package by.vantsyferov.first.service;

import by.vantsyferov.first.exception.CustomIntArrayException;
import by.vantsyferov.first.exception.CustomIntArrayOperationException;

public interface IntArrayOperation {
  int max(int[] intArray) throws CustomIntArrayOperationException;

  int min(int[] intArray) throws CustomIntArrayOperationException;

  double sum(int[] intArray) throws CustomIntArrayOperationException;

  double average(int[] intArray) throws CustomIntArrayOperationException;

  int[] bubbleSort(int[] intArray) throws CustomIntArrayOperationException;

  int[] selectionSort(int[] intArray) throws CustomIntArrayOperationException;
}
