package by.vantsyferov.first.warehouse.impl;

import by.vantsyferov.first.entity.IntArrayParameters;
import by.vantsyferov.first.warehouse.IntArrayWarehouse;

import java.util.HashMap;
import java.util.Map;

public class IntArrayWarehouseImpl implements IntArrayWarehouse {

  private static IntArrayWarehouseImpl instance;
  private final Map<Long, IntArrayParameters> intArrayParametersMap;

  private IntArrayWarehouseImpl() {
    this.intArrayParametersMap = new HashMap<>();
  }


  public static IntArrayWarehouseImpl getInstance() {
    if (instance == null) {
      instance = new IntArrayWarehouseImpl();
    }
    return instance;
  }

  public void put(Long arrayId, IntArrayParameters parameters) {
    intArrayParametersMap.put(arrayId, parameters);
  }

  public IntArrayParameters get(Long arrayId) {
    return intArrayParametersMap.get(arrayId);
  }

  public void remove(Long arrayId) {
    intArrayParametersMap.remove(arrayId);
  }
}



