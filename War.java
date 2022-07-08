package Java;

class Tank
{
  int bomb=10;
  int kill;
  int gold;
  
  public void Tanked(int B) //입력토대 인자값저장
  {
    bomb-=B;
    kill=B*100;
    gold=B*100000;
  }
  public void TankShow()
  {
    System.out.println("남은 포탄:" + bomb);
    System.out.println("죽인 병사수" + kill);
    System.out.println("포탄 비용" + gold);
  }
}

class Soldier
{
  int people;
  int HurtPeople;
  
  public Soldier(int P)
  {
    people=P;
    
  }
  public void SoldierKill(Tank T)
  {
    people-=T.kill;
    HurtPeople=T.kill/5;      
    
  }
  public void SoldierShow()
  {
    System.out.println("총 병사 : " + people);
    System.out.println("부상자 : " + HurtPeople);      
    System.out.println("전투가능인원 : " + (people-HurtPeople));
  }
}

public class War {  
public static void main(String args[]) 
{ 
  Tank Bomb = new Tank();
  Soldier Citizen = new Soldier(1000);
  Soldier Citizen2 = new Soldier(2000);
  Bomb.Tanked(4);
  Citizen.SoldierKill(Bomb);  
  Bomb.Tanked(3);
  Citizen2.SoldierKill(Bomb);

  
  System.out.println("탱크의 현황:");
  Bomb.TankShow();
  System.out.println("병사의 현황:");
  Citizen.SoldierShow();   
  Citizen2.SoldierShow();
} 
}