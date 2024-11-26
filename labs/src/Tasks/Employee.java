public abstract class Employee {

    final int  id;
    private String name;
    protected double salary;

    public Employee (int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract public double calculateBonus();

    @Override
    public String toString() {
        return "Name: " + name + " ID: " + id + " Salary: " + salary;
    }
}
