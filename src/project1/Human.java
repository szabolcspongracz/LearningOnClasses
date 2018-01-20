package project1;


public class Human {
    //The name of the human
    private String name;
    //The age of the human
    private int age;
    
    /**This method writes the name of the human on the consol*/
    public void writeMyName(){
        System.out.println("Az én nevem: " + this.name);
        
    }
   
    public String getName(){
        return this.name;
    }
    
     public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
     
}
