public class privatecons {
    public static void main(String[] args) throws Exception {
        SingleTonClass sc= SingleTonClass.objectCreationMethod();
        sc.display();
        
    }
    
}
class SingleTonClass{
    private static SingleTonClass obj = null;
    private SingleTonClass(){

    }
    public static SingleTonClass objectCreationMethod(){
        if (obj==null){
            obj = new SingleTonClass();
        }
        return obj;
    }
    public void display (){
        System.out.println("Singleton class system");
    }
}