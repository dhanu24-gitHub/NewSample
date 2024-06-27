package for3;

public class Amstrong {
	public static void main(String[] args) {
		int num = 153;
		int original = num;
		int temp = 0;
		int result = 0;
		
		while(num > 0) {
			int a = num % 10;
			temp = a * a * a;
			result = result + temp;
			num = num / 10;
		}
		if(result == original) {
			System.out.println("AMSTRONG");
		}
		else {
			System.out.println("NOT AN AMSTRONG");
		}
	}

}
