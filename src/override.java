public class override{
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.displayInfo();
    }
}
class Animal{
    public void displayInfo(){
        System.out.println("Csant is animal");
    }
}
class Dog extends Animal{
    @Override
    public void displayInfo(){
        System.err.println("csant am dog");
    }
}