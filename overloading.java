public class overloading {
    public static void main(String[] args) {
        // Test cases
        long[] phoneNumbers1 = { 9452425421L, 7676765252L };
        Registration registration1 = new Registration("Kevin", "MN9891N", phoneNumbers1);
        System.out.println(registration1);

        long[] phoneNumbers2 = { 2345615451L, 6763562562L };
        Registration registration2 = new Registration("Julias", "123", "PN7878", phoneNumbers2);
        System.out.println(registration2);

        long[] phoneNumbers3 = { 9634524353L, 9887373737L };
        Registration registration3 = new Registration("Jammy", "45453", "765", phoneNumbers3);
        System.out.println(registration3);

        long[] phoneNumbers4 = { 9867456367L, 7645367356L };
        Registration registration4 = new Registration("Rose", "PN8934", "34356", phoneNumbers4);
        System.out.println(registration4);
    }
}

class Registration {
    String customerName;
    String passportNumber;
    String licenseNumber;
    String panCardNumber;
    int voterId;
    long[] telephoneNumbers;

    // Constructor with passport and phone numbers
    Registration(String customerName, String passportNumber, long[] telephoneNumbers) {
        this.customerName = customerName;
        this.passportNumber = passportNumber;
        this.telephoneNumbers = telephoneNumbers;
    }

    // Constructor with license, PAN card, and phone numbers
    Registration(String customerName, String licenseNumber, String panCardNumber, long[] telephoneNumbers) {
        this.customerName = customerName;
        this.licenseNumber = licenseNumber;
        this.panCardNumber = panCardNumber;
        this.telephoneNumbers = telephoneNumbers;
    }

    // Constructor with voter ID, license, and phone numbers
    Registration(String customerName, int voterId, String licenseNumber, long[] telephoneNumbers) {
        this.customerName = customerName;
        this.voterId = voterId;
        this.licenseNumber = licenseNumber;
        this.telephoneNumbers = telephoneNumbers;
    }

    // Constructor with PAN card, voter ID, and phone numbers
    Registration(String customerName, String panCardNumber, int voterId, long[] telephoneNumbers) {
        this.customerName = customerName;
        this.panCardNumber = panCardNumber;
        this.voterId = voterId;
        this.telephoneNumbers = telephoneNumbers;
    }

 
    public String toString() {
        StringBuilder result = new StringBuilder("Congratulations " + customerName + "!!! You have been successfully registered for our services with the following details:\n");

        if (passportNumber != null) {
            result.append("Passport number: ").append(passportNumber).append("\n");
        } else if (licenseNumber != null && panCardNumber != null) {
            result.append("License number: ").append(licenseNumber).append("\n");
            result.append("Pan card number: ").append(panCardNumber).append("\n");
        } else if (voterId != 0 && licenseNumber != null) {
            result.append("Voter id: ").append(voterId).append("\n");
            result.append("License Number: ").append(licenseNumber).append("\n");
        } else if (panCardNumber != null && voterId != 0) {
            result.append("Pan card Number: ").append(panCardNumber).append("\n");
            result.append("Voter id: ").append(voterId).append("\n");
        }

        result.append("Phone numbers: ");
        for (long phoneNumber : telephoneNumbers) {
            result.append(phoneNumber).append("\n");
        }

        return result.toString();
    }
}
