// Write your name here

abstract class Character implements Combatant {
    private String name;
    protected int health;
    private int attackPower;
    private boolean isAlive;

    // Write your code here...
  

    public abstract void specialAbility(Combatant target);
}
