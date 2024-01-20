package Task2;

import java.util.ArrayList;
import java.util.List;

public class Employee{
    private String name;
    private String department;
    public List<Role> roles;

    public Employee(String name, String department, Role initialRole) {
        this.name = name;
        this.department = department;
        this.roles = new ArrayList<>();
        this.roles.add(initialRole);
    }
    public void addRole(Role role){
        roles.add(role);
    }
    public void removeRole(Role role){
        roles.remove(role);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", roles=" + roles +
                '}';
    }
}