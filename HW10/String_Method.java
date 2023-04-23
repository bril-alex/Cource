package HW10;

import java.util.*;

public class String_Method {
    public String_Method(String shoppingList) {
        String shoppingListReplaced = shoppingList.replace(",","");
        String[] split = shoppingListReplaced.split("[, ]");
        Set<String> strUniq = new LinkedHashSet<>(List.of(split));
        String resultString = strUniq.toString().replace(", ", "\n")
                .replaceAll("\\p{Punct}", "");

        System.out.println(resultString);


    }
}
