package by.vantsyferov.first.warehouse;

import by.vantsyferov.first.entity.IntArrayParameters;

public interface IntArrayWarehouse {
  void put(Long arrayId, IntArrayParameters parameters);

  IntArrayParameters get(Long arrayId);

  void remove(Long arrayId);
}
