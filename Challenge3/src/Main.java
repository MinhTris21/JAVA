import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("John",20,
                new Eyes("middle eyes", "badly hurt","green", false),
                new Eyes("left eyes", "fine", "red",false),
                new Heart("Heart1","normal",1000),
                new Stomach("Stomach","normal", true),
                new Skin("Skin","normal","white",301));

        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());
        Scanner scanner = new Scanner(System.in);
        boolean ready = false;
        while (!ready) {
            System.out.println("Chose an organ: " +
                    "\n\t 1.Left eye" +
                    "\n\t 2.Right eye" +
                    "\n\t 3. Heart " +
                    "\n\t 4. Stomach " +
                    "\n\t 5. Skin " +
                    "\n\t 6. Quit ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    patient.getLefteye().getDetails();
                    if (patient.getLefteye().isOpened()) {
                        System.out.println("Close your eyes");
                        if (scanner.nextInt() == 1) {
                            patient.getLefteye().close();
                        } else {
                            continue;
                        }

                    } else {
                        System.out.println("Open your eyes");
                        if (scanner.nextInt() == 1) {
                            patient.getLefteye().open();
                        } else {
                            continue;
                        }
                    }
                    break;
                case 2:
                    patient.getRighteye().getDetails();
                    if (patient.getRighteye().isOpened()) {
                        System.out.println("Close your eyes");
                        if (scanner.nextInt() == 1) {
                            patient.getRighteye().close();
                        } else {
                            continue;
                        }

                    } else {
                        System.out.println("Open your eyes");
                        if (scanner.nextInt() == 1) {
                            patient.getRighteye().open();
                        } else {
                            continue;
                        }
                    }
                    break;
                case 3:
                    patient.getHeart().getDetails();
                    System.out.println("\t\t 1. Change the heart rate");
                    if (scanner.nextInt() == 1) {
                        System.out.println("enter the new heart rate (bpm): ");
                        int newbpm = scanner.nextInt();
                        patient.getHeart().setBpm(newbpm);
                        System.out.println("New heart rate is: " + patient.getHeart().getBpm());
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    patient.getStomach().getDetails();
                    System.out.println("\t\t1. Digest");
                    if (scanner.nextInt() == 1) {
                        patient.getStomach().digest();
                    } else {
                        continue;
                    }
                    break;
                case 5:
                    patient.getSkin().getDetails();
                    break;
                default:
                    ready = true;
                    break;
            }
        }
    }
}