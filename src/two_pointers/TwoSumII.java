package two_pointers;

import java.util.Arrays;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;

        while(i<j) {
            if((numbers[i]+numbers[j])==target) {
                return new int[] {i+1,j+1};
            }
            else if((numbers[i]+numbers[j])<target)
                i++;
            else if((numbers[i]+numbers[j])>target)
                j--;

        }

        return null;

    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        TwoSumII twoSumII = new TwoSumII();
        System.out.println(Arrays.toString(twoSumII.twoSum(numbers, 3)));
    }

}
