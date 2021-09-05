package Methods;

import com.company.arraySum;

public class whileMethod implements arraySum {
    @Override
    public int arrayCountMethod(int[] nums) {
        int i=0;
        int sum=0;
        while (i<nums.length){
            sum += nums[i];
            i++;
        }
        return sum;
    }

    @Override
    public void arrayPrintMethod() {
        System.out.println("Sum array elements using while is:");
    }
}
