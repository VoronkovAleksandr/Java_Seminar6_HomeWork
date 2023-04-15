public class Homework {
    public static void main(String[] args) {

        Employee person1 = new Employee(35, "Ivan", "Ivanov", 35.0);
        Employee person2 = new Employee(35, "Ivan", "Ivanov", 35.0);
        Employee person3 = new Employee(40, "Petr", "Petrov",50.0);
        Employee person4 = new Employee(40, "Petr", "Petrov");

        System.out.println(person1.equals(person2));
        System.out.println(person2.equals(person3));
        System.out.println(person3.equals(person4));
        System.out.println(person3.equals(person1));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());
        System.out.println(person4.hashCode());

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);

        System.out.println(person1.getFullName());
        System.out.println(person2.getFullName());
        System.out.println(person3.getFullName());
        System.out.println(person4.getFullName());
        System.out.println(person1.olderThan(person2));
        System.out.println(person3.olderThan(person1));

        person4.upgrade(20.0);
        System.out.println(person4);
    }
}
/**
 * Переопределить:
 * 1. Методы equals и hashCode (поля, которые должны там участвовать, нужно определить самостоятельно)
 * 2. Метод toString (в любом формате)
 *
 * Реализовать методы:
 * String getFullName() - возвращает полное имя сотрудника
 * boolean olderThan(Employee e) - возвращает true, если текущий сотрудник старше чем тот, который передали в метод.
 * void upgrade(double salary) - повышает зарплату сотрудника НА salary единиц. Пример: Было 50.0, upgrade(20.0) -> стало 70.0
 */
