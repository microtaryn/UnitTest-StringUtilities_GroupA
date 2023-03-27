package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilitiesTest_GroupA {

  @Test
  public void test01() {
    String input = "racecar";
    boolean ouput = StringUtilities.isPalindrome(input);
    assertTrue(ouput);
  }

  @Test
  public void test02() {
    String input = null;
    boolean ouput = StringUtilities.isPalindrome(input);
    assertFalse(ouput);

    input = "";
    ouput = StringUtilities.isPalindrome(input);
    assertFalse(ouput);
  }

  
  @Test
  public void test03() {
    String input = "a nut for a jar of tuna";
    boolean ouput = StringUtilities.isPalindrome(input);
    assertTrue(ouput);

    input = "taco cat.";
    ouput = StringUtilities.isPalindrome(input);
    assertFalse(ouput);
  }

  @Test
  public void test04() {
    String input = "Is Water Wet?";
    String testValue = "Wet? Water Is";
    String actualOutput = StringUtilities.reverse(input);
    assertNotEquals(testValue, actualOutput);
  }

  @Test
  public void test05() {
    assertEquals("gOOD mORNING!", StringUtilities.toggleCase("Good Morning!"));
  }

  @Test
  public void test06() {
    assertEquals("a2z", StringUtilities.toggleCase("A2Z"));
    assertEquals("Z2A", StringUtilities.toggleCase("z2a"));
  }

  @Test
  public void test07() {
    String input = "Sir, This Is A Wendy's";
    String processed_reverse = StringUtilities.reverse(input);
    assertNotNull(processed_reverse);
    String processed_toggle = StringUtilities.toggleCase(processed_reverse);
    assertEquals("s'ydneW A sI sihT ,riS", processed_reverse);
    assertEquals("S'YDNEw a Si SIHt ,RIs", processed_toggle);
  }

  @Test
  public void test08() {
    String input = "A Programmer";
    int count = 4;
    assertTrue(StringUtilities.vowelCounter(input) > 0);
    assertEquals(count, StringUtilities.vowelCounter(input));
  }

  @Test
  public void test09() {
    String input = "E.g.,";
    int count = 3;
    assertTrue(StringUtilities.nonAlphaNumericCounter(input) > 0);
    assertEquals(count, StringUtilities.nonAlphaNumericCounter(input));
  }

  @Test
  public void test10() {
    String input = "There's No Place Like 127.0.0.1";
    assertTrue(StringUtilities.nonAlphaNumericCounter(input) > 0);
    assertEquals(8, StringUtilities.nonAlphaNumericCounter(input));
  }
}
