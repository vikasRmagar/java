class Test{
    int i,j;
    void setvalues(int x,int y){
        i=x;
        j=y;
    }
    void add(){
        System.out.println(i+j);

    }
}

public class alocatememoryobj {
    public static void main(String[] args) {
        Test t1=new Test();
        t1.setvalues(10,20);
        Test t2=new Test();
        t2.setvalues(30,40);
        t1.add();
        t2.add();
        }
}
