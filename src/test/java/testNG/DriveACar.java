package testNG;

import org.testng.annotations.Test;

public class DriveACar {

    @Test(priority = 0)
    public void StartTheCar(){
        System.out.println("car Started ");
    }
    @Test(priority = 1)
    public void PutFirstGear(){
        System.out.println("First Gear");
    }
    @Test(priority = 2)
    public void PutSecondtGear() {
        System.out.println("Second Gear");
    }
    @Test(priority = 3)
    public void PutthirdGear() {
        System.out.println("third Gear");
    }
    @Test(priority = 4)
    public void PutFourthGear() {
        System.out.println("FourthGear");
    }
}