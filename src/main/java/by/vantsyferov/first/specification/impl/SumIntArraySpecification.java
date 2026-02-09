package by.vantsyferov.first.specification.impl;

import by.vantsyferov.first.entity.IntArray;
import by.vantsyferov.first.specification.IntArraySpecification;

public record SumIntArraySpecification(long sum) implements IntArraySpecification {
  @Override
  public boolean specify(IntArray intArray) {
    long result = 0;
    for (int number : intArray.getArray()) {
      result += number;
    }
    return result == sum;
  }
}
