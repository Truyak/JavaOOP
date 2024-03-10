public class User {
    private String userName;
    private String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void login(String userName, String password){
        if(this.userName.equals(userName) && this.password.equals(password)){
            System.out.println("Login Successful");
        }
        else{
            System.out.println("Login Unsuccessful");
        }
    }

    public void sendMessage(){
        System.out.println("Message sent!");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
