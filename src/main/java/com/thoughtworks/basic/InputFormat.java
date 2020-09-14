package com.thoughtworks.basic;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputFormat {
    public List<String> input(String input) {
        return Arrays.stream(input.split("-"))
                .filter(p->p.length()!=0)
                .collect(Collectors.toList());
    }
}
