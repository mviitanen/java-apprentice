package org.familysearch.solutions.classes;

/**
 * @author viitanenm
 */
public class Cat extends Animal {
  public Cat(String name, int beatsPerYears, long lifeSpan) {
    super(name, beatsPerYears, lifeSpan);
  }

  @Override
  public String say() {
    return "Miau...?";
  }

  @Override
  public String toString() {
    return super.toString() +"\n" +
        "        I am also a " + Cat.class.getName();
  }
}
