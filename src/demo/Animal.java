package demo;

public class Animal {
    String color  = "Blue";
    int temp;

    public Animal(){
        temp = 10;
    }
    public Animal(int temp){
        this.temp = temp;
        System.out.println("print from the animal: "+this.temp);
    }

    public void eating(){
        System.out.println("Animal is eating");
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a.temp);
    }
}
