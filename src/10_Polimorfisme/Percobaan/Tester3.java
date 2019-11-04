package Percobaan;

public class Tester3 {

    public static void main(String[] args) {
        PermanentEmployee1841720170Aryo pEmp = new PermanentEmployee1841720170Aryo("Dedik", 500);
        InternshipEmployee1841720170Aryo iEmp = new InternshipEmployee1841720170Aryo("Sunarto", 5);
        ElectricityBill1841720170Aryo eBill = new ElectricityBill1841720170Aryo(5, "A-1");
        
        Employee1841720170Aryo e[] = {pEmp, iEmp};
        
        Payable1841720170Aryo p[] = {pEmp, eBill};
        
//        Employee1841720170Aryo e2[] = {pEmp, iEmp, eBill};
    }

}
