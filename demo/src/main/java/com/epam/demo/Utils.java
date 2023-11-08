package com.epam.demo;

import java.util.Arrays;
import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        if(args == null) return false;

        return   args.stream().noneMatch(n -> n.startsWith("0") || n.startsWith("-") || n.isEmpty() || n.contains(" ") );
    }
}