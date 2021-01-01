package com.company.calculator;

import java.util.HashMap;
import java.util.Map;

public class LossMap {

    private Map<String, Integer> map = new HashMap<>();
    private int totalLoss = 0;

    public void put(String descr, Integer sum) {
        totalLoss -= sum;
        if (!map.containsKey(descr)) map.put(descr, sum);
        else {
            int tempSum = map.get(descr);
            map.put(descr, tempSum + sum);
        }
    }

    public int getTotalLoss() {
        return totalLoss;
    }

    public Map<String, Integer> getLossInfo() {
        return map;
    }

}
