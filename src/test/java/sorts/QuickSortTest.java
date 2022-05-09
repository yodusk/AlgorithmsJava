package sorts;

import org.algs.sorts.QuickSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;


public class QuickSortTest extends SortTestConfiguration {

    private static final QuickSort sort = new QuickSort();

    @Override
    @Test
    public void test() {
        Assertions.assertEquals(sort.sort(testList1), testList1.stream().sorted().collect(Collectors.toList()));
        Assertions.assertEquals(sort.sort(testList2), testList2.stream().sorted().collect(Collectors.toList()));
        Assertions.assertEquals(sort.sort(testList3), testList3.stream().sorted().collect(Collectors.toList()));
        Assertions.assertEquals(sort.sort(testList4), testList4.stream().sorted().collect(Collectors.toList()));
    }
}
