package com.solvd.carrental.vehicle;

public class Engine {

    private int volume;
    private int horsepower;

    public Engine(int volume, int horsepower) {
        this.volume = volume;
        this.horsepower = horsepower;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
}
