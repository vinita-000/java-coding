package code.practice;

public class LargestSmallestNums {

    public static void main(String[] args) {
        int num[] = {89,23,63,78,65,99,12,50};
        int max = num[0];
        int min = num [0];

        for(int i=0; i<num.length; i++){


            if(max<num[i]){
                max= num[i];
            }

            if(min>num[i]){
                min = num[i];
        }
    }
        System.out.println("max: "+max+" min: "+min);

}

}
