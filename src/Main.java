import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int arrLength = sc.nextInt();
        int[] arr = new int[arrLength];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < arrLength; i++) {
            arr[i] = sc.nextInt();
        }

        boolean swapper;
        for(int i = 0; i < arr.length - 1; i++){
            swapper = false;
            for(int j = 0; j < arr.length - 1 -i; j++){
                if(arr[j] < arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapper = true;
                }
            }
        }

        System.out.println("Mảng sau khi được sắp xêp theo thứ tự giảm dần: "+ Arrays.toString(arr));
    }
}