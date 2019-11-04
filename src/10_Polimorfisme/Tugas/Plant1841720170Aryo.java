package Tugas;

public class Plant1841720170Aryo {

    public void doDestroy(Destroyable1841720170Aryo d) {
        if (d instanceof WalkingZombie1841720170Aryo) {
            WalkingZombie1841720170Aryo wz = (WalkingZombie1841720170Aryo) d;
            wz.destroyed();
        } else if (d instanceof JumpingZombie1841720170Aryo) {
            JumpingZombie1841720170Aryo jz = (JumpingZombie1841720170Aryo) d;
            jz.destroyed();
        } else if (d instanceof Barrier1841720170Aryo) {
            Barrier1841720170Aryo b = (Barrier1841720170Aryo) d;
            b.destroyedAryo();
        }
    }
}
