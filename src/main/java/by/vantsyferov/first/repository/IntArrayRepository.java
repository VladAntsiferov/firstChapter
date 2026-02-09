package by.vantsyferov.first.repository;

import by.vantsyferov.first.entity.IntArray;
import by.vantsyferov.first.specification.IntArraySpecification;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class IntArrayRepository {
  private static IntArrayRepository instance;

  private List<IntArray> arrays = new ArrayList<>();

  private IntArrayRepository() {
  }

  public static IntArrayRepository getInstance() {
    if (instance == null) {
      instance = new IntArrayRepository();
    }
    return instance;
  }

  public void add(IntArray array) {
    arrays.add(array);
  }

  public void remove(IntArray array) {
    arrays.remove(array);
  }

  public void removeByIndex(int index) {
    arrays.remove(index);
  }

  public List<IntArray> query(IntArraySpecification specification){
    List<IntArray> result = new ArrayList<>();
    for(IntArray array : arrays){
      if (specification.specify(array)){
        result.add(array);
      }
    }
    return result;
  }

  public void sort(Comparator<IntArray> comparator){
    arrays.sort(comparator);
  }

}
