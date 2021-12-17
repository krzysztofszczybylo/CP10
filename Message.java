

public abstract class Message
{
    private String text;
    public Message(){text = "";};
    public Message(String text){
        this.text = text;
    };
    public String getText(){
        return this.text;
    }
    public void setText(String text){
        this.text = text;
    }
    public int charNumber(){
        return this.text.length();
    }
    public abstract String send();
    public static void main(String[] args){
        User u1 = new User("John", "Smith", "przykladowy@mail.com", "533546641"); 
        SMS sms = new SMS(u1, "siema xd");
        Email e = new Email(u1, "Powitanie", "Witam serdecznie!");
        System.out.println(sms.send());
        System.out.println(e.send());
        
    }
}
