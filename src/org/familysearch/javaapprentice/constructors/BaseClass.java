package org.familysearch.javaapprentice.constructors;

/**
 * @author viitanenm
 */
public class BaseClass {
  private String id;
  private String name;
  private String gender;
  private String eyColor;

// create constructors

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getEyColor() {
    return eyColor;
  }

  public void setEyColor(String eyColor) {
    this.eyColor = eyColor;
  }

 // create toString
}
