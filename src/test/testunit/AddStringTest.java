package testunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddStringTest {
    AddString addString = new AddString();
    @Test
    public void stringMultiply() {
        assertEquals(addString.addString("hello","world"),"helloworld");
    }
}