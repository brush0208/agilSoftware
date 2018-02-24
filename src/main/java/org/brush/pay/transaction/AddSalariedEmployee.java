package org.brush.pay.transaction;

import org.brush.pay.model.classification.PaymentClassification;
import org.brush.pay.model.schedule.PaymentSchedule;

public class AddSalariedEmployee extends AddEmployeeTransaction{
    private double salary;

    public AddSalariedEmployee(Integer empid, String address, String name, double salary) {
        super(empid, address, name);
        this.salary = salary;
    }


    public PaymentClassification getClassification() {
        return null;
    }

    public PaymentSchedule getSchedule() {
        return null;
    }
}
