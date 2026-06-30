// Patient class
class Patient {
    private String patientName;
    private String nationalID;

    public Patient(String patientName, String nationalID) {
        this.patientName = patientName;
        this.nationalID = nationalID;
    }

    public String getpatientName() {
        return patientName;
    }

    public String getnationalID() {
        return nationalID;
    }
}

// IDvalidator class

class IdValidator {

    public static boolean validateId(String nationalID) {
        return nationalID.length() == 10 || nationalID.length() == 17;
    }
}

// SmsService class

class SmsService {
    public void sendSmsConfirmation(Patient patient) {
        if (IdValidator.validateId(patient.getnationalID())) {
            System.out.println("Sending SMS to " + patient.getpatientName() + ": Registration successful.");

        } else {
            System.out.println("Invalid National ID. SMS not sent.");
        }
    }
}

// main class
public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Halima", "1234567890");

        SmsService smsService = new SmsService();
        smsService.sendSmsConfirmation(patient);
    }
}
