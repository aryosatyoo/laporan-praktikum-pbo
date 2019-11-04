package Percobaan;

public class InternshipEmployee1841720170Aryo extends Employee1841720170Aryo {
    private int length;
    
    public InternshipEmployee1841720170Aryo(String name, int length){
        this.length = length;
        this.name = name;
    }
    
    public int getLengthAryo(){
        return length;
    }
    
    public void setLength(int length){
        this.length = length;
    }
    @Override
    public String getEmployeeInfoAryo(){
        String info = super.getEmployeeInfoAryo()+"\n";
        info +="Registered as internship employee for "+length+"month /s\n";
        return info;
    }
}
