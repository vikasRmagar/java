class A{
    void show(){
        System.out.println("in base class");

    }
}
class B extends A{
    void disp(){
        System.out.println("in derived");
    }
}

public class inheritance1 {
    public static void main(String[] args) {
        B ob=new B();
        ob.show();
        ob.disp();
    }
    
}
