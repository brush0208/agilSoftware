package org.brush.pay;

import org.brush.pay.database.PayrollDatabase;
import org.brush.pay.model.Employee;
import org.brush.pay.model.classification.PaymentClassification;
import org.brush.pay.model.classification.SalariedClassification;
import org.brush.pay.transaction.AddSalariedEmployee;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class PayrollTest {


    private static   int empid=1;
    @Before
    public void setUp(){

        AddSalariedEmployee salariedEmployee = new AddSalariedEmployee(empid, "home", "brush", 1000.0);
        salariedEmployee.execute();
        Employee employee = PayrollDatabase.getDatabse().getEmployee(empid);
    }
    @Test
    public void testAddSalariedEmployee()
    {


        Employee employee = PayrollDatabase.getDatabse().getEmployee(empid);
        assertEquals("brush",employee.getName());
    }

    @Test
    public void testClassification()
    {
        Employee employee = PayrollDatabase.getDatabse().getEmployee(empid);
        PaymentClassification classification = employee.getClassification();
        SalariedClassification classification1 = (SalariedClassification) classification;
        System.out.println(classification1.getClass().getName());
        assertNotNull (classification1);
    }
}
