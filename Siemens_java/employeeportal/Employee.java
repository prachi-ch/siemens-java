package employeeportal;

public class Employee {
    private String employeeName;
    private int employeeAge;
    private Gender employeeGender;
    private String employeeDesignation;
    private float employeeSalary;


    public Employee(String employeeName, int employeeAge, Gender employeeGender, String employeeDesignation, float emloyeeSalary) {
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeGender = employeeGender;
        this.employeeDesignation = employeeDesignation;
        this.employeeSalary = emloyeeSalary;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeAge() {
        return this.employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public Gender getEmployeeGender() {
        return this.employeeGender;
    }

    public void setEmployeeGender(Gender employeeGender) {
        this.employeeGender = employeeGender;
    }

    public String getEmployeeDesignation() {
        return this.employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public float getEmployeeSalary() {
        return this.employeeSalary;
    }

    public void setEmployeeSalary(float employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "{" +
            " employeeName='" + getEmployeeName() + "'" +
            ", employeeAge='" + getEmployeeAge() + "'" +
            ", employeeGender='" + getEmployeeGender() + "'" +
            ", employeeDesignation='" + getEmployeeDesignation() + "'" +
            ", employeeSalary='" + getEmployeeSalary() + "'" +
            "}";
    }


}
