package code.practice;

public class CheckIfSubStringIsPresent {

    public static void main(String[] args) {

        String str1 = "This is beautiful flower";
        String str2 = "beautiful";
        boolean b = false;

//        if(str1.contains(str2)){
//            System.out.println("True");
//        }
//        else {
//            System.out.println("False");
//        }
        int n = str1.length();
        int m = str2.length();
        for (int i = 0; i < n - m; i++) {
            int j = 0;
            while (j < m && str1.charAt(i + j) == str2.charAt(j)) {
                j++;
            }
            if (j == m) {
                b = true;
            }
        }
        if (b) {
            System.out.println("SubString is present");
        } else {
            System.out.println("SubString is not present");
        }
    }

}
