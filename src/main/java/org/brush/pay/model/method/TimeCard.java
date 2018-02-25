package org.brush.pay.model.method;

import java.util.Date;

public class TimeCard {

    private Date itsDate;
    private double itsHours;

    public TimeCard(Date itsDate, double itsHours) {
        this.itsDate = itsDate;
        this.itsHours = itsHours;
    }
    public Date getDate(){return itsDate;}
    public double getHours(){return itsHours;}
}
