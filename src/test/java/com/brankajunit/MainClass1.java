package com.brankajunit;

import com.brankajunit.runners.Runner1;
import com.brankajunit.runners.Runner2;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

public class MainClass1 {
    public static void main(String[] args) {
        JUnitCore junit = new JUnitCore();
        junit.addListener(new TextListener(System.out));

        System.out.println("Runner1 tests:");
        junit.run(Runner1.class);
        System.out.println("#################################");

        System.out.println("Runner2 tests:");
        junit.run(Runner2.class);
        System.out.println("#################################");
    }
}
