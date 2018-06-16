package com.eminentstar.junitinaction;

import static junit.framework.Assert.*;

import org.junit.Test;

public class CalculatorTest {

  @Test
  public void testAdd() {
    Calculator calculator = new Calculator();
    double result = calculator.add(10, 50);
    assertEquals(60, result, 0);
  }

}
