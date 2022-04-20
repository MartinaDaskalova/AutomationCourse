package dataStructures.homework;

public class ArraySum {
    public static void main(String[] args) {

        int [] numbers = {3,5,6,7,2};
        int sum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            sum +=numbers[i];
        }
        System.out.println("Sum of the array numbers is " + sum);

    }
}
