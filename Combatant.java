// Do not modify this code

interface Combatant {
    void attack(Combatant target);
    void takeDamage(int damage);
    void displayStatus();
    boolean isAlive();
    String getName();
    int getHealth();
    int getAttackPower();
}
