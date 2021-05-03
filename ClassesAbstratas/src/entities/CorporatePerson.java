package entities;

public class CorporatePerson extends Person{
    private int employeeNumber;

    public CorporatePerson(){
       super();
    }

    public CorporatePerson(String name, double annualIncome, int employeeNumber){
        super(name, annualIncome);
        this.setEmployeeNumber(employeeNumber);
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }


    @Override
    public double taxes() {
        double tax = 0;

        if (employeeNumber <= 10){
            tax = getAnnualIncome() * 0.16;
        }
        else{
            tax = getAnnualIncome() * 0.14;
        }

        return tax;
    }
}
