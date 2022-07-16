package ru.netology.sqr.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/boundaries.csv")
    public void testSqrNumbersInsideBoundaries(int expected, int lowerBound, int upperBound) {
        SQRService service = new SQRService();

        int actual = service.amountNumbersWithinBoundaries(lowerBound, upperBound);

        Assertions.assertEquals(expected, actual);
    }
}
