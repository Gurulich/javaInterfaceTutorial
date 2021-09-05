package Methods;

import com.company.arraySum;

public class forMethod implements arraySum {
    @Override
    public int arrayCountMethod(int[] nums) {
        int sum=0;
        for (int i=0; i< nums.length; i++){
            sum += nums[i];

        }
        return sum;
    }

    @Override
    public void arrayPrintMethod() {
        System.out.println("Sum array elements using for is:");
    }
}
