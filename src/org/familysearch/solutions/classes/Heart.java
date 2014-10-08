package org.familysearch.solutions.classes;

/**
 * @author viitanenm
 */
public class Heart {
  private long lifeSpan;
  private int beatsPerYears;
  private int age;

  public Heart(long lifeSpan, int beatsPerYears) {
    this.lifeSpan = lifeSpan;
    this.beatsPerYears = beatsPerYears;
  }

  public long getLifeSpan() {
    return lifeSpan;
  }

  public int getBeatsPerYears() {
    return beatsPerYears;
  }

  public int yearsToBeat() {
    return (int) lifeSpan / beatsPerYears;
  }

  public int getAge() {
    return age;
  }


}
