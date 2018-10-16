package algo.binarysearch;

public class App {

    public static void main(String[] args) {

        int[] array = {11,22,33,44,55,66,77,88,99,111,222,333,444,555,666,777,888,999};

        System.out.println(binarySearch(array,666));

    }

    public static int binarySearch(int[] a, int x){
        int p = 0;
        int r = a.length-1;
        int q;
        while (p <= r){
            q = (p + r)/2;
            if (a[q] > x){
                r = q-1;
            }
            else if (a[q] < x){
                p = q + 1;
            }
            else {
                return q;
            }
        }
        return -1;
    }
}
