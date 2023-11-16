package ex5;

import java.util.Collection;
import java.util.Random;

public class Sort {
	static Random rand = new Random();
	public static <E> void swap(E[] arr, int i, int j) {
		E temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static <E extends Comparable<E>> void bubble(E[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j].compareTo(arr[j + 1]) == 1) {
					swap(arr, j, j+1);
				}
			}
		}
	}
	private static <E extends Comparable<E>> int partition(E[] a, int l, int r) {
	    int p = l + rand.nextInt(r - l + 1);
		swap(a, p, r);
		 E pivot = a[r];

		int i = l;
		for (int j = l; j <= r - 1; j++) {
			if (a[j].compareTo(pivot)!=1) {
				swap(a, i, j);
				i++;
			}
		}
		swap(a, i, r);
		return i;
	}
	public static <E extends Comparable<E>> void qsort(E[] a, int l, int r) {
		if (l >= r) 
			return;
		int piv = partition(a, l, r);
		qsort(a, l, piv - 1);
		qsort(a, piv + 1, r);
	}
}
