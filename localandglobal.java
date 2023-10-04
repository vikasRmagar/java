class test23{
    //global variable
    int j=20;
    void show(){
        //local variable 
        int i=10;
        System.out.println(i);
        System.out.println(j);

    }
    void Disp(){
        System.out.println(j);
    }
}

public class localandglobal {
    public static void main(String[] args) {
        test23 t1=new test23();
        t1.show();
        t1.Disp();
    }
}
