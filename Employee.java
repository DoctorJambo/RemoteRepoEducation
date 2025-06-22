public class Employee extends Person {
    private double salery;
    private double coeficient;

    public Employee(double salery) {
        this.salery = salery;
    }

    public Employee(double coeficient, double salery) {
        this(salery);
        this.coeficient = coeficient;
    }

    public double takeTheSalery() {
        double finalSalery = salery * coeficient;
        return finalSalery;
    }

    @Override
    public void getPersonalInfo() {
        System.out.println("name: " + getName() + " age: " + getAge() + " salery: " + takeTheSalery());
    }

    @Override
    public String toString() {
        return "Info via toString(): " +
                "\n salery: " + salery +
                "\n name: " + super.getName() +
                "\n age: " + super.getAge();
    }
}
