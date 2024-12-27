class Animal{
    void eat(){
        System.out.println("eat...");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("milk");
    }
}
class Cat extends Animal{
    void eat(){
        System.out.println("JUice");
    }
}
class Ami{
    public static void main(String args[]){
        Animal a;
        a=new Dog();
        a.eat();
          a=new Cat();
        a.eat();
    }
}
