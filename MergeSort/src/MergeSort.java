import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] arr, int left, int right) {
      if (left < right) {
        int middle = (left + right) / 2;
        mergeSort(arr, left, middle);
        mergeSort(arr, middle + 1, right);
        merge(arr, left, middle, right);
      }
    }
  
    public static void merge(int[] arr, int left, int middle, int right) {
      int[] temp = new int[right - left + 1];
      int i = left;
      int j = middle + 1;
      int k = 0;
  
      while (i <= middle && j <= right) {
        if (arr[i] <= arr[j]) {
          temp[k] = arr[i];
          i++;
        } else {
          temp[k] = arr[j];
          j++;
        }
        k++;
      }
  
      while (i <= middle) {
        temp[k] = arr[i];
        i++;
        k++;
      }
  
      while (j <= right) {
        temp[k] = arr[j];
        j++;
        k++;
      }
  
      for (k = 0; k < temp.length; k++) {
        arr[left + k] = temp[k];
      }
    }
  
    public static void main(String[] args) {
      int[] arr = {582, 212, 813, 31231, 7124, 1421, 611, 92, 43, 5, 515, 53125, 125, 2};
      mergeSort(arr, 0, arr.length - 1);
      System.out.println(Arrays.toString(arr));
    }
  }
  