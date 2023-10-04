
class same{
    int i,j;
     same (int x,int y){
        i=x;
        j=y;
        System.out.println("constuctor overloading ");
     }
   same (){
    i=23;
    j=45;
    System.out.println("construtor with args" );
   }
   void add(){
    System.out.println(i+j);
   }
    }
public class consoverlo {
    public static void main(String[] args) {
        same s1=new same();
        s1.add();
        same s2= new same(30,40);
        s2.add();
    }
    
}
