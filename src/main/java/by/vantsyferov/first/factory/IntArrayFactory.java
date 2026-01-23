package by.vantsyferov.first.factory;

import by.vantsyferov.first.exception.FactoryIllegalSizeException;

import java.io.IOException;
import java.util.OptionalInt;

public interface IntArrayFactory {

  int[] createRandomIntArray(int size) throws FactoryIllegalSizeException;

  int[] createIntArray(int[] intArray);

}
