package org.familysearch.solutions.myenum;

/**
 * Demonstrates the creation and use of a custom enum
 *
 * @author viitanenm
 */
public class EnumExample {
  public void showMe(){
    // show how to pick each enum type
    System.out.println("Print picked out couple: " + OutputType.COUPLE_TYPE);


    // show how to convert a String to enum
    System.out.println("Print male label by name: " + OutputType.valueOf("MALE_TYPE").getLabel());

    // show how to iterate the enum values
    System.out.println("Print Male ordinal by value: " + OutputType.fromValue("Male").ordinal());

  }

  public static void main(String[] args){
    new EnumExample().showMe();
  }
}
