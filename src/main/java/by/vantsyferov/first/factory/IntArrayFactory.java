package by.vantsyferov.first.factory;

import by.vantsyferov.first.entity.IntArray;
import by.vantsyferov.first.exception.FactoryIllegalSizeException;

public interface IntArrayFactory {

  IntArray createRandomIntArray(int size, long id) throws FactoryIllegalSizeException;

  IntArray createIntArray(int[] intArray);

  IntArray createEmptyArray();

}
