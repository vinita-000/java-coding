package code.practice;

public class JoinTwoArrays {

    public static void main(String[] args) {

        int a[] ={1,2,3};
        int b[] ={4,5,6};
        int j =0;

        int c[] = new int[a.length+b.length];

        for(int i=0;i<c.length; i++){

            if(i<a.length){
                c[i] = a[i];
            }
            else {
                c[i] =b[j];
                j++;
            }
        }

        for(int i=0;i<c.length; i++){
            System.out.print(c[i]);
        }
    }

}
