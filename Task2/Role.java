package Task2;

public class Role {
    private String roleName;

    public Role(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    @Override
    public String toString() {
        return "Role{" +
                "name='" + roleName + '\'' +
                '}';
    }
   public boolean equals(Role role) {
        if (this.roleName == role.roleName)
            return true;
        else
            return false;
    }
}
