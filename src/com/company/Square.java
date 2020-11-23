package com.company;

public class Square extends Figure implements Drawable{
    private int a;

    public Square (int a, String name) {
        this.a = a;
        super.setName(name);
    }

    public int getA () {
        return a;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public int calculatePerimeter () {
        return a*4;
    }

    @Override
    public String draw() {
        return "\uD83D\uDD32";
    }
}
