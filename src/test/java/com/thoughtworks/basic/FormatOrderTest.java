package com.thoughtworks.basic;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FormatOrderTest {
    @Test
    public void hello_world_test() {
        //given
//        Dependency dependency = new Dependency();
//        HelloWorld helloWorld = new HelloWorld(dependency);
//
//        //when
//        String actual = helloWorld.beenCalled();

        //then
       // assertEquals(actual,"Leave me alone.");
    }

    @Test
    public void should_return_inputStr_when_console_input() {
        InputFormat inputFormat = new InputFormat();
        String consoleInput = "-l true -p 8080 -d /usr/logs";

        List<String> inputOrder = inputFormat.input(consoleInput);

        assertEquals("[l true , p 8080 , d /usr/logs]",inputOrder.toString());
    }
}
