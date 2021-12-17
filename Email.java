

public class Email extends Message
{
    private String subject;
    private User recipient;
    public Email(User recipient, String subject, String text){
        super(text);
        this.recipient = recipient;
        this.subject = subject;
    }
    public String getSubject(){
        return this.subject;
    }
    public void setSubject(String subject){
        this.subject  = subject;
    }
    public String send(){
        return "Recipent: " + recipient.getFName() + " " + recipient.getLName() + "\nEmail address: " + recipient.getEmail() +  "\nMessage: " + getText() + "\nNumber of characters: " + charNumber();
    }
    
}
