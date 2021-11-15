package linear_search;

import java.util.Scanner;

/*
 * @author Fuad
 */
public class Linear_search {

    static Scanner getInput = new Scanner(System.in);

    public static void main(String[] args) {
        int numbers[] = {5, 2, 3, 4, 8, 10, 40, 50};
        int value = getInput.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                System.out.println(value + " is found at index: " + i);
            }
        }
    }
}
