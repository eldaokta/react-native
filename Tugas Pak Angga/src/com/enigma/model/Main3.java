package com.enigma.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<BigDecimal> numbers = new ArrayList<>();
        numbers.add(new BigDecimal(3));
        numbers.add(new BigDecimal(7));
        numbers.add(new BigDecimal(6));
        numbers.add(new BigDecimal(5));

        BigDecimal tampung = new BigDecimal(0);

        for (int i = 0; i<numbers.size();i++){
            tampung = tampung.add(numbers.get(i));
        }
    }
}
