package controlFlow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControlFlowTest {
    ControlFlow instance;

    @BeforeEach
    void setUp(){
        instance = new ControlFlow();
    }

    @Test
    void myMethodTest(){

    String expected = "true";
    String actual = instance.myMethod(2);
    assertEquals(expected,actual);

    }

    @Test
    void switchMethodTest(){
//        ControlFlow instance = new ControlFlow();
        String actual = instance.switchMethod(4);
        assertEquals("that's four", actual);
    }


    @Test
    void forMethodTest(){

        String actual = instance.forMethod();
    }

}