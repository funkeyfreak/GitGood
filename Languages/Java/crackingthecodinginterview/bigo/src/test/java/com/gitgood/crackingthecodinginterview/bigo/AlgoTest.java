package com.gitgood.crackingthecodinginterview.bigo;

import junit.framework.TestCase;

import java.util.Arrays;

public class AlgoTest extends TestCase {
    public void testProduct() throws Exception {
        assertEquals(Algo.product(5,5), 25);
    }

    public void testPower() throws Exception {
        assertEquals(Algo.power(2,5), 32);
    }

    public void testMod() throws Exception {
        assertEquals(Algo.mod(2, 10), 2);
        assertEquals(Algo.mod(5,29), 5);
    }

    public void testDiv() throws Exception {
        assertEquals(Algo.div(29, 5), 5);
    }

    public void testSqrt() throws Exception {
        assertEquals(Algo.sqrt(4), 2);
    }

    public void testSqrtLoop() throws Exception {
        assertEquals(Algo.sqrtLoop(2), -1);
        assertEquals(Algo.sqrtLoop(4), 2);
    }

    public void testCopyArray() throws Exception {
        int[] test = new int[3];
        test[0] = 1;
        test[1] = 2;
        test[2] = 15;

        assertEquals(Arrays.toString(Algo.copyArray(test)), Arrays.toString(test));
    }

    public void testAppendToNew() throws Exception {
        int[] test = new int[3];
        test[0] = 1;
        test[1] = 2;
        test[2] = 15;

        int[] testExt = new int[4];
        testExt[0] = 1;
        testExt[1] = 2;
        testExt[2] = 15;
        testExt[3] = 22;

        assertEquals(Arrays.toString(Algo.appendToNew(test, 22)), Arrays.toString(testExt));
    }

    public void testSumDigits() throws Exception {
        assertEquals(Algo.sumDigits(112445), 17);
    }

    public void testNumChars() throws Exception {
        Algo.numChars.printSortedStrings(5);
    }

    public void testIntersection() throws Exception {
        int[] test = new int[3];
        test[0] = 1;
        test[1] = 2;
        test[2] = 15;

        int[] testExt = new int[4];
        testExt[0] = 1;
        testExt[1] = 2;
        testExt[2] = 15;
        testExt[3] = 22;

        int[] testDif = new int[4];
        testDif[0] = 9;
        testDif[1] = 8;
        testDif[2] = 75;
        testDif[3] = 21;

        assertEquals(Algo.intersection(test, testExt), 3);
        assertEquals(Algo.intersection(testExt, testDif), 0);
    }

}