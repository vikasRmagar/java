class Test4 {
    int i=10;



    
    int j=20;
    Test4(){
        i++;
        j++;

    }
        void show (){
            System.out.println(i);
            System.out.println(j);

        }
}       
public class instance {
    public static void main(String[] args) {
       Test4 t1=new Test4();
       Test4 t2=new Test4();
       Test4 t3=new Test4();
       t1.show();
       t2.show();
       t3.show();
    }
    
}
