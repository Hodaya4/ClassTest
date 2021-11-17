import java.util.Scanner;

public class Ex1 {
    public static int secondSmallest(int[] a, int size){
        int temp;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[1];
    }
    public static void main(String[] args){
        int array[] = {3,5,7,9,11};
        System.out.println(secondSmallest(array,5));
    }
}
