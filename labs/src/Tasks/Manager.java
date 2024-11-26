public class Manager extends Employee {

    public Manager (int id, String name, double salary) {
        super(id, name, salary);
    }


    @Override
    public double calculateBonus() {
        return 1.3 * salary;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " ID: " + id + " Salary: " + salary + " Bonus: " + calculateBonus();
    }
}
