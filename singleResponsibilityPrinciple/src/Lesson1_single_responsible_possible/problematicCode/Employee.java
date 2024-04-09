package Lesson1_single_responsible_possible.problematicCode;

public class Employee {
    public int id;

    public int getId(){
        return this.id;
    }

    public String fetchBioData() {
        return "some bio data";
    }

    public double calculateSalary() {
        return 0;
    }

    public void printPerformanceData() {
        System.out.println("Some performence related data");
    }
}
