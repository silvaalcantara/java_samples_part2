package entities;

public class LegalPerson extends Person {
    
    int numberOfEmployess;

    public LegalPerson() {
        super();
    }

    public LegalPerson(String name, Double anualIncome, int numberOfEmployess) {
        super(name, anualIncome);
        this.numberOfEmployess = numberOfEmployess;
    }

    public int getNumberOfEmployess() {
        return this.numberOfEmployess;
    }

    public void setNumberOfEmployess(int numberOfEmployess) {
        this.numberOfEmployess = numberOfEmployess;
    }

    @Override
    public double taxesCalc() {
        if(numberOfEmployess > 10) {
            return (getAnualIncome() * 0.14);
        } else {
            return (getAnualIncome() * 0.16);
        }
    }

    

}