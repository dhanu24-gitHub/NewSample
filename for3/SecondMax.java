package for3;

public class SecondMax {
	public static void main(String[] args) {
		int[] nums = {24, 6, 56, 89, 42, 98, 79};
		
		int max = nums[0];
		int secMax = max;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > max) {
				secMax = max;
				max = nums[i];
			}
//			if(nums[i] > secMax && nums[i] != max) {
//				secMax = nums[i];
//			}
		}
		System.out.println("Max = " + max);
		System.out.println("Sec Max = " + secMax);
	}

}
