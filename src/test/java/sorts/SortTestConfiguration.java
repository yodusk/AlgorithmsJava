package sorts;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public abstract class SortTestConfiguration {

  protected static List<Integer> testList1 = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
  protected static List<Integer> testList2 = Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0);
  protected static List<Integer> testList3 =
          Arrays.asList(252, 773, 93, 535, 500, 93, 970, 749, 728, 848, 856, 137, 762, 201, 458);
  protected static List<Integer> testList4 =
          Arrays.asList(
          210, 744, 455, 525, 744, 443, 559, 706, 349, 271, 108, 646, 624, 677, 60, 102, 221, 336,
          658, 792);


  public abstract void test();

}
