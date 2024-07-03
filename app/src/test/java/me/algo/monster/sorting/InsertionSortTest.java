package me.algo.monster.sorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

/**
 * InsertionSortTest
 */
class InsertionSortTest {

    private Logger logger = LoggerFactory.getLogger(InsertionSortTest.class);

    @Test
    void canSortRandomArray() {
        // logger.info("should sort array {0} to {1}", Constants.array1);
        logger.info(() -> {
            return "should sort " + Constants.array1 + " to " + Constants.arraySorted;
        });
        logger.info(() -> "original array " + Constants.array1);
        InsertionSort.sort(Constants.array1);
        logger.info(() -> "sorted array " + Constants.array1);
        assertArrayEquals(Constants.arraySorted, Constants.array1);
    }

    @Test
    void canSortEmptyArray() {
    }

    @Test
    void canSortSingleArray() {
    }

    @Test
    void canSortArraySortedNaturally() {
    }

    @Test
    void canSortArraySortedReversely() {
    }
}