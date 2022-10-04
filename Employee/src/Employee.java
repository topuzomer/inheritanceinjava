import java.util.SplittableRandom;

public class Employee {

    private String name;
    private String employeeNumber;
    private String department;
    private int age;
    private int salary;

    public Employee(String name,String employeeNumber,String department,int age,int salary)
    {
        this.name=name;
        this.employeeNumber=employeeNumber;
        this.department=department;
        this.age=age;
        this.salary=salary;
    }

    public void showInfo(){
        System.out.println("name : " + name);
        System.out.println("department : " + department);
        System.out.println("employee number : " + employeeNumber);
        System.out.println("age : " + age);
        System.out.println("salary  : " + salary);

    }

    public String getName()
    {
        return name;
    }
    public String getEmployeeNumber()
    {
        return employeeNumber;
    }
    public String getDepartment()
    {
        return department;
    }
    public int getAge()
    {
        return age;
    }
    public int getSalary()
    {
        return salary;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmployeeNumber(String employeeNumber){
        this.employeeNumber=employeeNumber;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }



}
