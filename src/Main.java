import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Juan", "Pediatria");
        Patient patient = new Patient("Alejandra", "alejandra@mail.com");

        patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("23456789");
        System.out.println(patient.getPhoneNumber());
        //UIMenu.showMenu();

    }
}