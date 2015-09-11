import hsa.*;


public class Day1 {
    
    public static void main(String[]args){
            Console c = new Console();
    c.print("hello mr.Cheese");
    int age;
    c.print("\nhow old are you mr.Cheese?");
            age=c.readInt();
            age++;
            c.print("\nNext year you will be " + age);
    }
    
    
}

