package Latihan;

class Ikan1841720170Aryo {

    public void swim() {
        System.out.println("Ikan bisa berenang");
    }
}

class Piranha1841720170Aryo extends Ikan1841720170Aryo {

    public void swim() {
        System.out.println("Piranha bisa makan daging");
    }
}

public class Fish1841720170Aryo {

    public static void main(String[] args) {
        Ikan1841720170Aryo a = new Ikan1841720170Aryo();
        Ikan1841720170Aryo b = new Piranha1841720170Aryo();
        a.swim();
        b.swim();
    }
}
