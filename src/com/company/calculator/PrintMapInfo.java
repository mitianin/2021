package com.company.calculator;

import java.util.Map;

public class PrintMapInfo {
    private ProfitMap profitMap;
    private LossMap lossMap;

    public PrintMapInfo(ProfitMap profitMap, LossMap lossMap) {
        this.profitMap = profitMap;
        this.lossMap = lossMap;
    }

    public void getInfo() {
        System.out.println("Расходы составляют " + Math.abs(lossMap.getTotalLoss()) + " из которых");
        for (Map.Entry<String, Integer> pair : lossMap.getLossInfo().entrySet()
        ) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }

        System.out.println();

        System.out.println("Доходы составляют " + profitMap.getTotalProfit() + " из которых");
        for (Map.Entry<String, Integer> pair : profitMap.getProfitInfo().entrySet()
        ) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }
}
