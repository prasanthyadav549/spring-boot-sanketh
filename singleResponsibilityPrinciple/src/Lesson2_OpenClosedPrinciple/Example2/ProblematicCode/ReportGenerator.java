package Lesson2_OpenClosedPrinciple.Example2.ProblematicCode;

public class ReportGenerator {

    public String generateReport(String reportType) {
        if(reportType.equals("PDF")) {
            return "Generating pdf report.";
        }
        else if(reportType.equals("Word")) {
            return "Generating word report.";
        }
        return "report type not supported";
    }
}
