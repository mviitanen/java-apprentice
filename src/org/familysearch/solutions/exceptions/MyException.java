package org.familysearch.solutions.exceptions;

/**
 * @author viitanenm
 */
public class MyException extends RuntimeException {
  private int errorCode;

  public MyException(int errorCode, String message) {
    super(message);
    this.errorCode = errorCode;
  }


  public int getErrorCode() {
    return errorCode;
  }
}
