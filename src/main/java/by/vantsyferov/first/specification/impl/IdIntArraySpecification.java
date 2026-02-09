package by.vantsyferov.first.specification.impl;

import by.vantsyferov.first.entity.IntArray;
import by.vantsyferov.first.specification.IntArraySpecification;

public record IdIntArraySpecification(Long id) implements IntArraySpecification {

  @Override
  public boolean specify(IntArray intArray) {
    return intArray.getId() == id;
  }
}
