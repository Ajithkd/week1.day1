package Week1.Day1;

public class ArmstrongNumber {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 153;
		int calculated = 0, remainder ,original;
		original = num;
		while (num>0) {
			remainder=num%10;
			num=num/10;
			calculated=calculated+(remainder*remainder*remainder);
			
		}
		if (calculated==original) {
			System.out.println(original+"is Amstrong number");
			
		}
		else {
			System.out.println("not an Amstrong number");
		}
	
}
}