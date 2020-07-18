package entities;

public abstract class Person {

    private String name;
    private Double anualIncome;

    public Person(){
    };

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return this.anualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }

    public Person(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public abstract double taxesCalc();
}