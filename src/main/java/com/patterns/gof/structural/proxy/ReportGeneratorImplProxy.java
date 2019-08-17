package com.patterns.gof.structural.proxy;

/**
 * @author Sergii Biliaiev
 * Created on 18/08/2019.
 */
public class ReportGeneratorImplProxy implements ReportGenerator {

    private ReportGenerator reportGeneratorImpl;
    private Role roleAccess;

    public ReportGeneratorImplProxy(Role roleAccess) {
        this.roleAccess = roleAccess;
    }

    @Override
    public void displayReportTemplate(String reportFormat, int reportEntries) {
        System.out.println("ReportGeneratorImplProxy: Displaying blank report template in " + reportFormat + " format with " + reportEntries + " entries");
    }

    @Override
    public void generateComplexReport(String reportFormat, int reportEntries) {
        if (reportGeneratorImpl == null) {
            reportGeneratorImpl = new ReportGeneratorImpl();
        }
        reportGeneratorImpl.generateComplexReport(reportFormat, reportEntries);
    }

    @Override
    public void generateSensitiveReport() {
        if (roleAccess.getRole().equals("manager")) {
            if (reportGeneratorImpl == null) {
                reportGeneratorImpl = new ReportGeneratorImpl();
            }
            reportGeneratorImpl.generateSensitiveReport();
        } else {
            System.out.println("You are not authorized to create sensitive report");
        }
    }
}
