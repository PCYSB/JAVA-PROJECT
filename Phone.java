
class Friend{
    String name;
    String phNumber;
    public Friend(String name, String phNumber){
        this.name = name;
        this.phNumber=phNumber;


    }
    public void show(){
        System.out.println("이름:"+name+"번호:"+phNumber);
    }

}

public class Phone{
    public static void main(String[] args) {
        Friend F = new Friend("ABC", "000-1111-2222");
        F.show();

    }
}