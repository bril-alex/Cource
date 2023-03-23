import java.util.Random;

public class lesson3_HW {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[20];
        System.out.print("Full array:  ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Array within >5 and <45:  ");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5 && arr[i] < 45) {
                sum += arr[i];
            } else {
                continue;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println("Sum of them = " + sum);
        System.out.print ("Even numbers from the array:  ");
       for (int even: arr){
           if (even%2 == 0 && even>0)
               System.out.print(even + " ");
       }
    }
}
