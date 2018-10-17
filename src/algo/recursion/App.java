package algo.recursion;

public class App {

    public static void main(String[] args) {
        //reduce(10);
        int[] a = {234,45,2,7,1233,78,35,236,7412,432};
        int[] b = {1,2,3,4,5,6,7,8,9,11,22,33,44,55,66,77,88,99};
        int i = 0;
        int x = 35;

        //recursiveLinearSearch(a,i,x);
        recursiveBinarySearch(b,0,b.length-1,66);
    }

    public static void reduce(int n){
        if (n >= 0){
            reduce(n-1);
        }

        System.out.println("Completed call: " + n);

    }

    public static int recursiveLinearSearch(int[] a, int i, int x){

        if (i > a.length - 1){
            return -1;
        }
        else if (a[i] == x){
            System.out.println("INDEX AT: " + i + ", " + x + " FOUND!!!");
            return i;
        }
        else {
            System.out.println("index at: " + i + " not found...");
            return recursiveLinearSearch(a, i+1, x);
        }
    }

    public static int recursiveBinarySearch(int[] a, int p, int r, int x){
        System.out.println("[ " + p + "..." + r + " ]");
        int q;
        if (p > r){
            return -1;
        }
        else{
            q = (p + r) / 2;
            if (a[q] == x){
                System.out.println("INDEX AT: " + q + ", " + x + " FOUND!!!");
                return q;
            }
            else if (a[q] > x){
                //System.out.println("index at: " + q + " not found...");
                return recursiveBinarySearch(a,p,q-1,x);
            }
            else{
                //System.out.println("index at: " + q + " not found...");
                return recursiveBinarySearch(a,q+1,r,x);
            }
        }
    }
}
