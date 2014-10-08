package org.familysearch.solutions.classes;

/**
 * @author viitanenm
 */
public class Dog extends Animal {


  public Dog(String name, int beatsPerYears, long lifeSpan) {
    super(name, beatsPerYears, lifeSpan);
  }

  @Override
  public String say() {
    return "Hau hau!";
  }

  @Override
  public String toString() {
    return super.toString() +"\n" +
        "        I am also a" + Dog.class.getName();
  }


}
