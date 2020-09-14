package com.thoughtworks.basic;

import java.util.*;
import java.util.stream.Collectors;

public class InputFormat {
    public List<String> input(String input) {
        return Arrays.stream(input.split("-"))
                .filter(p->p.length()!=0)
                .collect(Collectors.toList());
    }

    public List<List<String>> parseInput(List<String> inputOrders){
        List<List<String>> parseInputs = new ArrayList<>();
        for(String inputOrder: inputOrders ){
            parseInputs.add(Arrays.asList(inputOrder.split(" ")));
        }
        return parseInputs;
    }

    public Boolean checkInput( List<String> inputOrderList){
        if(inputOrderList.size()!=2){
            return false;
        }
        if(inputOrderList.get(1).contains("-")){
            return false;
        }
        return true;
    }

}
