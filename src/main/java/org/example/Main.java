package org.example;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        Cat cat1 = new Cat("Кеша");
        Cat cat2 = new Cat("Мурзик");
        Dog dog1 = new Dog("Бобик");

        cat1.run(150);
        cat2.swim(10);
        dog1.run(400);
        dog1.swim(5);

        Bowl bowl = new Bowl(30);
        System.out.println("В миске сейчас " + bowl.getFood() + " еды.");

        cat1.eat(bowl);
        cat2.eat(bowl);
        System.out.println("В миске осталось " + bowl.getFood() + " еды.");
        bowl.addFood(20);

        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Котов: " + Cat.getCatCount());
        System.out.println("Собак: " + Dog.getDogCount());

        // Задание 2
        Circle circle = new Circle(5, "Синий", "Черный");
        Rectangle rectangle = new Rectangle(4, 6, "Красный", "Синий");
        Triangle triangle = new Triangle(3, 4, 5, "Желтый", "Зеленый");

        circle.displayProperties();
        rectangle.displayProperties();
        triangle.displayProperties();
    }
}
