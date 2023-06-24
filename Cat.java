public class Cat {
    public static void main(String [] args ){
        Dog dog = new Dog("bully" , 5);
        System.out.println("name is "+dog.name);
        System.out.println(" age is "+dog.age);
        dog.play();
        dog.sleep();
    }
}
