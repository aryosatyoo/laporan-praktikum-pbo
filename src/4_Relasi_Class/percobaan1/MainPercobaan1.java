package percobaan1;

public class MainPercobaan1 {

    public static void main(String[] args) {
        Processor p = new Processor("Thinkpad", 3);
        Laptop lp = new Laptop("Intel i5", p);
        lp.Info();

        Processor p1 = new Processor();
        p1.setMerk("Intel i5");
        p1.setCache(4);
        Laptop L1 = new Laptop();
        L1.setMerk("Thinkpad");
        L1.setProc(p1);
        L1.Info();

    }
}
