package Task2;

public class Test {
    public static void main(String[] args) {

        Employee employee1 = new Employee("John Doe","IT",new Role("manager") );
        Employee employee2 = new Employee("Jane Smith", "HR", new Role("engineer"));

        System.out.println(employee1);
        System.out.println(employee2);

        Role managerRole = new Role("Manager");
        employee1.addRole(managerRole);
        employee2.addRole(managerRole);


        System.out.println("adding new roles :");
        System.out.println(employee1);
        System.out.println(employee2);


        employee1.removeRole(managerRole);


        System.out.println("remove role:");
        System.out.println(employee1);
    }
}
