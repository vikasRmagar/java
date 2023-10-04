class A{
    int i;
    A(int x){
        i=x;
        System.out.println("in A");
    }
}
class B extends A{
    int j;
    B(int x,int y){
        super(x);
        j=y;
        System.out.println("IN B");

    }
}
class C extends B{
    int k;
    C(int x,int y,int z){
        super(x,y);
        k=z;
        System.out.println("in C");

    }
    void add(){
        System.out.println("I+J+K");
    }
  

}
public class superkey3 {
    public static void main(String[] args) {
      C ob=new C(100,200,300);
        ob.add();  
    }
}
