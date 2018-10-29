package algo.quicksort;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        int[] array = {12, 81, 74, 43, 1098, 0, 8, 92, 17, 754, 912, 0, 6, 4, 345, 23, 66};
        quickSort(array, 0, array.length -1);

        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int start, int end){

        if (start < end){
            int q = partition(array, start, end); // index position of the correctly placed value
            quickSort(array, start, q - 1); // sort the left
            quickSort(array, q + 1, end); // sort the right
        }
    }

    public static int partition(int[] array, int start, int end){

        int pivot = array[end]; // pivot is the last element
        int i = start - 1; // counter for swaping the element smaller than pivot and the j.th element --- lastly i+1 will return pivot's index

        for (int j = start; j < end; j++){
            if (array[j] <= pivot){
                i++;
                //swapping starts
                int temp1 = array[j];
                array[j] = array[i];
                array[i] = temp1;
            }
        }

        //swaping pivot to where it belongs
        int temp2 = array[end];
        array[end] = array[i+1];
        array[i+1] = temp2;
        return i+1;
    }

}
