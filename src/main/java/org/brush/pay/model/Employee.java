package org.brush.pay.model;

import org.brush.pay.model.affiliation.Affiliation;
import org.brush.pay.model.classification.PaymentClassification;
import org.brush.pay.model.method.PaymentMethod;
import org.brush.pay.model.schedule.PaymentSchedule;

public class Employee {
    private Integer id;
    private String name;
    private String address;
    private PaymentMethod method;
    private PaymentClassification classification;
    private PaymentSchedule schedule;
    private Affiliation affiliation;

    public PaymentSchedule getSchedule() {
        return schedule;
    }

    public void setSchedule(PaymentSchedule schedule) {
        this.schedule = schedule;
    }

    public Employee(Integer id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public PaymentMethod getMethod() {
        return method;
    }

    public void setMethod(PaymentMethod method) {
        this.method = method;
    }

    public PaymentClassification getClassification() {
        return classification;
    }

    public void setClassification(PaymentClassification classification) {
        this.classification = classification;
    }

    public Affiliation getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(Affiliation affiliation) {
        this.affiliation = affiliation;
    }
}
