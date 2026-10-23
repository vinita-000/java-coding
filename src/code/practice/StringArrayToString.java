package code.practice;

public class StringArrayToString {
    public static void main(String[] args) {
        String str[] = {"Hello", " ", "World"};
        String result = "";
        for (String s : str) {
            result = result + s;
        }
        System.out.println(result);

    }
}
