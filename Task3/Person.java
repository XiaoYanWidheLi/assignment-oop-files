package Task3;

//Task 3. Don't repeat yourself
//    We want to add a check in the following constructors: if name is null to throw a NullPointerException:
public class Person{

    private String name;
    private String phone;
    private String email;

    public Person(String name){
        if(name==null){
            throw new NullPointerException("Name cannot be null");
        }
        this.name = name;
    }
    private boolean isValidEmail(String email) {
        return email != null && email.contains("@");
    }
    public Person(String name, String email){
        this(name);
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email: " + email);
        }
        this.email = email;
    }

    public Person(String name, String email, String phone){
        this(name,email);
        this.phone = phone;
    }

    public String name() { return name;  }
    public String email(){ return email; }
    public String phone(){ return phone; }

    @Override
    public String toString(){
        return String.format("%s  %s  %s", name, (email==null?"":email), (phone==null?"":phone));
    }
}



// but we do not want code duplication. Change the constructors so that there is no code duplication. Hint: do the null check in the simplest constructor