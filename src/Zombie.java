public class Zombie extends Monster{
    public static String scream = "Raaaauuughhhh";

    public Zombie(String name) {
        super(name);
        name.concat(" the Zombie");
    }

    public static void main(String[] args) {
        /*Zombie zombie = new Zombie("Bob");
        zombie.attack();*/
        Zombie zombie = new Zombie("Alice");
        zombie.growl();
        zombie.growl(true);
        zombie.growl(false);
    }

    public void attack() {
        super.attackMonster();
        System.out.print(scream);
        growl();
    }

    public void growl (boolean call) {
        if (call) {
            System.out.print(scream.toUpperCase() + " ");
            super.growl();
        } else {
            System.out.print(scream + " ");
            super.growl();
        }
    }

    public void growl () {
        System.out.print(scream + " ");
        super.growl();
    }

}
