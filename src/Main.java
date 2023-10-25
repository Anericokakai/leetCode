public class Main {

    public static void moveZeroes(int[] nums) {
        int max=nums.length;

        int temp=nums.length;



        for(int i= 0;i<max;i++){

            if(nums[i]==0){
                temp--;

                for(int j=i;j<max-1;j++){

                    nums[j]=nums[j+1];
                }
                i--;

                max--;
            }

        }

        if(nums.length!=temp){
            for(int k=temp;k<nums.length;k++){
                nums[k]=0;
            }

        }

    }
    public static void main(String[] args) {
       int[] nums={0,1,0,3,12};
        moveZeroes(nums);
    }
}