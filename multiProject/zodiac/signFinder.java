
import java.util.Map;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class signFinder
{
    public static void main(String[] args){
        Map<String, String> zodiac = new Hashtable<>();

        zodiac.put("ARIES","   .-.   .-.\n  (_  \\ /  _)\n       |\n       |");
        zodiac.put("TAURUS","    .     .\n    '.___.'\n    .'   `.\n   :       :\n   :       :\n    `.___.'");
        zodiac.put("GEMINI","    ._____.\n      | |\n      | |\n     _|_|_\n    '     '");
        zodiac.put("CANCER","      .--.\n     /   _`.\n    (_) ( )\n   '.    /\n     `--'");
        zodiac.put("LEO","      .--.\n     (    )\n    (_)  /\n        (_,");
        zodiac.put("VIRGO","   _\n  ' `:--.--.\n     |  |  |_\n     |  |  | )\n     |  |  |/\n          (J");
        zodiac.put("LIBRA","        __\n   ___.'  '.___\n   ____________");
        zodiac.put("SCORPIUS","   _\n  ' `:--.--.\n     |  |  |\n     |  |  |\n     |  |  |  ..,\n           `---':");
        zodiac.put("SAGITTARIUS","          ...\n          .':\n        .'\n    `..'\n    .'`.");
        zodiac.put("CARPRICORN","            _\n    \\      /_)\n     \\    /`.\n      \\  /   ;\n       \\/ __.'");
        zodiac.put("AQUARIUS"," .-\"-._.-\"-._.-\n .-\"-._.-\"-._.-");
        zodiac.put("PISCES","     `-.    .-'\n        :  :\n      --:--:--\n        :  :\n     .-'    `-.");
        
        Scanner inp = new Scanner(System.in);
        System.out.println("birth month as number");
        int month = inp.nextInt();
        if (month>12){
            System.out.println("bad month");
            System.exit(0);
        }
        System.out.println("birth day");
        int day = inp.nextInt();
        int dayOfYear = getDayOfYear(month, day);
        String sign = getZodiacSign(dayOfYear).toUpperCase();
        System.out.println(zodiac.get(sign));
        
        
        
    }
    public static int getDayOfYear(int month, int day) {
        // Days in each month for a non-leap year
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int totalDays = day;

        // Sum days in previous months
        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonth[i];
        }

        return totalDays;
    }
    public static String getZodiacSign(int dayOfYear) {
        // Define the start and end days for each zodiac sign
        if (dayOfYear >= 20 && dayOfYear <= 49)
            return "Pisces"; // Feb 19 - Mar 20
        else if (dayOfYear >= 50 && dayOfYear <= 80)
            return "Aries"; // Mar 21 - Apr 19
        else if (dayOfYear >= 81 && dayOfYear <= 110)
            return "Taurus"; // Apr 20 - May 20
        else if (dayOfYear >= 111 && dayOfYear <= 141)
            return "Gemini"; // May 21 - Jun 20
        else if (dayOfYear >= 142 && dayOfYear <= 172)
            return "Cancer"; // Jun 21 - Jul 22
        else if (dayOfYear >= 173 && dayOfYear <= 204)
            return "Leo"; // Jul 23 - Aug 22
        else if (dayOfYear >= 205 && dayOfYear <= 235)
            return "Virgo"; // Aug 23 - Sep 22
        else if (dayOfYear >= 236 && dayOfYear <= 266)
            return "Libra"; // Sep 23 - Oct 22
        else if (dayOfYear >= 267 && dayOfYear <= 296)
            return "Scorpio"; // Oct 23 - Nov 21
        else if (dayOfYear >= 297 && dayOfYear <= 326)
            return "Sagittarius"; // Nov 22 - Dec 21
        else if (dayOfYear >= 327 && dayOfYear <= 355)
            return "Capricorn"; // Dec 22 - Jan 19
        else
            return "Capricorn"; // For days from Dec 22 to Dec 31
    }



    
    }

