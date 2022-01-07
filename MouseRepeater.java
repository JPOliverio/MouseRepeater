import java.awt.AWTException;
import java.awt.PointerInfo;
import java.awt.Point;
import java.awt.MouseInfo;



public class MouseRepeater {

    public static void main(String[] args) throws AWTException{

        PointerInfo inf = MouseInfo.getPointerInfo();
        Point p =inf.getLocation();
        x = (int) p.getX();
        y = (int) p.getY();


    }
}