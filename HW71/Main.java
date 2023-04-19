package HW71;

import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int [] fArray = new int[10];
        for (int i = 0; i < fArray.length; i++){
            fArray[i] = random.nextInt(1000);
        }
        System.out.println("Original Array:\n" + Arrays.toString(fArray));
        int [] newArr = Array_method.newArr(fArray, random.nextInt(1000));
        System.out.println("New Array without position specified:\n" + Arrays.toString(newArr));
        int [] newArr1 = Array_method.newArr(fArray, random.nextInt(1000),4);
        System.out.println("New Array with the position specified - position 4:\n" + Arrays.toString(newArr1));
    }
}
