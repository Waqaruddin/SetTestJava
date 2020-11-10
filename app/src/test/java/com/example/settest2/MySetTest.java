package com.example.settest2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

//Set Implementation using array
//TDD pair programming

//Test MySet
//requirements:

//Sprint 1
//MySet should be be empty if no elements are added
//MySet should be be NOT empty if elements are added
//MySet should be able to add elements
//MySet should not add duplicate elements

//Sprint 2
//MySet should be able to remove an element

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
