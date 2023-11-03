import java.util.Scanner;
class EventRegistration {
    String name;
    String nameOfEvent;
    double registrationFee;

    EventRegistration(String name, String nameOfEvent) {
        this.name = name;
        this.nameOfEvent = nameOfEvent;
    }

    public void registerEvent() {
        switch (nameOfEvent) {
            case "ShakeALeg":
                registrationFee = 100;
                break;
            case "Sing&Win":
                registrationFee = 150;
                break;
            case "Actathon":
                registrationFee = 70;
                break;
            case "PlayAway":
                registrationFee = 130;
                break;
            default:
                System.out.println("Please choose a valid event");
                return;
        }
        System.out.println("Thank You " + name + " for your participation. Your registration fee is: " + registrationFee);
    }
}

class SingleEventRegistration extends EventRegistration {
    int participantNo;

    SingleEventRegistration(String name, String nameOfEvent, int participantNo) {
        super(name, nameOfEvent);
        this.participantNo = participantNo;
    }

    @Override
    public void registerEvent() {
        switch (nameOfEvent) {
            case "ShakeALeg":
                registrationFee = 100;
                break;
            case "Sing&Win":
                registrationFee = 150;
                break;
            case "PlayAway":
                registrationFee = 130;
                break;
            default:
                System.out.println("Please choose a valid event");
                return;
        }
        System.out.println("Thank You " + name + " for your participation. Your registration fee is: " + registrationFee);
        System.out.println("You are participant no: " + participantNo);
    }
}

class TeamEventRegistration extends EventRegistration {
    int teamNo;
    int noOfParticipants;

    TeamEventRegistration(String name, String nameOfEvent, int teamNo, int noOfParticipants) {
        super(name, nameOfEvent);
        this.teamNo = teamNo;
        this.noOfParticipants = noOfParticipants;
    }

    @Override
    public void registerEvent() {
        switch (nameOfEvent) {
            case "ShakeALeg":
                registrationFee = 50 * noOfParticipants;
                break;
            case "Sing&Win":
                registrationFee = 60 * noOfParticipants;
                break;
            case "Actathon":
                registrationFee = 80 * noOfParticipants;
                break;
            case "PlayAway":
                registrationFee = 100 * noOfParticipants;
                break;
            default:
                System.out.println("Please choose a valid event");
                return;
        }
        System.out.println("Thank You " + name + " for your participation. Your registration fee is: " + registrationFee);
        System.out.println("You are team number: " + teamNo);
    }
}



public class ShowYourTalentRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for participant 1
        System.out.println("Enter the participant's name:");
        String name1 = scanner.nextLine();

        System.out.println("Enter the name of the event for participant 1:");
        String event1 = scanner.nextLine();

        System.out.println("Enter the participant number for participant 1:");
        int participantNo1 = scanner.nextInt();

        SingleEventRegistration participant1 = new SingleEventRegistration(name1, event1, participantNo1);
        participant1.registerEvent();

        // Input for team 1
        scanner.nextLine(); // Consume the newline character
        System.out.println("\nEnter the team's name:");
        String teamName = scanner.nextLine();

        System.out.println("Enter the name of the event for team 1:");
        String event2 = scanner.nextLine();

        System.out.println("Enter the team number for team 1:");
        int teamNo = scanner.nextInt();

        System.out.println("Enter the number of participants for team 1:");
        int noOfParticipants = scanner.nextInt();

        TeamEventRegistration team1 = new TeamEventRegistration(teamName, event2, teamNo, noOfParticipants);
        team1.registerEvent();

        // Input for participant 2
        scanner.nextLine(); // Consume the newline character
        System.out.println("\nEnter the participant's name for participant 2:");
        String name2 = scanner.nextLine();

        System.out.println("Enter the name of the event for participant 2:");
        String event3 = scanner.nextLine();

        System.out.println("Enter the participant number for participant 2:");
        int participantNo2 = scanner.nextInt();

        SingleEventRegistration participant2 = new SingleEventRegistration(name2, event3, participantNo2);
        participant2.registerEvent();

        scanner.close();
    }
}

