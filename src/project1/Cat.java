
package project1;

public class Cat extends Animal implements Pet{
    
    @Override
    public void makeSound(){
    System.out.println("MEOW");
    }

    @Override
    public void cuddle() {
    }

    @Override
    public void sit() {
    }

    @Override
    public void layDown() {
    }
}
