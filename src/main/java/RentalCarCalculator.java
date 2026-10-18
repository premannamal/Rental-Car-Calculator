import java.util.*;
public class RentalCarCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the pickup date");
        String pickup_date = scanner.nextLine();
        System.out.println("Please enter the number of days for rental");
        int number_of_days = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Do you want an electronic toll tag at $3.95 per day? (yes/no)");
        String electronic_toll_tag_response = scanner.nextLine();
        System.out.println("Do you want a GPS at $2.95 a day? (yes/no)");
        String GPS_response = scanner.nextLine();
        System.out.println("Do you want roadside assistance at $3.95 a day? (yes/no)");
        String roadside_response = scanner.nextLine();
        System.out.println("What is your current age?");
        int age = scanner.nextInt();

        //Calculate basic car rental
        float basic_car_rental = number_of_days * 29.99f;

        float electronic_toll_tag_charges = 0.0f;

        //Calculate electronic_toll_charges
        if ( electronic_toll_tag_response.equals("yes") ) {
            electronic_toll_tag_charges = number_of_days * 3.95f;
        } else {
            electronic_toll_tag_charges = 0.00f;
        }

        float GPS_charges = 0.0f;

        //Calculate GPS_charges
        if (GPS_response.equals("yes") ) {
            GPS_charges = number_of_days * 2.95f;
        } else {
            GPS_charges = 0.00f;
        }

        //Calculate roadside_assistance_charges
        float roadside_assistance_charges = 0.0f;
        if (roadside_response.equals("yes") ) {
            roadside_assistance_charges = number_of_days * 3.95f;
        } else {
            roadside_assistance_charges = 0.00f;
        }

        //Calculate age surcharge
        float underage_drivers_surcharge = 0.0f;
        if (age < 25) {
            underage_drivers_surcharge = 29.99f * 0.3f * number_of_days;
        } else {
            underage_drivers_surcharge = 0.00f;
        }

        //System.out.println("debugs");
        //System.out.println(electronic_toll_tag_charges);
        //System.out.println(GPS_charges);
        //System.out.println(roadside_assistance_charges);

        //Calculate grand total
        float total_cost = basic_car_rental + electronic_toll_tag_charges + GPS_charges + roadside_assistance_charges + underage_drivers_surcharge;
        float options_cost = electronic_toll_tag_charges + GPS_charges + roadside_assistance_charges;
        System.out.println(" ***** Summary of charges *****");
        System.out.println(" basic_car_rental = " + basic_car_rental);
        System.out.println(" options_cost = " + options_cost);
        System.out.println(" underage_drivers_surcharge = " + underage_drivers_surcharge);
        System.out.println(" total cost = " + total_cost);
    }
}
