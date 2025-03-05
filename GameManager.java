// Do not modify this code

public class GameManager {
    public static void main(String[] args) {
        Warrior hero = new Warrior("Hero", 90, 25);
        Mage mage = new Mage("Merlin", 70, 15);
        Warrior goblin = new Warrior("Goblin", 60, 12);
        Warrior orc = new Warrior("Orc", 80, 18);
        Potion healingPotion = new Potion("Healing Potion", 30);

        System.out.println("Initial Status:");
        hero.displayStatus();
        goblin.displayStatus();
        orc.displayStatus();
        mage.displayStatus();

        while (hero.isAlive() && (goblin.isAlive() || orc.isAlive() || mage.isAlive())) {
            if (goblin.isAlive()) {
                goblin.attack(hero);
            }
            if (orc.isAlive()) {
                orc.attack(hero);
            }
            if(mage.isAlive()){
                mage.attack(hero);
            }

            if (hero.isAlive()) {
                if (goblin.isAlive()) {
                    hero.attack(goblin);
                    hero.specialAbility(goblin);
                } else if (orc.isAlive()) {
                    hero.attack(orc);
                    hero.specialAbility(orc);
                } else if (mage.isAlive()){
                    hero.attack(mage);
                    hero.specialAbility(mage);
                }
            }
            if (hero.getHealth() < 60) {
                healingPotion.use(hero);
            }
            if(mage.getHealth() < 50 && mage.isAlive()){
                mage.specialAbility(mage);
            }

            System.out.println("\nUpdated Status:");
            hero.displayStatus();
            goblin.displayStatus();
            orc.displayStatus();
            mage.displayStatus();
            System.out.println();
        }

        if (hero.isAlive()) {
            System.out.println("Hero wins!");
        } else {
            System.out.println("Hero defeated!");
        }
    }
}
