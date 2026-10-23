package code.practice;

public class CamelCase {
    public static void main(String[] args) {
        String str = "hello worlD from java";
        String clean[] = str.toLowerCase().split(" ");
        StringBuilder result = new StringBuilder();
        for (String s : clean) {
            result.append(String.valueOf(s.charAt(0)).toUpperCase()).append(s.substring(1)).append(" ");
        }
        System.out.println(result);
    }
}
