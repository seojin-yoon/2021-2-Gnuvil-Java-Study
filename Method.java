package JavaTest;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// "public static void main(String[] args) {}" is default.  
		int result = plus(1,3);
		System.out.println(result);
		
		printTwice("OOH-AHH");
	}
	
	static void printTwice(String text){
		// No return value.
		System.out.println(text);
		System.out.println(text);
	}
	
	static int plus(int x, int y) {
		return x+y;
	}

}


