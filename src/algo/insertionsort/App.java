package algo.insertionsort;

public class App {

    public static void main(String[] args) {
        int[] a = insertionSort(new int[] {9,8,3,13,87,12,99});
        for (int i= 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }

    public static int [] insertionSort(int a[]){

        for (int i = 1; i<a.length - 1; i++){
            int element = a[i];

            int j = i - 1;
            while (j >= 0 && a[j] > element){
                a[j+1] = a[j];
                j--;
            }


            a[j+1] = element;

        }

        return a;

    }
}
