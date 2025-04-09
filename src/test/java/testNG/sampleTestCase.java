package testNG;

import org.testng.annotations.Test;

public class sampleTestCase {

    @Test(priority = 0)
    public void firsTestCase(){
        System.out.println("this is my First testcase ");
    }
    @Test(priority = 1)
    public void secondTestCase(){
        System.out.println("this is my Second testcase ");
    }
    @Test(priority = 2)
    public void ThirdTestCase(){
        System.out.println("this is my Third testcase ");
    }
    @Test(priority = 4)
    public void fourthTestCase(){
        System.out.println("this is my Fourth testcase ");
    }

}
