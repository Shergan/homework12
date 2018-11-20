package com.divashchenko;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
    private int maxWeight;
    private List<Object> pack = new ArrayList<>();

    public Backpack(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public List<Object> getPack() {
        return pack;
    }
}
