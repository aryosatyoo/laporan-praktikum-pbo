package Tugas;

public class WalkingZombie1841720170Aryo extends Zombie1841720170Aryo {

    public WalkingZombie1841720170Aryo(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public void healAryo() {
        if (level == 1) {
            health += health * 0.2;
        } else if (level == 2) {
            health += health * 0.3;
        } else if (level == 3) {
            health += health * 0.4;
        }
    }

    public void destroyed() {
        health -= health * 0.19;
    }

    public String getZombieInfoAryo() {
        String info = "Walking Zombie Data = ";
        info += super.getZombieInfoAryo() + "\n";
        return info;
    }

    @Override
    public void destroyedAryo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
