class Employee {
    String name;
    int id;
    double salary;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Alice";
        emp1.id = 101;
        emp1.salary = 50000;

        Employee emp2 = new Employee();
        emp2.name = "Bob";
        emp2.id = 102;
        emp2.salary = 60000;

        emp1.display();
        System.out.println();
        emp2.display();
    }
}
