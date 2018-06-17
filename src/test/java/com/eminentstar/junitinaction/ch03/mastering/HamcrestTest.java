package com.eminentstar.junitinaction.ch03.mastering;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.hasItem;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class HamcrestTest {
  private List<String> values;

  @Before
  public void setUpList() {
    values = new ArrayList<String>();
    values.add("x");
    values.add("y");
    values.add("z");
  }

  @Test
  public void testWithoutHamcrest() {
    assertTrue(values.contains("one")
      || values.contains("two")
      || values.contains("three"));
  }

  @Test
  public void testWithHamcrest() {
    assertThat(values, hasItem(anyOf(
      equalTo("one"), equalTo("two"), equalTo("three"))
    ));
  }
}
