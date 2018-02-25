package org.brush.pay.transaction;

import org.brush.pay.database.PayrollDatabase;
import org.brush.pay.model.Employee;
import org.brush.pay.model.classification.PaymentClassification;
import org.brush.pay.model.method.HoldMethod;
import org.brush.pay.model.method.PaymentMethod;
import org.brush.pay.model.schedule.PaymentSchedule;

public abstract class AddEmployeeTransaction implements Transaction{
    private Integer empid;
    private String address;
    private String name;

    public AddEmployeeTransaction(Integer empid, String address, String name) {
        this.empid = empid;
        this.address = address;
        this.name = name;
    }

    public abstract PaymentClassification getClassification();
    public abstract PaymentSchedule getSchedule();

    public void execute() {
        PaymentClassification classification = getClassification();
        PaymentSchedule schedule = getSchedule();
        PaymentMethod holdMethod = new HoldMethod();
        Employee employee = new Employee(empid, name, address);
        employee.setClassification(classification);
        employee.setMethod(holdMethod);
        employee.setSchedule(schedule);
        PayrollDatabase.getDatabse().addEmployee(empid,employee);

    }
}
