package ru.netology.sqr.services;

public class SQRService {
    public int amountNumbersWithinBoundaries(int lowerBound, int upperBound) {
        int amount = 0;
        for(int i=10;i<=99;i++) {

            if(i * i >= lowerBound && i * i <= upperBound) {
                 amount++;
            }
        }
        return amount;
    }

}
