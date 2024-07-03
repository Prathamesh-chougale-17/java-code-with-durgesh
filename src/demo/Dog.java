package demo;
//child extends parent

// super is same as this, but it accesses the immediate parent variable else and use parentName.this.variableName
// super() user to call parent class constructor from inside child class constructor
public class Dog extends Animal{
//
//        Overloading of constructor similarly can be done on function too;

    public Dog(){
        super(25);
        System.out.println("After initializing the Dog and "+super.temp);
        super.temp = 11;
        System.out.println("Before dog is initialised and super is assigned: "+super.temp);
    }
    public Dog(int d){
        super(d);
        System.out.println("print after the super only");
    }

//
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println("final output: "+ d.temp);

    }
}
