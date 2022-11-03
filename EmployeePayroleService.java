package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayroleService {
    public enum IOService {
        COONSOLE_IO, FILE_IO, DB_IO, REST_IO
    }

    ;
    private List<EmployeePayrollData> employeePayrollList;

    public EmployeePayroleService() {
    }

    public EmployeePayroleService(List<EmployeePayrollData> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }

    public static void main(String[] args) {
        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
        EmployeePayroleService employeePayroleService = new EmployeePayroleService(employeePayrollList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayroleService.readEmployeePayrollData(consoleInputReader);
        employeePayroleService.writeEmployeePayrollData();
    }

    private void readEmployeePayrollData(Scanner consoleInputReader) {
        System.out.println("Enter Employee ID: ");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter Employee Name: ");
        String name = consoleInputReader.next();
        System.out.println("Enter Employee Salary: ");
        double salary = consoleInputReader.nextDouble();
        employeePayrollList.add((new EmployeePayrollData(id, name, salary)));
    }

    private void writeEmployeePayrollData() {
        System.out.println("\nWriting Employee Payroll Roaster to Console\n" + employeePayrollList);
    }
}
