class A{
    int i;
    A (){
        i=10;
        System.out.println("in A ");

    }
}
class B extends A{
    int j;
    B(){
        j=20;
        System.out.println("in B");

    }
        void add(){
            System.out.println(i+j);
        }
}


public class inheritanceconstuctor  {
    public static void main(String[] args) {
        B ob=new B();
        ob.add();

    }
    
}



