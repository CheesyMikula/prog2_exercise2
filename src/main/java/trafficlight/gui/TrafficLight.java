package trafficlight.gui;


import trafficlight.Observer.Observer;
import trafficlight.states.State;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class TrafficLight extends Light implements Observer {

    TrafficLight(Color color) {
        super(color);
    }

    public void turnOn(boolean a) {
        isOn = a;
        repaint();
    }

    public boolean isOn() {
        return isOn;
    }

    @Override
    public void update() {

        this.turnOn(!isOn);
    }

    //TODO implement a part of the pattern here


}
