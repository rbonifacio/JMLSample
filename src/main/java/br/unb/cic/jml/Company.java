package br.unb.cic.jml;

import java.util.HashSet;
import java.util.Set;

public class Company {

    private String name;
    private Set<Department> departments;

    public Company() {
        departments = new HashSet<>();
    }

    public void addDepartment(Department d) {
        departments.add(d);
    }

}

