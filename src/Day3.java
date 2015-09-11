import TurtleGraphics.*;
import java.awt.Color;
public class Day3 {

    
    public static void main(String[] args) {
        SketchPadWindow win= new SketchPadWindow(600,400);
        Pen p= new WigglePen(win);
        p.setWidth(10);
        p.setColor(Color.black);
        int size=100;
        p.move(size);
        p.turn(90);
        p.move(size);
        p.turn(90);
        p.move(size);
        p.turn(90);
        p.move(size);
        
        //draw another one
        p.setColor(Color.red);
        p.up();
        p.move(200);
        p.down();
        p.turn(90);
        p.move(size);
        p.turn(90);
        p.move(size);
        p.turn(90);
        p.move(size);
        p.turn(90);
        p.move(size);
        p.turn(90);
        
        //draw another one
        p.setColor(Color.blue);
        p.up();
        p.move(150);
        p.down();
        p.turn(90);
        p.move(size);
        p.turn(90);
        p.move(size);
        p.turn(90);
        p.move(size);
        p.turn(90);
        p.move(size);
        p.turn(90);
    }
    
}
