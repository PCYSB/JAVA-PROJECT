package Java;
// 생성자 예제


class gambler{
	int chip; //칩의 개수
	int ChipMoney; //칩 가치
	int round; //게임수
	public gambler(int gameN) {
		round=gameN;
	}
	public gambler(int chip, int ChipMoney) {
		this.chip=chip;
		this.ChipMoney=ChipMoney;
	}
	
	public void ShowGame(gambler A, gambler B) {
		System.out.println("브로커의 게임 진행횟수" +round);
		System.out.println("user1의 현황: 칩의 개수" +(A.chip+100*round)+"환전금액:"+(A.chip+100*round)*(A.ChipMoney));
		System.out.println("user2의 현황: 칩의 개수" +(B.chip-100*round)+"환전금액:"+(B.chip-100*round)*(B.ChipMoney));
	}
	
}

class broker extends gambler{
	
	public broker(int gameN) {
		super(gameN);
		
	}
	

}

public class Game{
	public static void main(String[] args) {
		broker B = new broker(8); //브로커는 총 5판의 게임을 진행함
		gambler user1 = new gambler(800, 10000); //user1은 무조건 게임에서 이김 이길때마다 100의 칩을 얻게됨
		gambler user2 = new gambler(1500, 10000); //user2는 무조건 게임에서 짐 질때마다 100의 칩을 잃게됨
		B.ShowGame(user1, user2);
		
	}
}
