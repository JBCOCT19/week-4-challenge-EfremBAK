public class Admin extends Person{

    private String name;
    private String password;

    public Admin(String adminUserName, String admdinUserPassword) {
        this.name = adminUserName;
        this.password = admdinUserPassword;
    }

    public Admin(int id, String name, String email, String password, String adminUserName, String admdinUserPassword) {
        super(id, name, email, password);
        this.name = adminUserName;
        this.password = admdinUserPassword;
    }

    public Admin() {
    }

    @Override
    int getId() {
        return id;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    String getEmail() {
        return email;
    }

    @Override
    String getPassword() {
        return password;
    }

    @Override
     public void setId(int id) {
this.id =id;
    }


//    public void setPassword(String password) {
//        this.admdinUserPassword = password;
//    }


    @Override
   public  void setName(String name) {
this.name = name;
    }

    @Override
    public void setEmail(String email) {
this.email =email;
    }

    @Override
    public void setPassword(String password) {
this.password = password;
    }

    @Override
    public String login(){
        return "\n   welcome boss";
    }
    @Override
    public String method1() {

        return "you are in admin's page and want  to Add Student";
    }

    public String method2() {
        return "you are in admin's page and want  to Add Faculty";
    }

    public String method3() {
        return "you are in admin's page and want  to ADD";
    }

    public String method4() {
        return "you are in admin's page and want  to ADD";
    }

    public String method5() {
        return "you are in admin's page and want  to ADD";
    }

    public String method6() {
        return "you are in admin's page and want  to ADD";
    }

    public String method7() {
        return "you are in admin's page and want  to ADD";
    }

    public String method8() {
        return "you are in admin's page and want  to ADD";
    }
    @Override
    public String logout(){
        return "see you again admin" ;
    }
}
