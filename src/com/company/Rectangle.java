package com.company;

public class Rectangle extends Figure implements Drawable {
    private int a;
    private int b;

    public Rectangle (int a, int b, String name) {
        this.a = a;
        this.b = b;
        super.setName(name);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }


    @Override
    public int calculatePerimeter() {
        return 2*(a+b);
    }

    @Override
    public String draw() {
        return "▄▄";
    }
}
