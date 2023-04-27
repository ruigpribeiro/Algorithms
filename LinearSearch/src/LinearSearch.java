public class LinearSearch {
    public static void main(String[] args) {

        int[] nums = {1, 4, 5, 6, 10, 13, 18, 20};
        int target = 10;

        System.out.println(search(nums, target));

    }

    public static int search(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }
}