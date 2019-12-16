package com.bridgerputnam.dayOne;

import com.bridgerputnam.InputReader;

import java.util.List;

public class problemOne {

    public static int modulesToFuelCost(List<Integer> moduleMasses) {
        int sumOfFuelRequired = 0;
        for(Integer mass : moduleMasses) {
            sumOfFuelRequired += massToFuelCost(mass);
        }
        return sumOfFuelRequired;
    }

    public static int massToFuelCost(Integer mass) {
        return mass / 3 - 2;
    }

    public static int solution() {
        List<Integer> input = InputReader.inputToIntList("dayOne/dayOneInput.txt");
        return modulesToFuelCost(input);
    }
}
