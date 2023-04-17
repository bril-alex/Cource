package HW9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = size(Size.SMALL);
        System.out.println(s);
        String m = size(Size.MEDIUM);
        System.out.println(m);
        String l = size(Size.LARGE);
        System.out.println(l);
        String xl = size(Size.EXTRA_LARGE);
        System.out.println(xl);
        System.out.println("Choose one please");
    }
    public static String size (Size size){
        switch (size){
            case SMALL -> {
                return Size.SMALL.toString();
            }
            case MEDIUM -> {
                return Size.MEDIUM.toString();
            }
            case LARGE -> {
                return Size.LARGE.toString();
            }
            case EXTRA_LARGE -> {
                return Size.EXTRA_LARGE.toString();
            }
        }
        return "Size is not presented";
    }
}
