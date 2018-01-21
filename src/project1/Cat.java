
package project1;

public class Cat extends Animal implements Pet{
    
    public Cat(){
        super();
    }
    
    public Cat(String name){
        this.setName(name);
    }
     
    public Cat(String name, int weight){
        this.setName(name);
        this.setWeight(weight);
    }
    
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
