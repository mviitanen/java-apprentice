package org.familysearch.solutions.exceptions;

import java.util.Random;

/**
 * @author viitanenm
 */
public class ExceptionRunner {
  public void runIt() {
    for (int i = 0; i < 50; i++) {
      try {
        maybeThrow(i);
      } catch (MyException e) {
        System.out.println(e.getErrorCode() + ":" + e.getMessage());
      }
    }

    try {
      for (int i = 0; i < 50; i++) {
        maybeThrow(i);
      }
    } catch (MyException e) {
      System.out.println(e.getErrorCode() + ":" + e.getMessage());
    }
    finally {
      System.out.println("Done!");
    }
  }

  private void maybeThrow(int i) {
    Random rnd = new Random();
    final int randomInt = rnd.nextInt(10) + 1;
    System.out.println("Running " + i % 10 + "(" + randomInt + ")");
    if (randomInt == i % 10) {
      throw new MyException(404, "Bad thing " + i % 10 + "(" + randomInt + ")");
    }
  }

  public static void main(String[] args) {
    new ExceptionRunner().runIt();
  }
}
