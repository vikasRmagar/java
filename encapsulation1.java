class address{
    private int housenum;
    private String area;
    private String city;
    public int getHousenum() {
        return housenum;
    }
    public void setHousenum(int housenum) {
        this.housenum = housenum;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    
    class student12{
        private int id;
        private String name;
        private address address;

        public void setId(int id){
            if(id<=0){
                
            }
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public address getAddress() {
            return address;
        }

        public void setAddress(address address) {

            this.address = address;
            
        }
             //  this id=id;
               
    }

}
public class encapsulation1 {
    public static void main(String[] args) {
        student12 st12=new student12 ();
        st.setId(100);
        st.setname("abc");
        Address add=new address();
        ad.sethousenum(1001);
        ad.setarea("cidco");
        st.setcity("sambhajinagar");
        System.out.println(st.getId());
        System.out.println(st.setname());
        address ad1=st.getaddress();
        System.out.println(ad1.gethousenum());
        System.out.println(ad1.getarea());
        System.out.println(ad1.getcity());
    
    }
}
