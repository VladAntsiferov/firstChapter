package by.vantsyferov.first.factory.impl;

import by.vantsyferov.first.exception.FactoryIllegalSizeException;
import by.vantsyferov.first.factory.IntArrayFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.concurrent.ThreadLocalRandom;

public class IntArrayFactoryImpl implements IntArrayFactory {

  static Logger logger = LogManager.getLogger();

  @Override
  public int[] createRandomIntArray(int size) throws FactoryIllegalSizeException {
    logger.info("Function crateRandomIntArray(int size) called");
    if(size <= 0){
      logger.error("Illegal size");
      throw new FactoryIllegalSizeException("Size must be greater than 0");
    }
    return ThreadLocalRandom.current()
            .ints(size, 0, 100)
            .toArray();
  }


  @Override
  public int[] createIntArray(int[] intArray) {
    logger.info("Function createIntArray(OptionalInt intArray) called");
    return intArray;
  }
}
