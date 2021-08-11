package week1.day1;

public class Fibonacciseries {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		int range =8, firstNumber =0, secondNumber =1 ,sum;
		System.out.println("Fibonacci series are :");
		for (int i=1; i<=range; i++) {
			System.out.println(+firstNumber);
			sum = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = sum;
			}
		
	}

}
