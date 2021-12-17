

public class SMS extends Message
{
    private User recipient;
 
    public SMS(User recipient, String text){
        super(text);
        this.recipient = recipient;
    }
    public String send(){
        return "Recipient: " + recipient.getFName() + " " + recipient.getLName() + "\nPhone number: " + recipient.getPhoneNumber() + "\nMessage: " + getText() + "\nNumber of characters: " + charNumber();
    }
    
}
