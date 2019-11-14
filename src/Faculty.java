public class Faculty extends Person {

    public Faculty() {
        super();
    }

    public Faculty(int id, String name, String email, String password) {
        super(id, name, email, password);
    }

    @Override
    int getId() {
        return 0;
    }

    @Override
    String getName() {
        return null;
    }

    @Override
    String getEmail() {
        return null;
    }

    @Override
    String getPassword() {
        return null;
    }

    @Override
    void setId(int id) {

    }

    @Override
    void setName(String name) {

    }

    @Override
    void setEmail(String email) {

    }

    @Override
    void setPassword(String password) {

    }
    @Override
    public String login(){
        return "welcome instructor";
    }
    @Override
    public String method1() {
        return "Dont fail all student whose names start with \"e\", please.";
    }
    @Override
    public String logout(){
        return "have a good rest of the day ";
    }
}