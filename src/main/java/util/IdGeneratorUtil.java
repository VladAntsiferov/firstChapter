package util;

public class IdGeneratorUtil {
  public static long idCounter = 0;

  public static long generateId(){
    return idCounter++;
  }
}
