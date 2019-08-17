package com.patterns.gof.structural.proxy;

/**
 * @author Sergii Biliaiev
 * Created on 15/08/2019.
 */
public interface ReportGenerator {
    void displayReportTemplate(String reportFormat, int reportEntries);

    void generateComplexReport(String reportFormat, int reportEntries);

    void generateSensitiveReport();
}
