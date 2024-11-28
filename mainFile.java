//import java.util.Scanner;
//request new command

public class mainFile{
	@FunctionalInterface
	interface Calculate{
		int calculate(int number1, int number2);
	}
	public static void main(String[] args){
		//Scanner scanner = new Scanner(System.in);

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);


		Calculate c = (numeber1, number2) -> {
			int sum =0;
			for(int i = num1; i <= num2; i++) {
				sum += i;
			}
			return sum;
		};

		System.out.println("The sum of numbers between " + num1 + " and " + num2 + " is: " + c.calculate(num1, num2));
	}
}