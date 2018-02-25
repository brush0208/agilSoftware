package org.brush.pay;

import org.brush.pay.database.PayrollDatabase;
import org.brush.pay.model.Employee;
import org.brush.pay.transaction.AddSalariedEmployee;
import org.junit.Test;
import static org.junit.Assert.*;


public class PayrollTest {

    @Test
    public void testAddSalariedEmployee()
    {
        int empid=1;

        AddSalariedEmployee salariedEmployee = new AddSalariedEmployee(empid, "home", "brush", 1000.0);
        salariedEmployee.execute();
        Employee employee = PayrollDatabase.getDatabse().getEmployee(empid);
        assertEquals("brush",employee.getName());
    }
}
