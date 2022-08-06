import java.util.*;

class circle{
    double r;

    circle()
    {
        r = 1;
    }
    circle(double a)
    {
        r = a;
    }
    public void getarea()
    {
        System.out.println("Area Of Circle = "+2*3.14*r*r);
    }
    public void getperimiter()
    {
        System.out.println("Perimiter Of Circle = "+2*3.14*r);
    }
}

