class Test {
    String getmsg(String name){
        String msg="hello"+name;
        return msg;
   }
   int add(int x,int y){
    int z;
    z=x+y;
    return z;

   }
}
public class methdwithargs {
    public static void main(String[] args) {
        Test t1=new Test();
        String s1=t1.getmsg("vikas");
        int a=t1.add(100,200);
        System.out.println(s1);
        System.out.println(a);


    }
}
