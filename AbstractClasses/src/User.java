public abstract class User {
    public void login(String userName, String password){
        if(userName.equals("admin") && password.equals("admin1")){
            System.out.println("Login Successful");
        }else
            System.out.println("Login Unsuccessful");
    }
    abstract void signUp();
}

