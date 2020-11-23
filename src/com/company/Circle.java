package com.company;

public class Circle extends Figure implements Drawable {
    private int r;
    private final double pi = 3.14;

    public Circle(int r, String name) {
        this.r = r;
        super.setName(name);
    }

    public int getR() {
        return r;
    }
    public double getPi() {
        return pi;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public int calculatePerimeter () {
        return (int) (2 * pi * r);
    }


    @Override
    public String draw() {
        return "\uD83D\uDD34";
    }

}
