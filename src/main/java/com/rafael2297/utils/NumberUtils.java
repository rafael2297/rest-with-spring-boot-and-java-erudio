package com.rafael2297.utils;

import com.rafael2297.exception.UnsupportedMathOperatinExcepption;

public class NumberUtils {

    public static Double convertToDouble(String strNumero) {
        if (strNumero == null || strNumero.isEmpty())
            throw new UnsupportedMathOperatinExcepption("Apenas valores numericos!");
        String numeber = strNumero.replace(",", ".");
        return Double.parseDouble(numeber);

    }

    public static boolean isNumeric(String StrNumero) {
        if (StrNumero == null || StrNumero.isEmpty()) return false;
        String numeber = StrNumero.replace(",", ".");
        return numeber.matches("[-_+]?[0-9]*\\.?[0-9]+");


    }
}
