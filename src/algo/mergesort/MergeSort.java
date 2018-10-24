package algo.mergesort;

public class MergeSort {

    public static void sort(int[] array){
        sort(array, 0, array.length -1);
    }

    public static void sort(int[] array, int start, int end){
        if (end <= start){
            return; // when p == r stop traversing
        }

        int mid = (start + end)/2;
        sort(array, start, mid); // sort left half
        sort(array,mid+1, end); // sort right half
        merge(array, start, mid, end); // merge sorted sub-arrays
    }

    public static void merge(int[] array, int start, int mid, int end){

        int[] tempArray = new int[end - start + 1];

        int left_cnt = start; // index counter for left array
        int right_cnt = mid + 1; // index counter for right array
        int k = 0;

        while (left_cnt <= mid && right_cnt <= end){

            if (array[left_cnt] < array[right_cnt]){
                tempArray[k] = array[left_cnt];
                left_cnt++;
            }
            else{
                tempArray[k] = array[right_cnt];
                right_cnt++;
            }
            k++;
        } // after this loop, both arrays can be considered sorted

        if (left_cnt <= mid){ // after while loop if it still less than mid, means left must be sorted already
            while (left_cnt <= mid){
                tempArray[k] = array[left_cnt];
                left_cnt++;
                k++;
            }
        }
        else if (right_cnt <= end){ // if it still less than end, means right must be sorted
            while (right_cnt <= end){
                tempArray[k] = array[right_cnt];
                right_cnt++;
                k++;
            }

        }

        for (int i = 0; i < tempArray.length; i++){ // copying tempArray to actual array
            array[start + i] = tempArray[i];
        }
    }
}
