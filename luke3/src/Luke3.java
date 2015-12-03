/**
 * Created by tobiast on 03/12/15.
 */
public class Luke3 {


    // Programmererenes dag feires hvert år på den 256. dagen (eller 2^8. dagen om du vil) i året.
    // Hvor mange ganger fra og med år 1 til og med år 2015 har dette forekommet på en fredag om en antar at
    // 1. januar år 1 var en fredag i, samt at dagens skuddårsregler og kalendersystem har vært gjeldende
    // i hele perioden?
    // Hint: Skuddår er forøvrig et år som er delelig på 4 og ikke 100 med mindre det er delelig på 400

    public static void main(String[] args) {
        int daysSince010101 = 256;
        int numberOfFirdays = 0;
        for (int year=1;year<2016;year++){
            if (daysSince010101 % 7 == 0) numberOfFirdays++;
            daysSince010101 += isLeapYear(year) ? 366 : 365;
        }
        System.out.println("Number of fridays " + numberOfFirdays);
    }

    private static boolean isLeapYear(int year){
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }
}
