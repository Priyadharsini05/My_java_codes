class Animal{
    public void sound(){
        System.out.println("All animal makes noise");
        }
    public void grow(){
        System.out.println("All animals grow");
        }
}
class Survive extends Animal{
    public void food(){
        System.out.println("All animal need food");
    }
}
class Main{
    public static void main(String args[]){
        Animal dog = new Animal(); // object creation  for class like scanner
        dog.sound();
        
        Survive eat = new Survive(); // object creation for another class 
        eat.food();
        
        Animal cat = new Animal(); //can give another object for the same class
        cat.sound();
        cat.grow();
        
        eat.grow(); //can use child object for calling parent method (inheritance) child can access parent class
    }
}
