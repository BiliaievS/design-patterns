package com.patterns.gof.structural.proxy;

/**
 * @author Sergii Biliaiev
 * Created on 18/08/2019.
 */
public class ReportGeneratorImplProxyMain {

    public static void main(String[] args) {
        Role role = new Role();
        role.setRole("manager");
        ReportGeneratorImplProxy reportGeneratorProxy = new ReportGeneratorImplProxy(role);
        reportGeneratorProxy.displayReportTemplate("pdf", 200);
        reportGeneratorProxy.generateComplexReport("pdf", 200);
        reportGeneratorProxy.generateSensitiveReport();
    }
}
