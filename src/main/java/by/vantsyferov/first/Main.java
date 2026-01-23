package by.vantsyferov.first;


import by.vantsyferov.first.factory.IntArrayFactory;
import by.vantsyferov.first.factory.impl.IntArrayFactoryImpl;
import by.vantsyferov.first.parser.CustomParserInt;
import by.vantsyferov.first.parser.impl.CustomParserImpl;
import by.vantsyferov.first.reader.CustomReaderInt;
import by.vantsyferov.first.reader.impl.CustomReaderImpl;
import by.vantsyferov.first.service.IntArrayOperation;
import by.vantsyferov.first.service.impl.IntArrayOperationImpl;

import java.io.IOException;

public class Main {
  static IntArrayFactory factory = new IntArrayFactoryImpl();
  static IntArrayOperation intArrayOperation = new IntArrayOperationImpl();


  static void main() throws IOException {
    CustomReaderInt readerInt = new CustomReaderImpl();
    CustomParserInt customParser = new CustomParserImpl();
    int[] intArray = factory.createIntArray(customParser.parseToIntArray(readerInt.readFile("124")));

    System.out.println(intArrayOperation.max(intArray));
  }
}
