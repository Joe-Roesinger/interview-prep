package com.duplicate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateFinderTest {
    DuplicateFinder duplicateFinder = new DuplicateFinder();

    @Test
    public void noDuplicate() {
        assertFalse(this.duplicateFinder.evaluate(new int[] {1, 2, 3, 4, 5}));
    }

    @Test
    public void noData() {
        assertFalse(this.duplicateFinder.evaluate(new int[] {}));
    }

    @Test
    public void oneDataPoint() {
        assertFalse(this.duplicateFinder.evaluate(new int[] {1}));
    }

    @Test
    public void duplicate() {
        assertTrue(this.duplicateFinder.evaluate(new int[] {1, 3, 4, 2, 5, 3}));
    }

    @Test
    public void nullData() {
        assertFalse(this.duplicateFinder.evaluate(null));
    }

}