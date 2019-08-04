package com.patterns.gof.structural.adapter;

/**
 * @author Sergii Biliaiev
 * Created on 04/08/2019.
 */
public class NewLineFormatter implements TextFormattable {
    @Override
    public String formatText(String text) {
        return text.replace(".", "\n");
    }
}
