public class RemoveElement {
    static int[] nums = {1,2,3,5,4,5,6,7,5};
    //remove all occurrences of val
    //return the number of values after we removed val
    static int val = 5;
    static int valCount = 0;

    public static void findVal() {

        for(int i=0; i<nums.length-valCount; i++) {
                if (nums[i] == 5) {
                    int temp = nums[i];
                    nums[i] = nums[nums.length-1-valCount];
                    nums[nums.length-1-valCount] = temp;
                    valCount++;
                    i--;
                }

        }

        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i]);
        }

        //prints out the number of values that are not val
        System.out.println(nums.length - valCount);
    }

}
