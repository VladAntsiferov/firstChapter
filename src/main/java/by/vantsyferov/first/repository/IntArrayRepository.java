package by.vantsyferov.first.repository;

import by.vantsyferov.first.entity.IntArray;
import by.vantsyferov.first.specification.IntArraySpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class IntArrayRepository {
  static Logger logger = LogManager.getLogger();

  private static IntArrayRepository instance;

  private List<IntArray> arrays = new ArrayList<>();

  private IntArrayRepository() {
  }

  public static IntArrayRepository getInstance() {
    logger.info("IntArrayRepository instance called");
    if (instance == null) {
      instance = new IntArrayRepository();
    }
    return instance;
  }

  public void add(IntArray array) {
    logger.info("IntArrayRepository add(IntArray array) called");
    arrays.add(array);
  }

  public void remove(IntArray array) {
    logger.info("IntArrayRepository remove(IntArray array) called");
    arrays.remove(array);
  }

  public void removeByIndex(int index) {
    logger.info("IntArrayRepository removeByIndex(int index) called");
    arrays.remove(index);
  }

  public List<IntArray> query(IntArraySpecification specification){
    logger.info("IntArrayRepository query(IntArraySpecification specification) called");
    List<IntArray> result = new ArrayList<>();
    for(IntArray array : arrays){
      if (specification.specify(array)){
        result.add(array);
      }
    }
    return result;
  }

  public void sort(Comparator<IntArray> comparator){
    logger.info("IntArrayRepository sort(Comparator<IntArray> comparator");
    arrays.sort(comparator);
  }

}
