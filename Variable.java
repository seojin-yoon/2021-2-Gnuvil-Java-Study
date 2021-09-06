package JavaTest;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 100;
		int num2 = 45892;
		
		int plus = num + num2;
		int minus = num - num2;
		int multiply = num * num2;
		int divide = num2 / num; //quotient
		int modulo = num2 % num; //remainder
		
		String myString = "Hi,";
		String addString = " my brother!";
		char myChar = 'A';
		long myBigNumber = 34359786876199L;
		float myfloat = 3432.123f;
		
		System.out.println(num);
		System.out.println(myString);
		System.out.println(myChar);
		System.out.println(myBigNumber);
		System.out.println(myfloat);
		
		System.out.println(plus);
		System.out.println(minus);
		System.out.println(multiply);
		System.out.println(divide);
		System.out.println(modulo);
		
		System.out.println(myString + addString);
	}

}

