package com.patterns.gof.structural.adapter;

/**
 * @author Sergii Biliaiev
 * Created on 04/08/2019.
 */
public class CsvAdapterImpl implements TextFormattable {

    private CsvFormattable csvFormattable;

    public CsvAdapterImpl(CsvFormattable csvFormattable) {
        this.csvFormattable = csvFormattable;
    }


    @Override
    public String formatText(String text) {
        var formattedText = csvFormattable.formatCsvText(text);
        return formattedText;
    }
}
