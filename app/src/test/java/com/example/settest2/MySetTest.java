package com.example.settest2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MySetTest {

    @Test
    public void test1() {

        MySet mySet = new MySet();
        boolean actualValue = mySet.add(10);
        boolean expectedValue = true;
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void test2() {

        MySet mySet = new MySet();
        mySet.add(10);
        boolean actualValue = mySet.isEmpty();
        boolean expectedValue = false;
        assertEquals(expectedValue, actualValue);


}

    @Test
    public void test3() {

        MySet mySet = new MySet();
        mySet.add(10);
        mySet.add(20);
        int actualValue = mySet.size();
        int expectedValue = 2;
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void test4() {

        MySet mySet = new MySet();
        mySet.add(10);
        mySet.add(20);
        int actualValue = mySet.size();
        int expectedValue = 2;
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void test5() {

        MySet mySet = new MySet();
        mySet.add(10);
        boolean actualValue = mySet.contains(20);
        boolean expectedValue = false;
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void test6() {

        MySet mySet = new MySet();
        mySet.add(10);
        mySet.add(20);
        boolean actualValue = mySet.remove(1);
        boolean expectedValue = true;
        assertEquals(expectedValue, actualValue);

    }
}
