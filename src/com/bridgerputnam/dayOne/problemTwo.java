package com.bridgerputnam.dayOne;

import java.util.List;

import static com.bridgerputnam.dayOne.problemOne.massToFuelCost;

public class problemTwo {

    static int addFuelRequirementsToFuel(int fuel) {
        if(fuel <= 0) return 0;
        return fuel + addFuelRequirementsToFuel(massToFuelCost(fuel));
    }

    static int calcTotalFuelRequirements(List<Integer> moduleMasses) {
        int totalFuel = 0;
        for(Integer mass : moduleMasses) {
            int initialFuelNeeded = massToFuelCost(mass);
            totalFuel += addFuelRequirementsToFuel(initialFuelNeeded);
        }
        return totalFuel;
    }

    public static int solution() {
        List<Integer> input = problemOneInput.getInput();
        return calcTotalFuelRequirements(input);
    }
}
