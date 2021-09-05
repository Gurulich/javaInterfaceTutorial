package Methods;

import com.company.arraySum;

public class doMethod implements arraySum {
    @Override
    public void arrayPrintMethod() {
        System.out.println("Sum array elements using do while is:");
    }

    @Override
    public int arrayCountMethod(int[] nums) {
        int i=0;
        int sum=0;
        do{
            sum += nums[i];
            i++;
        }
        while (i<nums.length);
        return sum;
    }
}
