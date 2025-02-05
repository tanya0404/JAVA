package neocolab;
import java.util.*;

enum Day{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}
public class enumm {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine().toUpperCase();

        Day cd;
        try{
            cd=Day.valueOf(st);
        
        }
        catch(Exception e){
            System.out.println("Invalid day");
            return;
        }

        switch (cd){
            case SUNDAY:
                System.out.println("MONDAY");
                break;
            case MONDAY:
                System.out.println("TUESDAY");
                break;
            case TUESDAY:
                System.out.println("WEDNESDAY");
                break;
            case WEDNESDAY:
                System.out.println("THURSDAY");
                break;
            case THURSDAY:
                System.out.println("FRIDAY");
                break;
            case FRIDAY:
                System.out.println("SATURDAY");
                break;
            case SATURDAY:
                System.out.println("SUNDAY");
                break;
        }
    }
}
