/*
Создайте класс Employee с атрибутами id, surname, age, salary, 
department, которые должны задаваться в конструкторе. В данном классе 
также создайте метод увеличения зар платы вдвое. Создайте второй 
класс EmployeeTest, в котором создайте 2 объекта класса Employee. 
Увеличьте зарплату каждому работнику вдвое с помощью метода и 
выведите на экран значение новой зар платы
*/

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Yaya", 19, 10000, "Not IT");
        Employee employee2 = new Employee(2, "Kuku", 19, 200000, "IT");
        employee1.raiseSalary();
        employee2.raiseSalary();
        System.out.println(employee1.getSalary() + " " + employee2.getSalary());
    }
}

class Employee {
    private int id;
    private String surname;
    private int age;
    private int salary;
    private String department;

    public Employee(int id, String surname, int age, int salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public void raiseSalary() {
        salary *= 2;
    }

    public int getSalary() {
        return salary;
    }
}
