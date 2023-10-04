class test34{
   // global variable
    int i;
    test34 (int i){
        this .i=i;
    } 
    void Disp(){
        System.out.println(i);
    }
    
}

public class thiskeyword {
    public static void main(String[] args) {
        test34 t1=new test34(10);
        t1.Disp();

    }
}
