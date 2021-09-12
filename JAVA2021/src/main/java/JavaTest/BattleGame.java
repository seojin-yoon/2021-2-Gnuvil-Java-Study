package JavaTest;

public class BattleGame { // 클래스 사용하는 이유: 틀을 다시 쓰기 위해서 
							// ex> 날짜 바꿀 수 있는 도장틀
							

	static class Player{ // 클래스 이름은 대문자로 한다
		
		String name;
		int hp;
		int atk;
		
		public Player(String name, int hp, int atk) { // constructor with 3 parameter
			// 생성자: 리턴값이 없는 메소드
			this.name = name;
			this.hp = hp;
			this.atk = atk; //
		}
		
		
		public void attack(Enemy enemy) { // enemy라는 객체를 참조하겠다
			System.out.println(this.name+" attacks!");
			
			enemy.hp = enemy.hp - this.atk; 
			System.out.println(enemy.name+"'s damaged! "+enemy.name +"'s hp :" + enemy.hp);
		}
		
		public boolean isAlive() {
			if (hp<=0) {
				return false;
			}
			else {
				return true;
			}
		}
		
	}
	
	static class Enemy{ 
		String name;
		int hp;
		int atk;
		
		public Enemy(String name, int hp, int atk) { // constructor with 3 parameter
			// 생성자: 리턴값이 없는 메소드
			this.name=name;
			this.hp=hp;
			this.atk=atk;
		}
		
		
		public void attack(Player player) { // player라는 객체를 참조하겠다
			System.out.println(this.name+" Attacks!");
			
			player.hp = player.hp - this.atk; 
			System.out.println(player.name+"'s damaged! "+ player.name+"'s hp :" + player.hp);
		}
		
		public boolean isAlive() {
			if (hp<=0) {
				return false;
			}
			else {
				return true;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player = new Player("Anpanman",1000, 100); // creating object named "player"
												// 클래스 이름    인스턴스 이름    = new  생성자(,,)
												// 클래스 이름과 생성자 이름은 같다
												// 인스턴스 이름은 소문자로 한다
												
		Enemy enemy = new Enemy("Bacteriaman",1100, 150); // creating object named "enemy"
		
		while (player.isAlive() && enemy.isAlive()) {
			player.attack(enemy);
			if (!enemy.isAlive()) 
				break;
			enemy.attack(player);
		}
		
		if (player.isAlive()) {
			System.out.println(player.name +" Win!! ");
		
		}
		else {
			System.out.println(enemy.name + " Win!! ");
		}
	}

}
