package code.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountOccurrencesOfCharactersInString {

    public static void main(String[] args) {
        String str = "Hello World ";
        String str1 = str.trim().toLowerCase().replaceAll("[^A-Za-z]", "");

        Map<Character, Integer> map = new LinkedHashMap<>();
        System.out.println(str1);

        for (int i = 0; i < str1.length(); i++) {

            if (map.containsKey(str1.charAt(i))) {
                map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1);
            } else {
                map.put(str1.charAt(i), 1);
            }
        }
        System.out.println(map);
    }

}
