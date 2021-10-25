public class Monster {
    private String name;
    private int damage;

    public Monster() {

    }
    public Monster(String name) {
        this.name = name;
        this.damage = 5;
        System.out.println("Monster " + name + " the Zombie was created");
    }

    /*public Monster(String name, int damage) {
        this.name = name;
        this.damage = damage;
        System.out.println("Monster " + name + " was created");
    }*/

    public void growl() {
        System.out.println(name + " the Zombie growled");
    }

    public void attackMonster() {
        System.out.println("Monster " + name + "the Zombie attacked with damage " + this.damage);
    }
}
