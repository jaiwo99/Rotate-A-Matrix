package com.jaiwo99.algorithm;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatrixRotatorTest {

    MatrixRotator instance;

    @Before
    public void setUp() {
        instance = new MatrixRotator();
    }

    @Test
    public void two_dimensional_matrix_should_be_rotated() {
        final int[][] input = new int[2][2];
        input[0][0] = 1;
        input[0][1] = 2;
        input[1][0] = 3;
        input[1][1] = 4;

        final int[][] result = instance.rotateClockwise(input);

        assertEquals(result[0][0], 3);
        assertEquals(result[0][1], 1);
        assertEquals(result[1][0], 4);
        assertEquals(result[1][1], 2);
    }

    @Test
    public void three_dimensional_matrix_should_be_rotated() {
        final int[][] input = new int[3][3];
        input[0] = new int[]{1,2,3};
        input[1] = new int[]{4,5,6};
        input[2] = new int[]{7,8,9};

        final int[][] result = instance.rotateClockwise(input);

        assertEquals(result[0][0], 4);
        assertEquals(result[0][1], 1);
        assertEquals(result[0][2], 2);
        assertEquals(result[1][0], 7);
        assertEquals(result[1][1], 5);
        assertEquals(result[1][2], 3);
        assertEquals(result[2][0], 8);
        assertEquals(result[2][1], 9);
        assertEquals(result[2][2], 6);
    }

    @Test
    public void four_dimensional_matrix_should_be_rotated() {
        final int[][] input = new int[4][4];
        input[0] = new int[]{1,2,3,4};
        input[1] = new int[]{5,6,7,8};
        input[2] = new int[]{9,10,11,12};
        input[3] = new int[]{13,14,15,16};

        final int[][] result = instance.rotateClockwise(input);

        assertEquals(result[0][0], 5);
        assertEquals(result[0][1], 1);
        assertEquals(result[0][2], 2);
        assertEquals(result[0][3], 3);
        assertEquals(result[1][0], 9);
        assertEquals(result[1][1], 10);
        assertEquals(result[1][2], 6);
        assertEquals(result[1][3], 4);
        assertEquals(result[2][0], 13);
        assertEquals(result[2][1], 11);
        assertEquals(result[2][2], 7);
        assertEquals(result[2][3], 8);
        assertEquals(result[3][0], 14);
        assertEquals(result[3][1], 15);
        assertEquals(result[3][2], 16);
        assertEquals(result[3][3], 12);
    }

}