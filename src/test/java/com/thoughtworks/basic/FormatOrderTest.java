package com.thoughtworks.basic;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class FormatOrderTest {

    @Test
    public void should_return_inputStrArray_when_console_input() {
        InputFormat inputFormat = new InputFormat();
        String consoleInput = "-l true -p 8080 -d /usr/logs";

        List<String> inputOrders = inputFormat.input(consoleInput);

        assertEquals(Arrays.asList("l true ","p 8080 ","d /usr/logs"),inputOrders);
    }

    @Test
    public void should_parse_inputStr()  {
        List<String> inputOrders = Arrays.asList("l true ", "p 8080" , "d /usr/logs");
        InputFormat inputFormat = new InputFormat();

        List<List<String>> parseInputs = inputFormat.parseInput(inputOrders);

        assertEquals("[[l, true], [p, 8080], [d, /usr/logs]]",parseInputs.toString());
    }


    @Test
    public void should_check_inputStr()  {
        List<String> inputOrders = Arrays.asList("l true ", "p 8080" , "d /usr/logs");
        InputFormat inputFormat = new InputFormat();

        List<List<String>> parseInputs = inputFormat.parseInput(inputOrders);
        boolean checkArga1 = inputFormat.checkInput(parseInputs.get(0));
        boolean checkArga2 = inputFormat.checkInput(parseInputs.get(1));
        boolean checkArga3 = inputFormat.checkInput(parseInputs.get(2));

        assertEquals(true,checkArga1);
        assertEquals(true,checkArga2);
        assertEquals(true,checkArga3);
    }

    @Test
    public void should_checkClass_inputStr() throws Exception {
        List<String> inputOrders = Arrays.asList("l true ", "p 8080" , "d /usr/logs");
        InputFormat inputFormat = new InputFormat();
        List<Schema> schemas = new ArrayList<>();

        List<List<String>> parseInputs = inputFormat.parseInput(inputOrders);
        for(List<String> parseInput: parseInputs ){
            String order = parseInput.get(0);
            String value = parseInput.get(1);

            Class schemaClass = Class.forName("com.thoughtworks.basic.Schema"+order.toUpperCase());
            Schema schema = (Schema)schemaClass.getConstructor(String.class,String.class).newInstance(order,value);
            schemas.add(schema);
        }

        assertEquals("Arg(\"l\",true)",schemas.get(0).toString());
        assertEquals("Arg(\"p\",8080)",schemas.get(1).toString());
        assertEquals("Arg(\"d\",/usr/logs)",schemas.get(2).toString());
    }


//    @Test
//    public void should_return_arg() throws Exception {
//
//    }


}
