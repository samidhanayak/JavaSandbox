package Feb15;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class LeapYear {
    public static void main(String[] args) {
        int xyear = 2025;
        int x = 10;
        int y = 50;
        int z = 30;

                if ((xyear % 4) == 0)
                {
                    System.out.println ("Leap Year");
                }
                else {
                    System.out.println ("Not a Leap Year");
                };
                if ((x > y) && (x > z))
                {
                    System.out.println ("x");
                }
                else if ((y > x ) && (y > z))
                {
                    System.out.println ("y");
                }
                else {
                    System.out.println ("z");
                }
    }
}

