package org.familysearch.solutions.myenum;

/**
 * @author viitanenm
 */
public enum OutputType {
  FEMALE_TYPE("Female"),
  MALE_TYPE("Male"),
  COUPLE_TYPE("Couple"),
  UNDEFINED("Undefined");

  private String label;

  OutputType(String label) {
    this.label = label;
  }

  public String getLabel() {
    return label;
  }

  public static OutputType fromValue(String value) {
    for (OutputType type : OutputType.values()) {
      if (value.equalsIgnoreCase(type.getLabel())) {
        return type;
      }
    }
    return UNDEFINED;
  }

}
