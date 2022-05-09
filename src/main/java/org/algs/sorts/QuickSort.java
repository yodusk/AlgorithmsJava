package org.algs.sorts;

import java.util.Collection;
import java.util.List;

public class QuickSort implements SortingAlgorithm {

  @Override
  public <T extends Comparable<? super T>> Collection<T> sort(List<T> list) {
    return quickSort(list, 0, list.size() - 1);
  }

  private <T extends Comparable<? super T>> Collection<T> quickSort(
      List<T> list, Integer low, Integer high) {
    if (low < high) {
      var p = findPivot(list, low, high);
      quickSort(list, low, p - 1);
      quickSort(list, p + 1, high);
    }
    return list;
  }

  private <T extends Comparable<? super T>> Integer findPivot(
      List<T> list, Integer low, Integer high) {
    var x = list.get(high);
    var i = low - 1;
    for (var j = low; j <= high - 1; j++) {
      if (list.get(j).compareTo(x) <= 0) {
        i++;
        swap(list, i, j);
      }
    }
    i++;
    swap(list, i, high);
    return i;
  }

  private <T extends Comparable<? super T>> void swap(List<T> list, Integer i, Integer j) {
    var temp = list.get(j);
    list.set(j, list.get(i));
    list.set(i, temp);
  }
}
