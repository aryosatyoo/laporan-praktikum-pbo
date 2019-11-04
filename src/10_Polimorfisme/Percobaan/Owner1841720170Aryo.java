package Percobaan;

public class Owner1841720170Aryo {

    public void payAryo(Payable1841720170Aryo p) {

        System.out.println("Total Payment : " + p.getPaymentAmountAryo());
        if (p instanceof ElectricityBill1841720170Aryo) {
            ElectricityBill1841720170Aryo eb = (ElectricityBill1841720170Aryo) p;
            System.out.println("" + eb.getBillInfoAryo());
        } else if (p instanceof PermanentEmployee1841720170Aryo) {
            PermanentEmployee1841720170Aryo pe = (PermanentEmployee1841720170Aryo) p;
            pe.getEmployeeInfoAryo();
            System.out.println("" + pe.getEmployeeInfoAryo());

        }
    }
    
    public void showMyEmployeeAryo(Employee1841720170Aryo e){
        System.out.println(""+e.getEmployeeInfoAryo());
        if(e instanceof PermanentEmployee1841720170Aryo)
            System.out.println("You have to pay her / him monthly !!! ");
        else
            System.out.println("No need to pay him / her ");
        }
    }