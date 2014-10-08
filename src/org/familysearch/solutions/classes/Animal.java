package org.familysearch.solutions.classes;

/**
 * @author viitanenm
 */
public abstract class Animal extends LivingCreature {
  private LivingCreature owner; // aggregation


  public Animal(String name, int beatsPerYears, long lifeSpan) {
    super(name, beatsPerYears, lifeSpan);
  }

  @Override
  public String toString() {
    return super.toString() +"\n        and " + Animal.class.getName()
    + "\n        " + (owner != null ? "My owner is " + owner.getName(): "I don't have an owner\n");
  }

  public LivingCreature getOwner() {
    return owner;
  }

  public void setOwner(LivingCreature owner) {
    this.owner = owner;
  }
}
