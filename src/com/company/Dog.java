package com.company;

public class Dog extends Animal implements SoundProducable{
    public Dog (String name) {
        super.setName(name);
    }

    @Override
    public String draw() {
        return "\uD83D\uDC15";
    }

    @Override
    public String sound() {
        return "Gav gav gav";
    }
}
