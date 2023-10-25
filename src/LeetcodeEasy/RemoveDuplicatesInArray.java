package LeetcodeEasy;

public class RemoveDuplicatesInArray {

    public  static void print(int[] nums){
        for (int j:nums){
            System.out.println(j);
        }
    }

    public  static  int  removeDups(int[] nums){

        int max=nums.length;
        int j;

        for(int i=0;i<max;i++){

            for(j=1+i;j<max;j++){

                if(nums[i]==nums[j]){

                    for (int k=j;k<max-1;k++){

                        nums[k]=nums[k+1];
                    }
                    j--;
                    max--;
                }

            }
        }


        print(nums);

        return max;
    }

    public static void main(String[] args) {

        int [] nums={0,0,1,1,1,2,2,3,3,4};
        removeDups(nums);


    }
}
