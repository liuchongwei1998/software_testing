package test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Test;

import printprime.printPrimes;

public class problem_test {
   @Test
  public void test()
  {
	printPrimes prime = new printPrimes();
	
	String out = new String("Prime: 2\r\nPrime: 3\r\nPrime: 5\r\nPrime: 7\r\n");
    ByteArrayOutputStream tmp = new ByteArrayOutputStream();
    System.setOut(new PrintStream(tmp));
	prime.printPrimes(4);
	
	Assert.assertEquals(out,tmp.toString());

  }
}
