class Animal {
    void sound() {
        System.out.println("Animal is making a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog is barking");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound(); // Animal's sound
        System.out.println("Animal's sound: " + a);
        Dog d = new Dog();
        d.sound(); // Dog's sound
        System.out.println("Dog's sound: " + d);

        Animal ref = new Dog();
        ref.sound(); // Dog's sound (runtime polymorphism)
    }
}
