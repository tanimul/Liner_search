package linear_search;

import java.util.Scanner;

/*
 * @author Fuad
 */
public class Linear_search {

    static Scanner getInput = new Scanner(System.in);

    public static void main(String[] args) {
        int numbers[] = {5, 2, 3, 4, 8, 10, 40, 50};
        System.out.println("Enter a value: ");
        int value = getInput.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                System.out.println(value + " is found at index: " + i);
                break;
            }
            if (i == numbers.length - 1) {
                System.out.println("Element not found!");
            }
        }
    }
}
