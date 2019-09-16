package tugas1;
public class EncapTest {

    public static void main(String args[]){
    
        EncapDemo encap = new EncapDemo();
        encap.setName("oyra");
        encap.setAge(35);
        
        System.out.println("Name : " + encap.getName());
        System.out.println("Age : "+ encap.getAge());
    }
}
