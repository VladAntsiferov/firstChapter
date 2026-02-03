package by.vantsyferov.first.util;

public class IdGeneratorUtil {
  static long intArrayIdCounter = 1000;
  static long somethingElseIdCounter = 10000;

  public static long incrementIntArrayId() {
    if(intArrayIdCounter > 9999){
      throw new IllegalStateException("ID pool exhausted");
    }
    return intArrayIdCounter++;
  }

  public static long SomethingElseIdCounter() {
    if(somethingElseIdCounter > 99999){
      throw new IllegalStateException("ID pool exhausted");
    }
    return intArrayIdCounter++;
  }
}