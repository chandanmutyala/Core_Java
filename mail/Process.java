package mail;

public class Process {
    ToUser to = new ToUser();
    FromUser from=new FromUser();

    public void process(){
        if(from.fromEmail=="from@abc.com" && from.fromPwd=="234"){
            to.inbox=from.message;
            System.out.println("Message from "+from.fromEmail+" : "+to.inbox);
        }else{
            System.out.println("Invalid credentials ");
        }

    }

}
