package com.patterns.gof.structural.proxy;

/**
 * @author Sergii Biliaiev
 * Created on 15/08/2019.
 */
public class ReportGeneratorImpl implements ReportGenerator {

    public ReportGeneratorImpl() {
        System.out.println("ReportGeneratorImpl create instance");
    }

    @Override
    public void displayReportTemplate(String reportFormat, int reportEntries) {

    }

    @Override
    public void generateComplexReport(String reportFormat, int reportEntries) {
        System.out.println("ReportGeneratorImpl: Generating complex report in " + reportFormat + " format with " + reportEntries + " entries");
    }

    @Override
    public void generateSensitiveReport() {
        System.out.println("ReportGeneratorImpl: generate sensitive report");
    }
}
