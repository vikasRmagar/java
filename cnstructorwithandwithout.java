
class Test{
	int i,j;
	/*Test(){
		//i=10;
		//j=20;*/
		Test(int x, int y){
		i=x;
		j=y;
		
		System.out.println( "constructor without args called!!");
		
	}
       void add () {
      	System.out.println(i+j);
   }
}

public class cnstructorwithandwithout {

	public static void main(String[] args) {
     /*  Test t1=new Test();
      t1.add();
      Test t2=new Test();
      t2.add(); */
	  Test t1=new Test(10,20);
      t1.add();
      Test t2=new Test(40,50);
      t2.add();
      }

}

