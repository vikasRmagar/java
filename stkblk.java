
class test7(){
             System.out.println("comstuctor called");

}

{
  System.out.println("instance bolck");

}
static {
    System.out.println("static block ");

}
public class stkblk {
    public static void main(String[] args) {
        test7 t1=new test7 ();
        test7 t2=new test7 ();
        test7 t=new test7 ();

    }
}
