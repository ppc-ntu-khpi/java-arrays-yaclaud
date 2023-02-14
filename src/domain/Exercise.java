package domain;

import java.util.Arrays;

public class Exercise {
    public static String Calculate(int size){
        int[] arr = new int[size];

        int centerIndex = size / 2;
        int value = centerIndex;

        for (int i = 0; i < size; i++) {
            arr[i] = value;
            if (i < centerIndex) {
                value--;
            } else {
                value++;
            }
        }
        return Arrays.toString(arr);
    }
}
