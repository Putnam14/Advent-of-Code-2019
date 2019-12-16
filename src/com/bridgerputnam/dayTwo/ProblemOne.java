package com.bridgerputnam.dayTwo;

import com.bridgerputnam.InputReader;
import com.bridgerputnam.IntcodeProcessor;

import java.util.List;

public class ProblemOne {
    public static int solution() {
        List<Integer> input = InputReader.inputToIntList("dayTwo/dayTwoInput.txt");
        IntcodeProcessor.processIntcode(input);
        return input.get(0);
    }
}
