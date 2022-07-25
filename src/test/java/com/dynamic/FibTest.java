package com.dynamic;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class FibTest {
    
    @Test
    public void simpleCase() {
        Fib f = new Fib();

        
        System.out.println(f.fib(5L, new HashMap<Long, Long>()));        
        System.out.println(f.fib(50L, new HashMap<Long, Long>()));        
    }
}
