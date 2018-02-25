package org.brush.pay.transaction;

import org.brush.pay.model.classification.PaymentClassification;
import org.brush.pay.model.classification.SalariedClassification;
import org.brush.pay.model.schedule.MonthlySchedule;
import org.brush.pay.model.schedule.PaymentSchedule;

public class AddSalariedEmployee extends AddEmployeeTransaction{
    private double salary;

    public AddSalariedEmployee(Integer empid, String address, String name, double salary) {
        super(empid, address, name);
        this.salary = salary;
    }


    public PaymentClassification getClassification() {
        return new SalariedClassification();
    }

    public PaymentSchedule getSchedule() {
        return new MonthlySchedule();
    }
}
