import java.util.*;

public class Sorting{
	static int[] numbers = {1,4,2,7,4,9,0,8};
	static int number = numbers.length;
	static int[] helper = new int[number];
	public static void main(String args[]){
		mergesort(0, number - 1);
		//quicksort(0, number-1);

		long sys = System.currentTimeMillis();
		for(int i : numbers){
		System.out.println(i);
		}

		long t = System.currentTimeMillis() - sys;
		System.out.println("***" + t + "***");
	}

	private static void mergesort(int low, int high) {
    if (low < high) {
      int middle = low + (high - low) / 2;
      mergesort(low, middle);
      mergesort(middle + 1, high);
      merge(low, middle, high);
    }
  }

  private static void merge(int low, int middle, int high) {
    for (int i = low; i <= high; i++) {
      helper[i] = numbers[i];
    }

    int i = low;
    int j = middle + 1;
    int k = low;
    while (i <= middle && j <= high) {
      if (helper[i] <= helper[j]) {
        numbers[k] = helper[i];
        i++;
      } else {
        numbers[k] = helper[j];
        j++;
      }
      k++;
    }
    while (i <= middle) {
      numbers[k] = helper[i];
      k++;
      i++;
    }

  }



  private static void quicksort(int low, int high) {
    int i = low, j = high;
    // Get the pivot element from the middle of the list
    int pivot = numbers[low + (high-low)/2];

    // Divide into two lists
    while (i <= j) {
      // If the current value from the left list is smaller then the pivot
      // element then get the next element from the left list
      while (numbers[i] < pivot) {
        i++;
      }
      // If the current value from the right list is larger then the pivot
      // element then get the next element from the right list
      while (numbers[j] > pivot) {
        j--;
      }

      // If we have found a values in the left list which is larger then
      // the pivot element and if we have found a value in the right list
      // which is smaller then the pivot element then we exchange the
      // values.
      // As we are done we can increase i and j
      if (i <= j) {
        exchange(i, j);
        i++;
        j--;
      }
    }
    // Recursion
    if (low < j)
      quicksort(low, j);
    if (i < high)
      quicksort(i, high);
  }

  private static void exchange(int i, int j) {
    int temp = numbers[i];
    numbers[i] = numbers[j];
    numbers[j] = temp;
  }
}