package com.brankajunit.runners;

import com.brankajunit.package2.Package2Test1;
import com.brankajunit.package3.Package3Test1;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        // package2
        Package2Test1.class,
        // package3
        Package3Test1.class
})
public class Runner2 {
}
