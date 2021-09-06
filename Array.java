package JavaTest;

import java.util.Random;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Q: Why use a array? 
		// A: Because there is need to use "many variables of the same type" 
		// "easily". 
		

		Random random = new Random(); 
		int money = 10000;
		
		while (money >= 1000) { // until the losing all money....
			// buy lotto 
			money -= 1000;

			// nextInt(100) : 0~99
			int num = random.nextInt(100);
			int lottoPrize = buyLotto(num);
			
			System.out.println("Your Number is : "+ num + " / Lotto prize money is : " + buyLotto(num));
			money += lottoPrize;
			System.out.println("Your Money is "+ money);
		}
		
		
		System.out.println("You lose..");
	}
	
	
	static int buyLotto(int number) {
		
		int[] lotto = new int[100];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = 0;
		}
		
		lotto[2] = 1000;
		lotto[47] = 5000;
		lotto[88] = 10000;

		
		return lotto[number];
	}
}

