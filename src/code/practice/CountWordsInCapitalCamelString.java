package code.practice;

public class CountWordsInCapitalCamelString {

    public static void main(String[] args) {

        String str = "Hello A World bb";
        int count = 0;

        String clean[] = str.trim().split(" ");

        for(String s : clean){
            if(String.valueOf(s.charAt(0)).matches("[A-Z]")){
                count++;
            }
        }

        System.out.println(count);

    }

}
