package by.vantsyferov.first.repository;

import by.vantsyferov.first.entity.IntArray;

import java.util.Map;


public interface IntArrayRepositoryInt {

  void save(IntArray intArray);

  IntArray getById(long id);

  Map<Long, IntArray> getAll();

  void deleteById(long id);

  void clearAll();
}
