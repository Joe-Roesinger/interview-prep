package com.twosum;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SumFinderTest {
    private SumFinder sumFinder = new SumFinder();

    @Test
    public void testIllegalArgumentException() {
        Exception exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> sumFinder.findTargetMatch(null, 0)
        );

        Assertions.assertEquals("The data to find the target summation cannot be null.", exception.getMessage());
    }

    @Test
    public void testNoMatch() {
        Assertions.assertNull(this.sumFinder.findTargetMatch(new int[]{0, 0, 0, 0}, 100));
    }

    @Test
    public void testPositiveTarget() {
        int[] data = {1, 3, 66, 5};
        int[] result = this.sumFinder.findTargetMatch(data, 6);

        Assertions.assertEquals(0, result[0]);
        Assertions.assertEquals(3, result[1]);
    }

    @Test
    public void testNegativeTarget() {
        int[] data = {1, -3, 66, 5};
        int[] result = this.sumFinder.findTargetMatch(data, -2);

        Assertions.assertEquals(0, result[0]);
        Assertions.assertEquals(1, result[1]);
    }

    @Test
    public void testZeroTarget() {
        int[] data = {1, -3, 66, 3};
        int[] result = this.sumFinder.findTargetMatch(data, 0);

        Assertions.assertEquals(1, result[0]);
        Assertions.assertEquals(3, result[1]);
    }
}