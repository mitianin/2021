package com.company.phone_numbers;

import java.util.Arrays;
import java.util.List;

public class OperatorCodes {
    private List<String> codes =
            Arrays.asList("067", "068", "096", "097",
                    "098", "050", "066", "095", "099", "063",
                    "073", "093", "091", "092", "089", "094");

    public boolean checkCode(String phoneNumber) {
        return codes.stream().anyMatch(phoneNumber::startsWith);
    }
}
