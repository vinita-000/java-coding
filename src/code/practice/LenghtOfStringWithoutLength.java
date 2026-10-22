package code.practice;

public class LenghtOfStringWithoutLength {

    public static void main(String[] args) {
        String str = "Vinita";
        int count = 0;

        for(char e : str.toCharArray()){
            count++;
        }

        System.out.println(count);
    }

}
