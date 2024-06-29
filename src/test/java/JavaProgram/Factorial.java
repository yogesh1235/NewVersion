package JavaProgram;

public class Factorial {

	public static void main(String[] args) {

		factorialNum(5);
		factorialNum1(6);


	}


	//Approach 1
	public static void factorialNum(int num) {

		int fact = 1;


		for(int i=1; i<=num ; i++) {

			fact = fact*i;

		}

		System.out.println(fact);


	}
	
	
	
	//Approach 2
		public static void factorialNum1(int num) {

			int fact = 1;


			for(int i=num; i>=1 ; i--) {

				fact = fact*i;

			}

			System.out.println(fact);


		}
}
