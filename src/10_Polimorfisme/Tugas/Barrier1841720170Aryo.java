
package Tugas;

public class Barrier1841720170Aryo implements Destroyable1841720170Aryo{

    private int strength;

    public Barrier1841720170Aryo(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void destroy() {
        strength -= strength * 0.1;
    }

    public void destroyedAryo() {
        destroy();
    }

    public String getBarrierInfo() {
        return "Barrier Strength = " + strength + "\n";
    }
}
