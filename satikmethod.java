
class Test3 {
    int i;
    static int j;
    Test3(){
        i++;
        j++;


    }
        void show (){
            System.out.println(i);
            System.out.println(j);

        }
        static void disp(){
            System.out.println(j);
        }
}       
public class satikmethod {
    public static void main(String[] args) {
       Test3 t1=new Test3();
       Test3 t2=new Test3();
       Test3 t3=new Test3();
       t1.show();
       t2.show();
       t3.show();
       Test3.disp();
       
    }
    
}
