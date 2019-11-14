abstract class Person {
    int id;
    String name;
    String email;
    String password;

    Person() { }
    Person(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

// abstract getters
    abstract int getId();
    abstract String getName();
    abstract String getEmail();
    abstract String getPassword();

//    abstract setters
    abstract void setId(int id);
    abstract void setName(String name);
    abstract void setEmail(String email);
    abstract void setPassword(String password);


    abstract String login();
    abstract String logout();
    abstract String method1();
}
