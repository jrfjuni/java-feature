package com.modern.javafeature.record;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RecordTest {

    private static List<Option> options;

    static {
        options =
           Arrays.asList(
            new Option("Java_8", "Java 8"),
            new Option("Java_11", "Java 11"),
            new Option("Java_17", "Java 17")
        );
    }

    @Test
    public void run(){
       for(Option option : options){
           assertEquals(option.id().replace("_", " "), option.value());
       }
    }

    @Test
    public void runEquals(){
        var optOne = new Option("1", "Option");
        var optTwo = new Option("1", "Option");
        assertTrue(optOne.equals(optTwo));

        var optThree = new Option("3", "Option");
        assertFalse(optOne.equals(optThree));
    }

    @Test
    public void runNull(){
        assertThrowsExactly(IllegalArgumentException.class,
                () -> new Option(null, "Null value"), "id cannot be null.");

        assertThrowsExactly(IllegalArgumentException.class,
                () -> new Option("1", ""), "value cannot be null.");
    }
}
