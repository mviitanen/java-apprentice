package org.familysearch.solutions.classes;

/**
 * @author viitanenm
 */
public final class Owner extends LivingCreature{
  public Owner(String name, int beatsPerYears, long lifeSpan) {
    super(name, beatsPerYears, lifeSpan);
  }

  @Override
  public String say() {
    return "I am intelligent";
  }

  @Override
  public String toString() {
    return super.toString() +"\n" +
        "        and " + this.getClass().getName();
  }
}
