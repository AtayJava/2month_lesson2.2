package com.company;

public class Triangle extends Figure implements Drawable {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c, String name) {
        this.a = a;
        this.b = b;
        this.c = c;
        super.setName(name);
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }


    @Override
    public int calculatePerimeter() {
        return a*b*c;
    }

    @Override
    public String draw() {
        return "\uD83D\uDD3A";
    }
}
