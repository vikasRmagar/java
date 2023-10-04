
class Test2 {
    int i;
    static int j;
    Test2(){
        i++;
        j++;


    }
        void show (){
            System.out.println(i);
            System.out.println(j);
        }
       
}       
public class staticvaribale {
    public static void main(String[] args) {
       Test2 t1=new Test2();
       Test2 t2=new Test2();
       Test2 t3=new Test2();
       t1.show();
       t2.show();
       t3.show();
      // System.out.println(Test.j);
       
    }
    
}


