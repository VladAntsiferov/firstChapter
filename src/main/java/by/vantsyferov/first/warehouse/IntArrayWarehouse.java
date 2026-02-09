package by.vantsyferov.first.warehouse;

import by.vantsyferov.first.entity.IntArrayParameters;

import java.util.HashMap;
import java.util.Map;

public class IntArrayWarehouse {
  private static IntArrayWarehouse instance;
  private final Map<Long, IntArrayParameters> intArrayParametersMap;

  private IntArrayWarehouse(){
    this.intArrayParametersMap = new HashMap<>();
  }

  public IntArrayWarehouse getInstance() {
    if (instance == null) {
      instance = new IntArrayWarehouse();
    }
    return instance;
  }

  public void put(Long arrayId, IntArrayParameters parameters){
    intArrayParametersMap.put(arrayId, parameters);
  }

  public IntArrayParameters get(Long arrayId){
    return intArrayParametersMap.get(arrayId);
  }

  public void remove(Long arrayId){
    intArrayParametersMap.remove(arrayId);
  }
}



