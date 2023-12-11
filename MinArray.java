import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        int[] arr;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int size = sc.nextInt();
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhap phan tu thu "+(i+1) + " : ");
            arr[i] = sc.nextInt();
        }
        int index = minArrIndex(arr);
        System.out.println("Gia tri nho nhat cua mang la: "+ arr[index]);

    }
    public static int minArrIndex(int[] arr){
        int min = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
}
