package JavaTest;

public class ExceptionHandling {
	// try-catch-finally   에러가 발생됐을 떄 사용자에게 알려주기 위해서 사용
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		boolean isSuccess=login("anpan", "1111112");
		if (isSuccess) System.out.println("Login succeeded");
		else System.out.println("Login failed");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Copyright anpan 2021");
		}
	}
	
	static boolean login(String id, String pw) throws Exception {
		
		boolean isNetworkFaild = false;
		boolean invalidId = false;
		boolean invalidPw = true;
		boolean isPwExpired = false;
	
	
		if (isNetworkFaild) throw new Exception("Network Faild");
		else if (invalidId) throw new Exception("Wrong ID");
		else if (invalidPw) throw new Exception("Wrong Password");
		if (isPwExpired) throw new Exception("Change the password");

		return true;
	}
}
