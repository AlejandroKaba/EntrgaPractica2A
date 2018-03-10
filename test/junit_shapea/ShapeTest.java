/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit_shapea;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class ShapeTest {
    
    @Test
    public void testAreaSquareTrue(){
        System.out.println("Area Square True");
        Shape instance=new Shape(1,6.0);
        double expResult=36.0;
        double result=instance.area();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAreaSquareFalse(){
        System.out.println("Area Square False");
        Shape instance=new Shape(1,6.0);
        double expResult=12.0;
        double result=instance.area();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAreaCircleTrue(){
        System.out.println("Area Circle True");
        Shape instance=new Shape(2,0.0);
        double expResult=0.0;
        double result=instance.area();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAreaCircleFalse(){
        System.out.println("Area Circle False");
        Shape instance=new Shape(2,6.0);
        double expResult=12.0;
        double result=instance.area();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAreaRight_TriangleTrue(){
        System.out.println("Area Right_Triangle True");
        Shape instance=new Shape(3,6.0);
        double expResult=18.0;
        double result=instance.area();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAreaRight_TriangleFalse(){
        System.out.println("Area Right_Triangle False");
        Shape instance=new Shape(3,6.0);
        double expResult=36.0;
        double result=instance.area();
        assertEquals(expResult, result, 0.0);
    }
}
