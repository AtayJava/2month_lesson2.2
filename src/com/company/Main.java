package com.company;

public class Main {

    public static void main(String[] args) {
        Circle c = new Circle(6, "Circle");
        Square s = new Square(6, "Square");
        Triangle t = new Triangle(3,5,8,"Triangle");
        Rectangle r = new Rectangle(5,9,"Rectangle");



        Figure[] figures = new Figure[]{c, s, t,r };
        for (Figure f: figures
             ) {
            System.out.println(f.getName() +" "+ f.draw()+" "+ f.calculatePerimeter());
        }

        System.out.println("");

        Dog dog = new Dog("Dog");
        System.out.println(dog.getName() + " " + dog.draw() + " " + dog.sound());


    }
}
