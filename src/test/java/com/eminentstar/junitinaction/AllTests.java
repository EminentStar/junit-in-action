package com.eminentstar.junitinaction;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * TestSuite of TestSuite
 */
@RunWith(value=Suite.class)
@Suite.SuiteClasses(value={TestSuiteA.class, TestSuiteB.class})
public class AllTests {
}
