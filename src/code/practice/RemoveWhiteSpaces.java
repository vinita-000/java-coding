package code.practice;

public class RemoveWhiteSpaces {

    public static void main(String[] args) {
        String str = "abc pqr x yz";
        char clean[] = str.trim().toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : clean) {
            if (!Character.isWhitespace(c)) {
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
