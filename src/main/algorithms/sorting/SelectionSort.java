package sorting;
public class SelectionSort {
	public static void sort(int[] array){
        for(int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for(int i = 1; i <= lastUnsortedIndex; i++) {
                if(array[i] > array[largest]) {
                    largest = i; 
                }
            }
            int temp = array[lastUnsortedIndex];
            array[lastUnsortedIndex] = array[largest];
            array[largest] = temp;
        }
	}
}
