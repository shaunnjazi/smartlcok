/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Houssem Delileche
 */
public class prototypetest {
    
    public prototypetest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void shouldTakeUserInput() {
        accesscodefield inputOutput= new accesscodefield();

        String input = "654678"; // This is the input being tested
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // The assertion must be that the input is 6 characters long 
        // to pass the test
        assertEquals(6, input.length());
    }
}
          

