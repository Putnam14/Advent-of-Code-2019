package com.bridgerputnam;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InputReader {
    public static String inputToString(String file) {

        InputStream is = InputReader.class.getResourceAsStream(file);
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
            StringBuilder sb = new StringBuilder();
            String currentLine = reader.readLine();
            while(currentLine != null) {
                sb.append(currentLine);
                sb.append('\n');
                currentLine = reader.readLine();
            }
            return sb.toString();
        } catch(Exception e) {
            throw new RuntimeException("Error while processing input: " + e.toString());
        }
    }

    public static int[] inputToIntArray(String file) {
        String input = inputToString(file);
        String[] strArray = input.split(",|,\n|\n");
        return Stream.of(strArray).filter(x -> !x.equals("")).mapToInt(Integer::parseInt).toArray();
    }

    public static List<Integer> intArrayToList(int[] input) {
        return Arrays.stream(input).boxed().collect(Collectors.toList());
    }

    public static List<Integer> inputToIntList(String file) {
        return intArrayToList(inputToIntArray(file));
    }
}
