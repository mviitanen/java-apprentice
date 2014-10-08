package org.familysearch.solutions.classes;

/**
 * @author viitanenm
 */
public abstract class LivingCreature implements SoundEmitter {
  private String name = "Not loved";
  private Heart heart;

  protected LivingCreature(String name, int beatsPerYears, long lifeSpan) {
    this.setName(name);
    heart = new Heart(lifeSpan, beatsPerYears);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (name == null) {
      throw new IllegalArgumentException("Not loved?");
    }

    this.name = name;
  }

  @Override
  public String say() {
    return "Grunt";
  }

  public String toString() {
    return "My name is " + name + ".\n" +
        "        I live " + heart.getLifeSpan() + " years\n" +
        "        I am " + LivingCreature.class.getName();
  }

  public Heart getHeart() {
    return heart;
  }
}
