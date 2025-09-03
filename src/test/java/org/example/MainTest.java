package org.example;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testMainOutputWithTrim() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        try {
            System.setOut(new PrintStream(outputStream));
            Main.main(new String[]{});

            String output = outputStream.toString().trim();
            assertEquals("Hello and welcome!", output);

        } finally {
            System.setOut(originalOut);
        }
    }
}
