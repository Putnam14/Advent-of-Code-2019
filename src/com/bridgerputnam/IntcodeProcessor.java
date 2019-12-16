package com.bridgerputnam;

import java.util.List;

public class IntcodeProcessor {
    public static void processIntcode(List<Integer> input) {
        int pos = 0;
        while(pos < input.size()) {
            int opCode = input.get(pos);
            if(opCode == 99) {
                break;
            }
            if(pos + 3 >= input.size()) break;
            int firstInputIndex = input.get(pos + 1);
            int secondInputIndex = input.get(pos + 2);
            int firstInputValue = input.get(firstInputIndex);
            int secondInputValue = input.get(secondInputIndex);
            int indexToWriteTo = input.get(pos + 3);
            if(opCode == 1) {
                int valueToWrite = firstInputValue + secondInputValue;
                input.set(indexToWriteTo, valueToWrite);
            } else if(opCode == 2) {
                int valueToWrite = firstInputValue * secondInputValue;
                input.set(indexToWriteTo, valueToWrite);
            } else {
                System.out.println("Something went wrong!");
            }
            pos = pos + 4;
        }
    }
}
