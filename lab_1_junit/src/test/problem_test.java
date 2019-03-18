package test;

import org.junit.Assert;
import org.junit.Test;

import lab1.triangle_problem;



public class problem_test {
   @Test
   public void test1()
   {
	   triangle_problem t=new triangle_problem();
	   String res=t.check(10);
	   Assert.assertEquals(res, "yes");
   }
   @Test
   public void test2()
   {
	   triangle_problem t=new triangle_problem();
	   String res=t.check(14);
	   Assert.assertEquals(res, "no");
   }
   @Test
   public void test3()
   {
	   triangle_problem t=new triangle_problem();
	   String res=t.check(100);
	   Assert.assertEquals(res, "no");
   }
}
