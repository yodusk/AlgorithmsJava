package org.algs.sorts;

import java.util.Collection;
import java.util.List;

public interface SortingAlgorithm {

    <T extends Comparable<? super T>> Collection<T> sort(List<T> list);
}
