// this program is prepared by 21ce013 Abhi Bhimani
// Design a class named Circle containing following attributes and behavior. 
// • One double data field named radius. The default value is 1. 
// • A no-argument constructor that creates a default circle. 
// • A Single argument constructor that creates a Circle with the specified radius. 
// • A method named getArea() that returns area of the Circle. 
// • A method named getPerimeter() that returns perimeter of it.
// GITHUB LINK : https://github.com/abhii14758/-JAVA-PRACTICAL-FILE-2

import java.util.*;
public class PR_1_Main{
    public static void main(String[] args) {
        double r;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Value of Radius Here : ");
        r = s.nextDouble();
        circle c1 = new circle(r);
        circle c2 = new circle();
        c1.getarea();
        c1.getperimiter();
        c2.getarea();
        c2.getperimiter();
    }
}