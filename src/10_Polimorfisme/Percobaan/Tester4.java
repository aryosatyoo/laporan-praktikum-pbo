package Percobaan;

public class Tester4 {
    
    public static void main(String[] args){
        Owner1841720170Aryo ow = new Owner1841720170Aryo();
        ElectricityBill1841720170Aryo eBill = new ElectricityBill1841720170Aryo(5, "R-1");
        ow.payAryo(eBill);
        System.out.println("====================");
        
        PermanentEmployee1841720170Aryo pEmp = new PermanentEmployee1841720170Aryo("Dedik", 500);
        ow.payAryo(pEmp);
        System.out.println("====================");
        
        InternshipEmployee1841720170Aryo iEmp = new InternshipEmployee1841720170Aryo("Sunarto", 5);
        ow.showMyEmployeeAryo(pEmp);
        System.out.println("====================");
        ow.showMyEmployeeAryo(iEmp);
        
    }

}
