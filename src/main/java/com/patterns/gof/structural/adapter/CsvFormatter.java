package com.patterns.gof.structural.adapter;

/**
 * @author Sergii Biliaiev
 * Created on 04/08/2019.
 */
public class CsvFormatter implements CsvFormattable {
    @Override
    public String formatCsvText(String text) {
        return text.replace(".", ",");
    }
}
