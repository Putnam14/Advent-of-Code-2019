package com.bridgerputnam.dayTwo;

import com.bridgerputnam.InputReader;
import com.bridgerputnam.IntcodeProcessor;

import java.util.ArrayList;
import java.util.List;

public class ProblemTwo {
    public static int solution() {
        List<Integer> input = InputReader.inputToIntList("dayTwo/dayTwoInput.txt");
        for(int noun = 0; noun <= 99; noun++) {
            for(int verb = 0; verb <= 99; verb++) {
                List<Integer> modifiedInput = new ArrayList<>(input.size());
                modifiedInput.addAll(input);
                modifiedInput.set(1,noun);
                modifiedInput.set(2,verb);
                IntcodeProcessor.processIntcode(modifiedInput);
                int output = modifiedInput.get(0);
                if(output == 19690720) return 100 * noun + verb;
            }
        }
        return -1;
    }
}
