import java.util.Random;
import java.util.Scanner;

public class ArrayExample {

    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arrNumber = new Integer[100];
        System.out.println("The random integer list is : ");
        for (int i = 0; i < 100; i++) {
            arrNumber[i] = rd.nextInt(100);
            System.out.print(arrNumber[i] + " ");
        }
        return arrNumber;
    }

    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arrNumber = arrExample.createRandom();

        Scanner scaner = new Scanner(System.in);
        System.out.println("\nEnter a number as an index: ");
        int number = scaner.nextInt();

        try {
            System.out.println("The value of index " + number + " is: " + arrNumber[number]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("This index is out of bounds ");
        }
    }
}
