package it.unical.ingsw.MavenTestjUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ConcatenateTest.class, MultiplyTest.class })
public class AllJunitTest {

}
