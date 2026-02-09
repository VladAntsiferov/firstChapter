package by.vantsyferov.first.specification.impl;

import by.vantsyferov.first.entity.IntArray;
import by.vantsyferov.first.specification.IntArraySpecification;

public record IdGapIntArraySpecification(Long minId, Long maxId) implements IntArraySpecification {

  @Override
  public boolean specify(IntArray intArray) {
    return intArray.getId() >= minId && intArray.getId() <= maxId;
  }
}
