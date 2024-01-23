package arrays_programming;

public class MinMaxArray {
    public static void main(String[] args){
            int[] arr = {4, 2, 7, 1, 9, 5, 3};
            if (arr == null || arr.length == 0) {
                System.out.println("Array is empty");
                return;
            }
            int min = arr[0];
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                } else if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println("Smallest number: " + min);
            System.out.println("Largest number: " + max);
    }
}
