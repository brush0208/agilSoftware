package org.brush.pay.transaction;

import org.brush.pay.model.classification.PaymentClassification;
import org.brush.pay.model.schedule.PaymentSchedule;

public class AddHourlyEmployee extends AddEmployeeTransaction {

    private int hourlyRate;

    public AddHourlyEmployee(Integer empid, String address, String name, int hourlyRate) {
        super(empid, address, name);
        this.hourlyRate = hourlyRate;
    }

    public PaymentClassification getClassification() {
        return null;
    }

    public PaymentSchedule getSchedule() {
        return null;
    }

    public void execute() {

    }
}
