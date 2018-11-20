package com.divashchenko;

import java.util.ArrayList;
import java.util.List;

public class Sorter {
    private static List<Object> bestSet;
    private static int maxWeight;
    private static int maxPrice;

    public List<Object> getBestSet() {
        return bestSet;
    }

    public static void sort(Backpack backpack, List<Object> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getWeight() > backpack.getMaxWeight()) {
                list.remove(i);
                i--;
            }
        }

        maxWeight = backpack.getMaxWeight();

        startSort(list);

        System.out.println("Result: " + bestSet);

    }

    public static void startSort(List<Object> list) {
        if (list.size() > 0) {
            reviewSet(list);
        }

        for (int i = 0; i < list.size(); i++) {
            List<Object> tmpSet = new ArrayList<>(list);
            tmpSet.remove(i);
            startSort(tmpSet);
        }
    }

    private static void reviewSet(List<Object> list) {
        if (bestSet == null) {
            if (sumWeight(list) <= maxWeight) {
                bestSet = list;
                maxPrice = sumPrice(list);
            }
        } else {
            if (sumWeight(list) <= maxWeight && sumPrice(list) > maxPrice) {
                bestSet = list;
                maxPrice = sumPrice(list);
            }
        }
    }

    private static int sumWeight(List<Object> list) {
        int sumW = 0;
        for (Object aList : list) {
            sumW += aList.getWeight();
        }
        return sumW;
    }

    private static int sumPrice(List<Object> list) {
        int sumP = 0;
        for (Object aList : list) {
            sumP += aList.getPrice();
        }
        return sumP;
    }
}
