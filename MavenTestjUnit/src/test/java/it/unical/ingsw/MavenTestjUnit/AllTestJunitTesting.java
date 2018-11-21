package it.unical.ingsw.MavenTestjUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ countATest.class, squareTest.class })
public class AllTestJunitTesting {

}
