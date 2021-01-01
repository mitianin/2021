package com.company.phone_numbers;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String x = "fsdfds09750709750700500050dsa343209750700501223m rew542 0885070050rew 3242 rewf0675070050";

        System.out.println(getPhoneNumbers(x));


    }

    static Set<String> getPhoneNumbers(String x) {
        OperatorCodes code = new OperatorCodes();
        Set<String> phoneNumbers = new HashSet<>();

        Pattern p = Pattern.compile("0\\d{9}");
        Matcher m = p.matcher(x);

        while (m.find()) {
            if (code.checkCode(m.group())) phoneNumbers.add("+38" + m.group());
        }

        return phoneNumbers;
    }


}
