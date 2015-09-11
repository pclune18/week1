import TerminalIO.*;
public class Day2 {

    
    public static void main(String[] args) {
        KeyboardReader r=new KeyboardReader();
        int age;
        age=r.readInt("How old are you Mr.Cheesy");
        age++;
        System.out.println("Next year you will be " + age + " Mr.Cheesy");
    }
    
}
