package JavaTest;

public class Elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean job = false;
		boolean house = false;
		boolean car = false;
		
		int asset = 10000000;
		
		int grade = myGrade(job, house, car, asset);
		
		System.out.println("Your grade is : " + grade);
	}
	
	
	static int myGrade(boolean haveJob, boolean haveHouse,
			boolean haveCar, int asset){
		
		// 1 ~ 7
		// int grade = 0; // no need a variable
		
		if (haveHouse) {
			return 1;
		}
		
		else if (haveJob) {
			return 2;
		}
		
		else if (haveCar) {
			return 3;
		}
		
		else {
			
			if (asset >= 100000000) { 
				return 4;
			}
			else if (10000000 <= asset) { //else if (10000000 <= asset && asset < 100000000) 
				return 5;
			}
			else if (1000000 <= asset ) { //else if (1000000 <= asset && asset < 10000000)
				return 6;
			}
			else 
				return 7;
		}
	}
}

