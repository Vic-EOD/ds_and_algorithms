package sorting;
public class MergeSort {

	public static void sort(int[] array) {
        sort(array, 0, array.length); 
    }

	public static void sort(int[] array, int start, int end) {
        if(end - start <= 1) {
            return;
        }

        int mid = start + (end - start) / 2;
        sort(array, start, mid);
        sort(array, mid, end);
        merge(array, start, mid, end);
	}

    public static void merge(int[] array, int start, int mid, int end) {
        if(array[mid - 1] <= array[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];

        while(i < mid && j < end) {
            temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++]; 
        }
        
        System.arraycopy(array, i, array, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, array, start, tempIndex);

    }
}
