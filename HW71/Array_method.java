package HW71;

public class Array_method {
    public static int[] newArr(int[] fArray, int el){
        int[]newArr = new int[fArray.length +1];
        newArr [0]= el;
        for (int i = 0; i < fArray.length; i++){
            newArr [i+1] = fArray[i];
        }
        return newArr;
    }
    public static int[] newArr(int[] fArray, int el, int pos){
        int[]newArr = new int[fArray.length +1];
        newArr [0]= el;
        for (int i = 0; i < fArray.length+ 1; i++) {
            if (i < pos - 1)
                newArr[i] = fArray[i];
            else if (i == pos - 1)
                newArr[i] = el;
            else
                newArr[i] = fArray[i - 1];
        }
        return newArr;
    }
}
