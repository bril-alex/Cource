package HW10;

import java.util.*;

public class String_Method {

    public String_Method(String shoppingList) {
        String shoppingListReplaced = shoppingList.replace(",","");
        String[] split = shoppingListReplaced.split("[, ]");
        Set<String> strUniq = new TreeSet<>(List.of(split));
        for (String resultString : strUniq){
            System.out.println(resultString.substring(0,1).toUpperCase()+resultString.substring(1));
        }
    }
}
