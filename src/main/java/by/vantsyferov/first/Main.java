package by.vantsyferov.first;


import by.vantsyferov.first.entity.IntArray;
import by.vantsyferov.first.factory.IntArrayFactory;
import by.vantsyferov.first.factory.impl.IntArrayFactoryImpl;
import by.vantsyferov.first.service.IntArrayOperation;
import by.vantsyferov.first.service.impl.IntArrayOperationImpl;

import java.io.IOException;

public class Main {
  static IntArrayFactory factory = new IntArrayFactoryImpl();
  static IntArrayOperation intArrayOperation = new IntArrayOperationImpl();


  static void main() throws IOException {
    IntArray intArray = factory.createIntArray(new int[]{});
  }
}
