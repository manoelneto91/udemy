package entities;

public abstract class Person {
    private String name;
    private double annualIncome;

    public Person() {
    }

    public Person(String name, double annualIncome) {
        this.setName(name);
        this.setAnnualIncome(annualIncome);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public abstract double taxes();
}