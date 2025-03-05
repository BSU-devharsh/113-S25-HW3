## Java Homework Assignment 3: Enhanced Combat Game (Extension of Lab 8)

### Objective:
This assignment builds upon Lab 8, reinforcing your understanding of advanced object-oriented programming concepts in Java, including:
- **Interfaces:** Defining contracts for classes.
- **Abstract Classes:** Providing base functionality and structure.
- **Inheritance:** Creating specialized classes from a general class.
- **Polymorphism:** Using interfaces and abstract classes to work with different object types.
- **Encapsulation:** Protecting data through private attributes and getter/setter methods.
- **Game Logic Implementation:** Designing and implementing a simple combat system.

### Scenario:
You will build an enhanced combat game with different character types, special abilities, and item interactions. The game will involve characters fighting each other, using special abilities, and utilizing items to gain advantages.

### Instructions:

#### 1. Create the ```Combatant``` Interface:
* Create a new Java file named ```Combatant.java```.
* Define an interface named ```Combatant```.
* Add the following method signatures to the ```Combatant``` interface:
  - ```void attack(Combatant target);```
  - ```void takeDamage(int damage);```
  - ```void displayStatus();```
  - ```boolean isAlive();```
  - ```String getName();```
  - ```int getHealth();```
  - ```int getAttackPower();```
* This interface defines the basic behaviors that all combatants must implement.

#### 2. Create the ```Character``` Abstract Class:
* Create a new Java file named ```Character.java```.
* Define an abstract class named ```Character``` that implements the ```Combatant``` interface.
* Add the following private attributes:
  - ```name``` (String)
  - ```attackPower``` (int)
  - ```isAlive``` (boolean)
* Add a protected attribute:
  - ```health``` (int)
* Create a constructor that initializes these attributes.
* Implement all the methods from the ```Combatant``` interface.
* Create an abstract method named ```specialAbility(Combatant target);```. Concrete character classes will implement this method.

#### 3. Create the ```Warrior``` Class:
* Create a new Java file named ```Warrior.java```.
* Define a class named ```Warrior``` that extends the ```Character``` abstract class.
* Create a constructor that calls the ```Character``` constructor.
* Implement the ```specialAbility(Combatant target)``` method. For example, give the warrior a "Power Strike" ability that deals extra damage.

#### 4. Create the ```Mage``` Class:
* Create a new Java file named ```Mage.java```.
* Define a class named ```Mage``` that extends the ```Character``` abstract class.
* Create a constructor that calls the ```Character``` constructor.
* Implement the ```specialAbility(Combatant target)``` method. For example, give the mage a "Healing Aura" ability that heals themselves.

#### 5. Create the ```Item``` Abstract Class:
* Create a new Java file named ```Item.java```.
* Create an abstract class named ```Item```.
* Create a private string called ```name```.
* Create a constructor that sets the name.
* Create a public string getter method for the name.
* Create an abstract method called ```use(Character target)```.

#### 6. Create the ```Potion``` Class:
* Create a new Java file named ```Potion.java```.
* Create a class called ```Potion``` that extends ```Item```.
* Create a private int called ```healAmount```.
* Create a constructor that sets the name and the heal amount.
* Implement the ```use(Character target)``` method so that it heals the target character by the heal amount.

#### 7. Create the ```GameManager``` Class:
* Create a new Java file named ```GameManager.java```.
* In the ```main``` method:
  - Create ```Warrior``` (Hero, Goblin, Orc) and ```Mage``` (Merlin) instances.
  - Create an instance of the ```Potion``` class.
  - Display the initial status of all characters.
  - Implement a ```while``` loop that continues as long as the "Hero" is alive and at least one enemy is alive.
  - Inside the loop:
    + Enemies attack the "Hero."
    + The "Hero" attacks an enemy and uses their special ability.
    + The mage uses their special ability if their health is low.
    + The Hero uses the potion if their health is low.
    + Display the updated status of all characters.
  - After the loop, print ```"Hero wins!"``` or ```"Hero defeated!"``` based on the outcome.

 
### Output:
```
Initial Status:
Hero - Health: 90, Alive: true
Goblin - Health: 60, Alive: true
Orc - Health: 80, Alive: true
Merlin - Health: 70, Alive: true
Goblin attacks Hero for 12 damage.
Orc attacks Hero for 18 damage.
Merlin attacks Hero for 15 damage.
Hero attacks Goblin for 25 damage.
Hero uses Power Strike! Deals 12 bonus damage.
Hero uses Healing Potion and heals for 30.

Updated Status:
Hero - Health: 75, Alive: true
Goblin - Health: 23, Alive: true
Orc - Health: 80, Alive: true
Merlin - Health: 70, Alive: true

Goblin attacks Hero for 12 damage.
Orc attacks Hero for 18 damage.
Merlin attacks Hero for 15 damage.
Hero attacks Goblin for 25 damage.
Hero uses Power Strike! Deals 12 bonus damage.
Hero uses Healing Potion and heals for 30.

Updated Status:
Hero - Health: 60, Alive: true
Goblin - Health: 0, Alive: false
Orc - Health: 80, Alive: true
Merlin - Health: 70, Alive: true

Orc attacks Hero for 18 damage.
Merlin attacks Hero for 15 damage.
Hero attacks Orc for 25 damage.
Hero uses Power Strike! Deals 12 bonus damage.
Hero uses Healing Potion and heals for 30.

Updated Status:
Hero - Health: 57, Alive: true
Goblin - Health: 0, Alive: false
Orc - Health: 43, Alive: true
Merlin - Health: 70, Alive: true

Orc attacks Hero for 18 damage.
Merlin attacks Hero for 15 damage.
Hero attacks Orc for 25 damage.
Hero uses Power Strike! Deals 12 bonus damage.
Hero uses Healing Potion and heals for 30.

Updated Status:
Hero - Health: 54, Alive: true
Goblin - Health: 0, Alive: false
Orc - Health: 6, Alive: true
Merlin - Health: 70, Alive: true

Orc attacks Hero for 18 damage.
Merlin attacks Hero for 15 damage.
Hero attacks Orc for 25 damage.
Hero uses Power Strike! Deals 12 bonus damage.
Hero uses Healing Potion and heals for 30.

Updated Status:
Hero - Health: 51, Alive: true
Goblin - Health: 0, Alive: false
Orc - Health: 0, Alive: false
Merlin - Health: 70, Alive: true

Merlin attacks Hero for 15 damage.
Hero attacks Merlin for 25 damage.
Hero uses Power Strike! Deals 12 bonus damage.
Hero uses Healing Potion and heals for 30.
Merlin uses Healing Aura! Heals for 20 health.

Updated Status:
Hero - Health: 66, Alive: true
Goblin - Health: 0, Alive: false
Orc - Health: 0, Alive: false
Merlin - Health: 53, Alive: true

Merlin attacks Hero for 15 damage.
Hero attacks Merlin for 25 damage.
Hero uses Power Strike! Deals 12 bonus damage.
Hero uses Healing Potion and heals for 30.
Merlin uses Healing Aura! Heals for 20 health.

Updated Status:
Hero - Health: 81, Alive: true
Goblin - Health: 0, Alive: false
Orc - Health: 0, Alive: false
Merlin - Health: 36, Alive: true

Merlin attacks Hero for 15 damage.
Hero attacks Merlin for 25 damage.
Hero uses Power Strike! Deals 12 bonus damage.

Updated Status:
Hero - Health: 66, Alive: true
Goblin - Health: 0, Alive: false
Orc - Health: 0, Alive: false
Merlin - Health: 0, Alive: false

Hero wins!
```
