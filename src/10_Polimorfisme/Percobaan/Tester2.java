package Percobaan;

public class Tester2 {
    
    public static void main(String[] args){
        PermanentEmployee1841720170Aryo pEmp = new PermanentEmployee1841720170Aryo("Dedik", 500);
        Employee1841720170Aryo e;
        e = pEmp;
        
        System.out.println(""+e.getEmployeeInfoAryo());
        System.out.println("========================");
        System.out.println(""+pEmp.getEmployeeInfoAryo());
    }
    
}
