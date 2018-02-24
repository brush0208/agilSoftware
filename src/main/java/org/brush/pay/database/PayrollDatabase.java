package org.brush.pay.database;

import org.brush.pay.model.Employee;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 汉清
 */
public class PayrollDatabase {
    private PayrollDatabase(){}
    private static PayrollDatabase database= new  PayrollDatabase();
    public static PayrollDatabase getDatabse(){return database;}
    private Map<Integer,Employee> employees = new HashMap<Integer,Employee>();
    public Employee getEmployee(Integer empid){return employees.get(empid);}
    public void addEmployee(Integer empid,Employee employee){employees.put(empid,employee);}
    public void clear() {employees.clear();}
}
