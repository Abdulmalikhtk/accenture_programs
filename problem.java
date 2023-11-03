import java.util.Scanner;

public class problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.println("Registering for Single Event or Team Event");
System.out.println("Please select an option:");
System.out.println("1. Single Event");
System.out.println("2. Team Event");

int choice = scanner.nextInt();
scanner.nextLine(); // Consume the newline character

if (choice == 1) {
    System.out.println("You have selected Single Event.");
    SingleEventRegistration se=new SingleEventRegistration(null, null, choice);
    System.out.println("enter the name");
    se.name=scanner.nextLine();
    System.out.println("enter the name of Event");
    
} else if (choice == 2) {
    // Registration for Team Event
    // Add your code here
    System.out.println("You have selected Team Event.");
} else {
    System.out.println("Invalid choice. Please try again.");
}

        // // For SingleEventRegistration
        // System.out.println("Enter your name:");
        // String name = scanner.nextLine();
        // System.out.println("Enter the name of the event (ShakeALeg, Sing&Win, PlayAway):");
        // String eventNameSingle = scanner.nextLine();

        // SingleEventRegistration singleEventRegistration = new SingleEventRegistration(name, eventNameSingle, 1);
        // singleEventRegistration.registerEvent();
        // System.out.println("You are participant no: " + singleEventRegistration.participantNo);

        // // For TeamEventRegistration
        // System.out.println("Enter your name:");
        // String nameTeam = scanner.nextLine();
        // System.out.println("Enter the name of the event (ShakeALeg, Sing&Win, Actathon, PlayAway):");
        // String eventNameTeam = scanner.nextLine();
        // System.out.println("Enter the number of participants:");
        // int noOfParticipants = scanner.nextInt();
        // System.out.println("Enter the team number:");
        // int teamNo = scanner.nextInt();

        // TeamEventRegistration teamEventRegistration = new TeamEventRegistration(nameTeam, eventNameTeam, noOfParticipants, teamNo);
        // teamEventRegistration.registerEvent();
        // System.out.println("Team number: " + teamEventRegistration.teamNo);

        // scanner.close();
    }
}

class EventRegistration{
    String name;
    String nameOfEvent;
    double registrationFee;
    EventRegistration(String name,String nameOfEvent){
        this.name=name;
        this.nameOfEvent=nameOfEvent;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getNameOfEvent(){
        return nameOfEvent;
    }
    public void setNameOfEvent(String nameOfEvent){
        this.nameOfEvent=nameOfEvent;
    }
    public double getRegistrationFee(){
        return registrationFee;
    }
    public void setRegistrationFee(double registrationFee){
        this.registrationFee=registrationFee;
    }
    // public void registerEvent(){
    //     String event=nameOfEvent.toLowerCase();
    //     switch(event){
    //         case "shakealeg":
    //             registrationFee=100;
    //             break;
    //         case "sing&win":
    //             registrationFee=150;
    //             break;
    //         case "actathon":
    //              registrationFee=70;
    //              break;
    //         case "playaway":
    //             registrationFee=130;
    //             break;
    //         default:
    //             registrationFee=0;
    //             break;
    //     }

    //}
    public void registerEvent() {
    String event = nameOfEvent.toLowerCase(); // Convert the input to lowercase
    double registrationFee = 0; // Initialize the registration fee
    
    // Auto-fill options based on input letters
    if (event.startsWith("sha")) {
        nameOfEvent = "ShakeALeg";
        registrationFee = 100;
    } else if (event.startsWith("sin")) {
        nameOfEvent = "Sing&Win";
        registrationFee = 150;
    } else if (event.startsWith("act")) {
        nameOfEvent = "Actathon";
        registrationFee = 70;
    } else if (event.startsWith("pla")) {
        nameOfEvent = "PlayAway";
        registrationFee = 130;
    }
    
    System.out.println("Registration fee for " + nameOfEvent + " event is: " + registrationFee);
}

}

class SingleEventRegistration extends EventRegistration{
    int participantNo;
    public SingleEventRegistration(String name,String nameOfEvent,int participantNo){
          super(name, nameOfEvent);
        //   this.name=name;
        //   this.nameOfEvent=nameOfEvent;
          this.participantNo= generateParticipantNumber();
    }
    private int generateParticipantNumber() {
        // Generate a random participant number
        return (int) (Math.random() * 1000);
    }
    //@Override;
    public void registerEvent(){
        switch (super.getNameOfEvent()) {
            case "ShakeALeg":
                setRegistrationFee(100);
                break;
            case "Sing&Win":
                setRegistrationFee(150);
                break;
            case "PlayAway":
                setRegistrationFee(130);
                break;
            default:
                System.out.println("Invalid event name.");
                return;
        }
        System.out.println("Registration fee for " + getNameOfEvent() + " event is: " + getRegistrationFee());
    }
    }

    // super.getName();
    // super.setName();
    // super.getEventName();
    // super.setEventName();
    //  public void registerEvent() {
    //     switch (super.eventName) {
    //         case "ShakeALeg":
    //             registrationFee = 100;
    //             break;
    //         case "Sing&Win":
    //             registrationFee = 150;
    //             break;
    //         case "PlayAway":
    //             registrationFee = 130;
    //             break;
    //         default:
    //             System.out.println("Invalid event name.");
    //             return;
    //     }
    // }

//     class SingleEventRegistration{
//     String name;
//     String eventName;
//     double registrationFee;
//     int participantNumber;
    
//     SingleEventRegistration(String name, String eventName) {
//         this.name = name;
//         this.eventName = eventName;
//     }
    
//     public String getName() {
//         return name;
//     }
    
//     public void setName(String name) {
//         this.name = name;
//     }
    
//     public String getEventName() {
//         return eventName;
//     }
    
//     public void setEventName(String eventName) {
//         this.eventName = eventName;
//     }
    
//     public void registerEvent() {
//         switch (eventName) {
//             case "ShakeALeg":
//                 registrationFee = 100;
//                 break;
//             case "Sing&Win":
//                 registrationFee = 150;
//                 break;
//             case "PlayAway":
//                 registrationFee = 130;
//                 break;
//             default:
//                 System.out.println("Invalid event name.");
//                 return;
//         }
        
//         participantNumber = generateParticipantNumber();
        
//         System.out.println("Registration fee for " + eventName + " event is: " + registrationFee);
//         System.out.println("Participant number: " + participantNumber);
//     }
    
//     private int generateParticipantNumber() {
//         // Generate a random participant number
//         return (int) (Math.random() * 1000);
//     }
class TeamEventRegistration extends EventRegistration{
    int noOfParticipants;
    int teamNo;
    public TeamEventRegistration(String name,String nameOfEvent,int noOfParticipants,int teamNo){
        super(name, nameOfEvent);
        this.noOfParticipants=noOfParticipants;
        this.teamNo=(int)Math.random() * 1000;
    }
    public void registerEvent(){
          double baseFee = 0;
        switch (nameOfEvent) {
            case "ShakeALeg":
                baseFee = 50;
                break;
            case "Sing&Win":
                baseFee = 60;
                break;
            case "Actathon":
                baseFee = 80;
                break;
            case "PlayAway":
                baseFee = 100;
                break;
            default:
                System.out.println("Invalid event name.");
                return;
        }
        
        double registrationFee = baseFee * noOfParticipants;
        
        System.out.println("Registration fee for " + super.getNameOfEvent() + " event with " + noOfParticipants + " participants is: " + registrationFee);
        System.out.println("Team number: " + teamNo);
    }
    }

