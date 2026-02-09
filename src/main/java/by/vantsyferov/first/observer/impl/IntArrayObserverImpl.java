package by.vantsyferov.first.observer.impl;

import by.vantsyferov.first.entity.IntArray;
import by.vantsyferov.first.entity.IntArrayParameters;
import by.vantsyferov.first.exception.CustomIntArrayOperationException;
import by.vantsyferov.first.observer.IntArrayObserver;
import by.vantsyferov.first.service.IntArrayOperation;
import by.vantsyferov.first.service.impl.IntArrayOperationImpl;
import by.vantsyferov.first.warehouse.impl.IntArrayWarehouseImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IntArrayObserverImpl implements IntArrayObserver {
  static Logger logger = LogManager.getLogger();
  @Override
  public void update(IntArray intArray){
    logger.info("Called update(IntArray intArray)");
    IntArrayOperation calculator = new IntArrayOperationImpl();
    IntArrayWarehouseImpl intArrayWarehouse = IntArrayWarehouseImpl.getInstance();
    int min = 0;
    int max = 0;
    double sum = 0;
    double average = 0;
    try {
      min = calculator.min(intArray.getArray());
      max = calculator.max(intArray.getArray());
      sum = calculator.sum(intArray.getArray());
      average = calculator.average(intArray.getArray());
    } catch (CustomIntArrayOperationException e){
      logger.error("Error calculating array parameter: {}", e.getMessage());
    }

    IntArrayParameters parameters = new IntArrayParameters(min,max,sum,average);
    intArrayWarehouse.put(intArray.getId(), parameters);
  }
}
