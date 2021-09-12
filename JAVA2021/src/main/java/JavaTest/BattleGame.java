package JavaTest;

public class BattleGame { // Ŭ���� ����ϴ� ����: Ʋ�� �ٽ� ���� ���ؼ� 
							// ex> ��¥ �ٲ� �� �ִ� ����Ʋ
							

	static class Player{ // Ŭ���� �̸��� �빮�ڷ� �Ѵ�
		
		String name;
		int hp;
		int atk;
		
		public Player(String name, int hp, int atk) { // constructor with 3 parameter
			// ������: ���ϰ��� ���� �޼ҵ�
			this.name = name;
			this.hp = hp;
			this.atk = atk; //
		}
		
		
		public void attack(Enemy enemy) { // enemy��� ��ü�� �����ϰڴ�
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
			// ������: ���ϰ��� ���� �޼ҵ�
			this.name=name;
			this.hp=hp;
			this.atk=atk;
		}
		
		
		public void attack(Player player) { // player��� ��ü�� �����ϰڴ�
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
												// Ŭ���� �̸�    �ν��Ͻ� �̸�    = new  ������(,,)
												// Ŭ���� �̸��� ������ �̸��� ����
												// �ν��Ͻ� �̸��� �ҹ��ڷ� �Ѵ�
												
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
