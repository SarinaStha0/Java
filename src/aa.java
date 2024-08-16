public class aa {
    public static void main(string[]args){
        Utilities p = new Utilities(){
            void display(){
                System.Out.printIn("GOOD MORNING");
            }
        };
        p.display();
    }
    
}
abstract class Utilities{
    abstract void display();
}
