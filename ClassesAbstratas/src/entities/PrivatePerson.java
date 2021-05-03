package entities;

public class PrivatePerson extends Person {
    private double health;

    public PrivatePerson(){
        super();
    }

    public PrivatePerson(String name, double annualIncome, double healthTax){
        super(name, annualIncome);
        this.setHealhTax(healthTax);
    }


    public double getHealth() {
        return health;
    }

    public void setHealhTax(double health) {
        this.health = health;
    }

    @Override
    public double taxes() {
        double tax = 0;
        double healthDeduction = 0;

        if (getAnnualIncome()< 20000){
            tax = getAnnualIncome()*0.15;
        }

        else{
            tax = getAnnualIncome()*0.25;
        }

        if(health > 0){
            healthDeduction = health / 2;
        }

        else{
            healthDeduction = 0;
        }

        return tax - healthDeduction;
    }


}
