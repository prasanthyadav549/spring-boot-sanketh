package Lesson1_single_responsible_possible.betterCode;

public class Employee {

    private final int id;

    public Employee(int id) {
        this.id = id;
    }

    public int getEmployeeId() {
        return this.id;
    }
    // why we don't have setter generally client does not change the employeeId

    // now the class will change only when the structure of the employee changes
    /*
      The employee class is only responsible for the entity management of the employee
      or how the employee looks like .


     */

}
