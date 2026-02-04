package by.vantsyferov.first.comparator;

import by.vantsyferov.first.entity.IntArray;

import java.util.Comparator;

public enum IntArrayComparator implements Comparator<IntArray> {
  ID {
    @Override
    public int compare(IntArray o1, IntArray o2) {
      return Long.compare(o1.getId(), o2.getId());
    }
  },
  SIZE{
    @Override
    public int compare(IntArray o1, IntArray o2){
      return Integer.compare(o1.getSize(),o2.getSize());
    }
  },
  FIRST_ELEMENT{
    @Override
    public int compare(IntArray o1, IntArray o2){
      return Integer.compare(o1.getFirstElement(), o2.getFirstElement());
    }
  }

}
