import java.util.*;
/**
 * feettometers
 */
public class feettometers {

        public static void main(String[] args) {
        //statements here 
            System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Feet", "Meters","|","Meters","Feet");
            System.out.println("______________________________________________");
            for (double mainFeet = 1, mainMeter = 20; mainFeet <= 10 && mainMeter <= 65; mainFeet++, mainMeter = mainMeter+5){ 
                double meter = footToMeter(mainFeet);
                double foot = meterToFoot(mainMeter);         
                System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", mainFeet, meter, "|", mainMeter, foot);
                }
    }
    /** Convert from feet to meters */
    public static double footToMeter(double foot){
        double meter = 0.305 * foot;
        return meter;
    }

    /** Convert from meters to feet */
    public static double meterToFoot(double meter){
        double foot = 3.279 * meter;
        return foot;
    }
}