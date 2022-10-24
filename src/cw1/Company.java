package cw1;

import java.io.Serializable;

class Company implements Serializable {
    public static final int MAX_EMPLOYESS = 3;
    private Employee[] employees = new Employee[MAX_EMPLOYESS];
    private int index = 0;

    public void add(Employee employee) {
        employees[index] = employee;
        index++;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (Employee employee : employees) {
            builder.append(employee.toString());
            builder.append("\n");
        }
        return builder.toString();
    }
}

