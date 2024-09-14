/*Write a class SolidObj and generate some sub-level classes such as CylinderObj, CubeObj,
BoxObj, and ConeObj out of that. The super class will consist of numerous methods such
as volume and wholeSurfaceArea. You need to utilize these methods in the specified sublevel classes by the concept of method overriding and give implementation according to
the current child type. Your sub-level classes must have specific no-arg and parameterized
constructors for handling dimensions with respect to these objects using Scanner class.
Test your code by separately creating your test class. */

import java.util.Scanner;
import java.lang.Math;

abstract class SolidObj{
    public abstract double volume();
    public abstract double wholeSurfaceArea();
}

class CylinderObj extends SolidObj{
    double radius, height;
    public CylinderObj(){
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter Radius");
        radius = scanner.nextDouble();
        System.out.println("Enter Height");
        height = scanner.nextDouble();
    }
    
    public CylinderObj(double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    
    public double volume(){
        return Math.PI*radius*radius*height;
    }
    
    public double wholeSurfaceArea(){
        return 2*Math.PI*radius*(radius+height);
    }
}

public class TestSolidObj{
    public static void main(String[] args){
        CylinderObj obj1 = new CylinderObj();
        double vol = obj1.volume();
        double sur = obj1.wholeSurfaceArea();
        
        System.out.println(vol);
        System.out.println(sur);
    }
}

/*Similarly all other objects*/
