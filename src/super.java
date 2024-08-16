public class super {
    public static void main (string[] args) throws Exception{
        
    }
    
    
}
class ABC{
    public void myMethod()
    {
        System.out.println("overriden method");
    }
}
class ChildClass extends ABC{
    public void myMethod(){
        super.myMethod();
        System.out.println("overrdding mrthod");
    }
}
