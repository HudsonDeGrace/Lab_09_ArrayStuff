import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        int sum = 0;
        int[] dataPoints = new int[100];
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = gen.nextInt(100) + 1;
        }
        for (int i : dataPoints) {
            System.out.printf("%d | ", i);
        }

        for (int i : dataPoints) {
            sum = sum + i;
        }
        int avg = sum / dataPoints.length;
        System.out.println("\nThe average of the random array dataPoints is: " + avg);

        int num = SafeInput.getRangedInt(in, "Input an integer value", 1, 100);
        int count = 0;
        for (int i : dataPoints) {
            if (i == num) {
                count++;
            }
        }
        System.out.println(num + " was found " + count + " times!");

        num = SafeInput.getRangedInt(in, "Input another integer value", 1, 100);
        int position = 0;
        for (int i : dataPoints) {
            if (i == num) {
                break;
            } else {
                position++;
            }
        }
        if (position == 100) {
            System.out.println(num + " is not found inside the array.");
        } else {
            System.out.println(num + " is found at position " + position + "!");
        }

        int min = 100;
        int max = 0;
        for (int i : dataPoints) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("\nThe minimum value in this array is " + min + " and the maximum value is " + max + "!");
        System.out.println("\nAverage of dataPoints is: " + getAverage(dataPoints));
    }

    public static double getAverage(int[] values) {
        double count = 0;
        for (int i : values) {
            count = count + i;
        }
        return count / values.length;
    }
}