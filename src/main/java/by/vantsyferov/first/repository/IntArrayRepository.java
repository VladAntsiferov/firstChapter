package by.vantsyferov.first.repository;

import by.vantsyferov.first.entity.IntArray;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class IntArrayRepository {
  private List<IntArray> arrays = new ArrayList<>();

  public void sort(Comparator<IntArray> comparator){
    arrays.sort(comparator);
  }
}
