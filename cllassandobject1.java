class account{
    int id;
    String name;
    double balance;
    void create (int id1,String name1,double balance1)
    {
        id=id1;
        name=name1;
        balance=balance1;
        
    }
    void deposite (double amt)
    
    {
        balance=balance+amt;

    }
     void withdraw (double amt)
     { 
        balance=balance-amt;
     }
     void print() {
        System.out.println("95451076866879780");
        System.out.println("id"+id);
        System.out.println("name    "+name);
         
        System.out.println("balance"+balance);


     }
}
    public class cllassandobject1
    { 
        public static void main(String[] args) {
            account ob1=new account();
            ob1.create(1,    "vikas",2000000);
            account ob2=new account();
            ob2.create(2,     "amol",300000);
            ob1.deposite(3000);
            ob2.withdraw(2000);
            ob1.print();
            ob2.print();


        
        }
    }