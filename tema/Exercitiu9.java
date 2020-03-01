package tema;

import java.util.Arrays;

public class Exercitiu9 {
    public static void main(String... args) {



        int[] arr = {20, 20, 30, 40, 50, 50, 50};
        String stringArrayWithoutDuplicates = removeDuplicates(arr);
        System.out.println("stringArrayWithoutDuplicates = " + stringArrayWithoutDuplicates);
    }

    private static String removeDuplicates(int[] arr) {
        Arrays.sort(arr);
        int length = arr.length;

        if (length == 0 || length == 1) {
            return Arrays.toString(arr);
        }
        int j = 0;
        for (int i = 0; i <= length - 2; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j] = arr[i];
                j++;
                System.out.println(arr[i]);
            }
        }
        arr[j] = arr[length - 1];

        String output = "[";
        for (int k = 0; k <= j; k++) {
            if (k == j) {
                output = output + arr[k] + "]";
            } else {
                output = output + arr[k] + ", ";
            }
        }
        return output;
    }
}

