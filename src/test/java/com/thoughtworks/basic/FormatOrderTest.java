package com.thoughtworks.basic;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FormatOrderTest {

    @Test
    public void should_return_inputStr_when_console_input() {
        InputFormat inputFormat = new InputFormat();
        String consoleInput = "-l true -p 8080 -d /usr/logs";

        List<String> inputOrders = inputFormat.input(consoleInput);


        assertEquals("[l true , p 8080 , d /usr/logs]",inputOrders.toString());
    }

    @Test
    public void should_check_inputStr() throws Exception {
        List<String> inputOrders = Arrays.asList("l true ", "p 8080" , "d /usr/logs");

        List<Schema> schemas = new ArrayList<>();
        for(String inputOrder: inputOrders ){
            System.out.println(inputOrder);
            List<String> inputOrderList=  Arrays.asList(inputOrder.split(" "));
            String order = inputOrderList.get(0);
            String value = inputOrderList.get(1);

            Class schemaClass = Class.forName("com.thoughtworks.basic.Schema"+order.toUpperCase());
            Schema schema = (Schema)schemaClass.getConstructor(String.class,String.class).newInstance(order,value);
            schemas.add(schema);
        }

        assertEquals("(\"l\",true)",schemas.get(0).toString());
        assertEquals("(\"p\",8080)",schemas.get(1).toString());
        assertEquals("(\"d\",/usr/logs)",schemas.get(2).toString());
    }

}
