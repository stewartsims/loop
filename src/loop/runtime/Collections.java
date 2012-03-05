package loop.runtime;

import java.util.List;
import java.util.Map;

/**
 * @author dhanji@gmail.com (Dhanji R. Prasanna)
 */
public class Collections {

  public static Object obtain(Object collection, Integer from, Integer to) {
    if (collection instanceof List) {
      List list = (List) collection;

      return list.subList(from, to);
    } else if (collection instanceof String) {
      String string = (String) collection;

      return string.substring(from, to);
    }

    throw new RuntimeException("Arrays not supported");
  }

  public static Object obtain(Object collection, Object exactly) {
    if (collection instanceof List) {
      List list = (List) collection;

      return list.get((Integer) exactly);
    } else if (collection instanceof String) {
      String string = (String) collection;

      return string.charAt((Integer) exactly);
    } else if (collection instanceof Map) {
      Map map = (Map) collection;

      return map.get(exactly);
    }

    throw new RuntimeException("Arrays not supported");
  }

  public static Object sliceFrom(Object collection, Integer from) {
    if (collection instanceof List) {
      List list = (List) collection;

      return list.subList(from, list.size());
    } else if (collection instanceof String) {
      String string = (String) collection;

      return string.substring(from, string.length());
    }

    throw new RuntimeException("Arrays not supported");
  }

  public static Object sliceTo(Object collection, Integer to) {
    if (collection instanceof List) {
      List list = (List) collection;

      return list.subList(0, to);
    } else if (collection instanceof String) {
      String string = (String) collection;

      return string.substring(0, to);
    }

    throw new RuntimeException("Arrays not supported");
  }
}