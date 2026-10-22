package code.practice;

public class CheckIfBinaryNum {

    public static void main(String[] args) {

        int num = 101001;
        boolean isBinary = true;

        while(num>0){
            if(num%10==1||num%10==0){
                isBinary = true;
            }
            else {
                isBinary = false;
                break;
            }
            num = num/10;
        }

        System.out.println(isBinary);

    }


}
