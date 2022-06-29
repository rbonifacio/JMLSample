package br.unb.cic.jml;

public class Employee {

    //@ spec_public
    private String name;

    //@ spec_public
    private double salary;

    //@ spec_public
    private double bonus;

    //@ public invariant this.bonus >= 0;
    //@ public invariant this.salary >= 0;


    //@ public normal_behavior
    //@   requires salary >= 0;
    //@   ensures this.name == name;
    //@   ensures this.salary == salary;
    //@   ensures this.bonus == 0.0;
    //@ pure
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.bonus = 0.0;
    }


    //@ public normal_behavior
    //@   requires percentage > 0 & percentage < 100;
    public void cutSalary(int percentage) {
        salary = salary - (salary / percentage);
    }

    //@ public normal_behavior
    //@   ensures \result >= 0;
    //@ pure
    public double totalSalary() {
        return salary - salary * bonus;
    }

}
