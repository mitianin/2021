package com.company.calculator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ProfitMap profitMap = new ProfitMap();
        LossMap lossMap = new LossMap();
        PrintMapInfo mapInfo = new PrintMapInfo(profitMap, lossMap);
        int total = 0;

        Pattern p = Pattern.compile("(?:-|\\+)([^0]\\d+)\\s(.+)");
        Matcher m;


        while (true) {
            String x = s.nextLine();
            if (x.equals("END")) break;
            m = p.matcher(x);
            if (!m.matches()) {
                System.out.println("Invalid format");
                continue;
            }

            String discr = m.group(2);
            int sum = Integer.parseInt(m.group(1));

            if (x.startsWith("+")) {
                profitMap.put(discr, sum);
                total += sum;
            } else {
                lossMap.put(discr, sum);
                total -= sum;
            }

        }

        System.out.println("Общий доход : " + total + "\n");
        mapInfo.getInfo();

    }
}
