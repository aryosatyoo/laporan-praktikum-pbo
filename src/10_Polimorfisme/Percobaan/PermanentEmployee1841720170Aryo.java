package Percobaan;

public class PermanentEmployee1841720170Aryo extends Employee1841720170Aryo implements Payable1841720170Aryo {

    private int salary;

    public PermanentEmployee1841720170Aryo(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalaryAryo() {
        return salary;
    }

    public void setSalaryAryo(int salary) {
        this.salary = salary;
    }
    @Override
    public int getPaymentAmountAryo(){
        return (int)(salary+0.05*salary);
    }
    @Override
    public String getEmployeeInfoAryo(){
        String info = super.getEmployeeInfoAryo()+"\n";
        info +="Registered as permanent employee with salary"+salary+"\n";
        return info;
    }
}
