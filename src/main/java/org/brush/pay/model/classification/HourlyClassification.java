package org.brush.pay.model.classification;

import org.brush.pay.model.method.TimeCard;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HourlyClassification implements PaymentClassification {

    private int hourlyRage;
    private List<TimeCard> timeCards =new ArrayList<TimeCard>(7);
    public void addTimeCard(TimeCard timeCard){
        timeCards.add(timeCard);
    }
}
