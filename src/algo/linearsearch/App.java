package algo.linearsearch;

public class App {

    public static void main(String[] args) {

        int[] array = {123,3546,1234,2,567,3,346,84,234,7,100,4,3,99,47};

        System.out.println(linearSearch(array,100)); //10
        System.out.println(linearSearch(array,999999)); //-1
    }

    public static int linearSearch(int[] a, int x){

        for (int i = 0 ; i < a.length ; i++){
            if (a[i] == x){
                return i;
            }
        }
        return -1;
    }
}
