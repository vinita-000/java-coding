package code.practice;

public class FindMissingNumber {

    public static void main(String[] args) {

        int nums[] = {5,6,8,9,11};

        int l = nums.length;

        for(int i=0; i<l-1; i++){
            if(nums[i]+1!=nums[i+1]){
                System.out.println(nums[i]+1);
            }


        }
    }

}
