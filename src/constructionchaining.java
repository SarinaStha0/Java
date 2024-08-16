public class constructionchaining {
    public static void main(String[] args)throws Exception {
        constructionchainin obj = new constructionchainin();
        
    }
    
}
class constructionchainin
{
    constructionchainin()
    {
        this("Samriddhi");//this is keyword
        System. out.println("Default constructor called.");
    }
    constructionchainin(String str)
    {
        System.out.println("Parametrized constructor called");
    }
}
