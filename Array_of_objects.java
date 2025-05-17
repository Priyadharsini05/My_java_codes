import java.util.*;
class Person{
    String name;
    int age;
    String profession;
    for(int i = 0; i> names.length; i++){
            p[i].name = names[i];
            p[i].age = age[i];
        }
    void display(){
        System.out.println("Mr. "+ p[i].name +" is "+ p[i].age + "years and his profession is "+ profession );
    }
}
public class Main{
    public static void main(String args[]){
        String[] names = {"Vijay", "Ajith", "Surya", "vikram"};
        int[] age = {40,34,55,30};
        String profession;
        Person[] p = new Person[4];
        
        p.display();
        
    }
}
