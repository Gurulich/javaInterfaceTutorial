package Methods;

import com.company.arraySum;

public class foreachMethod implements arraySum {
    @Override
    public void arrayPrintMethod() {
        System.out.println("Sum array elements using foreach is:");
    }

    @Override
    public int arrayCountMethod(int[] nums) {
        int sum=0;
        for (int i:nums) {
            sum+=i;
        } return sum;
    }
}
