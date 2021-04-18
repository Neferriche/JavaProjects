package lesson06.homework06;

public class LightHealer extends SuperHero {

    protected int magic;

    public LightHealer (String name, int attack, int health, int defence, int magic) {
        super(name, attack, health, defence);

        this.magic = magic;
    }

    public void healOther(SuperHero hero) {
        float healingPoints = (float) (this.magic * hero.health * 0.0026);
        if (!hero.isDead()) {
            hero.health += healingPoints;
            System.out.println(this.name + " healed " + hero.name + " >> " + healingPoints + " hp. HP " + hero.name + " = " + hero.health);
        } else {
            System.out.println(this.name + " can't heal dead " + hero.name);
        }
    }

}

