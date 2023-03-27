package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilitiesTest_GroupA {

  @Test
  public void test01() {
    String input = "A Nut for A JaR of tuna";
    boolean output = StringUtilities.isPalindrome(input);
    assertTrue(output);
  }

  @Test
  public void test02() {
    String input = "Is Water Wet?";
    String testValue = "Wet? Water Is";
    String actualOutput = StringUtilities.reverse(input);
    assertNotEquals(testValue, actualOutput);
  }
  
  @Test
  public void test03() {
    String input = "Sir, This Is A Wendy's";
    String processed_reverse = StringUtilities.reverse(input);
    assertNotNull(processed_reverse);
    String processed_toggle = StringUtilities.toggleCase(processed_reverse);
    assertEquals(
      "s'ydneW A sI sihT ,riS",
      processed_reverse
    );
    assertEquals(
      "S'YDNEw a Si SIHt ,RIs",
      processed_toggle
    );
  }
  @Test
  public void test04() {
    String input = "z2a";
    assertEquals("Z2A", StringUtilities.toggleCase(input));
  }

  @Test
  public void test05() {
    String input = "A Programmer";
    int count = 4;
    assertEquals(count, StringUtilities.vowelCounter(input));
  }

  @Test
  public void test06() {
    String input = "E.g.,";
    int count = 3;
    assertEquals(count, StringUtilities.nonAlphaNumericCounter(input));
  }
  
}
