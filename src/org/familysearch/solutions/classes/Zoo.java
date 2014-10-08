package org.familysearch.solutions.classes;

/**
 * @author viitanenm
 */
public class Zoo {
  public void doIt(){
    final LivingCreature owner = new Owner("Bob", 60*60*24*365, 75);
    System.out.println(owner.toString());
    System.out.println();

    Dog dog = new Dog("Zeus", 120*60*24*365, 10);
    dog.setOwner(owner);
    System.out.println(dog);
    System.out.println();

    Animal cat = new Cat("Fido", 120*60*24*365, 10);
    cat.setOwner(dog);
    System.out.println(cat);
  }

  public static void main(String[] args){
    new Zoo().doIt();
  }
}
