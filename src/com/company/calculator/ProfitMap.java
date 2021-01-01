package com.company.calculator;

import java.util.HashMap;
import java.util.Map;

public class ProfitMap {

    private Map<String, Integer> map = new HashMap<>();
    private int totalProfit = 0;

    public void put(String descr, Integer sum) {
        totalProfit += sum;
        if (!map.containsKey(descr)) map.put(descr, sum);
        else {
            int tempSum = map.get(descr);
            map.put(descr, tempSum + sum);
        }
    }

    public int getTotalProfit() {
        return totalProfit;
    }

    public Map<String, Integer> getProfitInfo() {
        return map;
    }


}
