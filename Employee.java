import java.util.Objects;

public class Employee {
    private int age;
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(int age, String firstName, String lastName, double salary){
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public Employee(int age, String firstName, String lastName){
        this(age, firstName, lastName, 50.0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, firstName, lastName, salary);
    }
    @Override
    public String toString() {
        return "Работник [" +
                "Фамилия: " + lastName + ", " +
                "Имя: " + firstName + ", " +
                "Возраст: " + age + ", " +
                "Зарплата: " + salary +
                ']';
    }
    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }

    public boolean olderThan(Employee e){
        if (this.age > e.age) {
            return  true;
        }
        return false;
    }

    public void upgrade(double salary){
        this.salary += salary;
    }

}

