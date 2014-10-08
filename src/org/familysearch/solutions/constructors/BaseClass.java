package org.familysearch.solutions.constructors;

/**
 * @author viitanenm
 */
public class BaseClass {
  private String id;
  private String name;
  private String gender;
  private String eyColor;


  /**
   * All fields
   * @param id
   * @param name
   * @param gender
   * @param eyColor
   */
  public BaseClass(String id, String name, String gender, String eyColor) {
    this.id = id;
    this.name = name;
    this.gender = gender;
    this.eyColor = eyColor;
  }

  /**
   * Just the mandatory field
   * @param id
   */
  public BaseClass(String id) {
    this(id, "", "", "");
  }

  /**
   * Two fields
   * @param id
   * @param name
   */
  public BaseClass(String id, String name) {
    this(id, name, "", "");
  }

  /**
   * Three fields
   * @param id
   * @param name
   * @param gender
   */
  public BaseClass(String id, String name, String gender) {
    this(id, name, gender, "");
  }

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

  @Override
  public String toString() {
    return "BaseClass{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", gender='" + gender + '\'' +
        ", eyColor='" + eyColor + '\'' +
        '}';
  }
}
