package com.patterns.gof.structural.adapter;

/**
 * @author Sergii Biliaiev
 * Created on 04/08/2019.
 */
public class MainAdapter {
    public static void main(String[] args) {
        var text = "Formatting line 1. Formatting line 2. Formatting line 3.";
        var newLineFormatter = new NewLineFormatter();
        var res = newLineFormatter.formatText(text);
        System.out.println(res);

        var csvAdapter = new CsvAdapterImpl(new CsvFormatter());
        var csvRes = csvAdapter.formatText(text);
        System.out.println(csvRes);
    }
}
