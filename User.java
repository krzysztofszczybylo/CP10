

public class User
{
    private String fName;
    private String lName;
    private String email;
    private String phoneNumber;
    
    public User(String fName, String lName, String email, String phoneNumber){
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public String getFName(){
        return this.fName;
    }
    public String getLName(){
        return this.lName;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setFName(String fName){
        this.fName = fName;
    }
    public void setLName(String lName){
        this.lName = lName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
}

