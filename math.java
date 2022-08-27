public class math {

    public static void main(String[] args) {
        plus pls = new plus(40, 50,60);
       pls.show();
       minus min = new minus(20,40);
       min.show();
        
        
    
    }
}

class plus{
     private int Value=0;
    plus(int n1, int n2){
        Value = n1+n2;
    
        

    }
    plus(int n1, int n2, int n3){
        Value=n1+n2+n3;
        
    }
    plus(int n1, int n2, int n3, int n4){
        Value=n1+n2+n3+n4;
        
    }
    void show(){
        System.out.println(Value+"입니다.");
    }

}

class minus{
    private int Value=0;
    minus(int n1,int n2){
        Value=n1-n2;

    }
    minus(int n1,int n2,int n3){
        Value=n1-n2-n3;
    }
    minus(int n1, int n2, int n3, int n4){
        Value=n1-n2-n3-n4;
    }
    void show(){
        System.out.println(Value+"입니다.");
    }
}