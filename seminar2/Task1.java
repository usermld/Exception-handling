package seminar2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Input index: ");
        int index = 0;
        // while (index > 9 || index < 0)
        try {
            index = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не целое число!");
        }
        try {
            arr[index] = 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива!");
        }
        finally{
            scanner.close();
        }
    }
}
