package com.brankajunit.runners;

import com.brankajunit.package1.Package1Test1;
import com.brankajunit.package2.Package2Test1;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        // package1
        Package1Test1.class,
        // package2
        Package2Test1.class
})
public class Runner1 {
}
