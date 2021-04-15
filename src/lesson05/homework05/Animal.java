package lesson05.homework05;

public abstract class Animal {

    public String species;
    public float maxRun;
    public float maxSwim;
    public float maxJump;

    Animal(String species, float maxRun, float maxSwim, float maxJump) {
        this.species = species;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.maxJump = maxJump;
    }

    protected boolean run(float dist) {
        return (dist <= maxRun);
    }

    protected boolean swim(float dist) {
        return (dist <= maxSwim);
    }

    protected boolean jump(float height) {
        return (height <= maxJump);
    }
}
