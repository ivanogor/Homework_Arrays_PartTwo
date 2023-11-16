import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray(30);
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        System.out.println(Arrays.toString(arr) + "\n");

        task1(arr);
        task2(arr);
        task3(arr);
        task4(reverseFullName);
    }
    public static int[] generateRandomArray(int arrayLength){
        int[] arr = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = random.nextInt(100_000)+ 100_000;
        }
        return arr;
    }

    public static void task1(int[] arr){
        int costAmount = 0;

        for (int number: arr){
            costAmount += number;
        }

        System.out.println(costAmount);
    }

    public static void task2(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int number: arr){
            if(number < min){
                min = number;
            }
            if (number > max){
                max = number;
            }
        }

        System.out.println("Максимальное значение равно " + max + ". А минимальное - " + min);
    }

    public static void task3(int[] arr){
        float costAmount = 0;

        for (int number: arr){
            costAmount += number;
        }

        System.out.println(Math.round(costAmount / arr.length));
    }

    public static void task4(char[] reverseFullName){
        for(int i = reverseFullName.length - 1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }
    }
}