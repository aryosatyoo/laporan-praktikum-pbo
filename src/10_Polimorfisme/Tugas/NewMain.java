package Tugas;

public class NewMain {

    public static void main(String[] args) {
        WalkingZombie1841720170Aryo wz = new WalkingZombie1841720170Aryo(100, 1);
        JumpingZombie1841720170Aryo jz = new JumpingZombie1841720170Aryo(100, 2);
        Barrier1841720170Aryo b = new Barrier1841720170Aryo(100);
        Plant1841720170Aryo p = new Plant1841720170Aryo();
        System.out.println("" + wz.getZombieInfoAryo());
        System.out.println("" + jz.getZombieInfoAryo());
        System.out.println("" + b.getBarrierInfo());
        System.out.println("---------------------");
        for (int i = 0; i < 4; i++) {
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }
        System.out.println("" + wz.getZombieInfoAryo());
        System.out.println("" + jz.getZombieInfoAryo());
        System.out.println("" + b.getBarrierInfo());
    }
}
