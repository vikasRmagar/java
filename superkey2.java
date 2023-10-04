class A{
    int i;
   A (int x){
        i=x;
        System.out.println("constructor withoutnargs");

    }
}
class B extends A  {
    int i;
    B(int p,int q){
        super(p);
        i=q;
        System.out.println("in B");

    }
    void add (){
        System.out.println(i+super.i);
    }
}
public class superkey2 {s
    public static void main(String[] args) {
        B ob=new B(100,200);
        ob.add();
    }
    
}
