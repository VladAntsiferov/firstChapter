package by.vantsyferov.first.observer;

import by.vantsyferov.first.entity.IntArray;
import by.vantsyferov.first.exception.CustomIntArrayException;

import java.util.EventObject;

public interface IntArrayObserver{
  void update(IntArray intArray) throws CustomIntArrayException;
}
