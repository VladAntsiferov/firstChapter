package by.vantsyferov.first.factory;

import by.vantsyferov.first.exception.FactoryIllegalSizeException;

public interface IntArrayFactory {

  int[] createRandomIntArray(int size) throws FactoryIllegalSizeException;

  int[] createIntArray(int[] intArray);

}
