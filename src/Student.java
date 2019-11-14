public class Student extends Person {

    public Student(){
        super();
        name = "efrem";
    }

    public Student(int id, String name, String email, String password) {
        super(id, name, email, password);
    }


    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;//you will fetch name of the student from this variable
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setId(int id) {
this.id = id;
    }

    @Override
    public void setName(String name) {
this.name = name; //you will catch name of the student in this variable
    }

    @Override
    public void setEmail(String email) {
this.email = email;
    }

    @Override
    public void setPassword(String password) {
this.password = password;
    }
    @Override
    public String login(){
        return "welcome ";
    }
     @Override
        public String method1() {
        return "Hey Student, this is your playground! Do as you please!";
    }
    @Override
    public String logout(){
        return "hope you learned something today!" ;
    }
}
