public class superkeybase {
    public static void main (String[]args) throws Exception{
        ChildClass cls = new ChildClass();
    }
    
}
class BaseClass
{
    BaseClass()
    {
        System.out.println("Base class construction is called");
    }
}
class ChildClass extends BaseClass
{
    ChildClass()
    {
        super();
        System.out.println("From base class constructor");
    }
}
