package org.familysearch.javaapprentice.exceptions;

import java.util.Random;

/**
 * @author viitanenm
 */
public class ExceptionRunner {
  public void runIt() {
    for (int i = 0; i < 50; i++) {
      // TODO: catch inside the loop
        maybeThrow(i);
    }

    // TODO: catch outside the loop
      for (int i = 0; i < 50; i++) {
        maybeThrow(i);
      }

    // finally
  }

  private void maybeThrow(int i) {
    Random rnd = new Random();
    final int randomInt = rnd.nextInt(10) + 1;
    final int modifiedI = i % 10;
    System.out.println("Running " + modifiedI + "(" + randomInt + ")");
    if (randomInt == modifiedI) {
      //TODO: throw the exception
    }
  }

  public static void main(String[] args) {
    new ExceptionRunner().runIt();
  }
}
