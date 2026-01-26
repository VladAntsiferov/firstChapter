package by.vantsyferov.first.repository.impl;

import by.vantsyferov.first.entity.IntArray;
import by.vantsyferov.first.repository.IntArrayRepositoryInt;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class IntArrayRepositoryImpl implements IntArrayRepositoryInt {
  private static final Logger logger = LogManager.getLogger();

  private final Map<Long, IntArray> storage = Collections.synchronizedMap(new HashMap<>());

  public void save(IntArray intArray) {
    storage.put(intArray.getId(), intArray);
    logger.info("IntArray saved in repository. ID: {}", intArray.getId());
  }

  public IntArray getById(long id) {
    return storage.get(id);
  }

  public Map<Long, IntArray> getAll() {
    return new HashMap<>(storage); // возвращаем копию, чтобы защитить внутреннее хранилище
  }

  public void deleteById(long id) {
    storage.remove(id);
    logger.info("IntArray with ID {} removed from repository", id);
  }

  public void clearAll() {
    storage.clear();
    logger.info("Repository cleared");
  }
}
