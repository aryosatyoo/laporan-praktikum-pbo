package Tugas;

public abstract class Zombie1841720170Aryo implements Destroyable1841720170Aryo {

    protected int health;
    protected int level;

    public String getZombieInfoAryo() {
        return "\nHealth = " + health + "\nLevel = " + level;
    }

    public abstract void healAryo();

    @Override
    public abstract void destroyedAryo();
}
