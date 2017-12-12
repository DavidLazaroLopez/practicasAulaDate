package trabajois2calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private final String name;
    private final Calendar birthdate;
    private final long MILISECONDS_IN_A_YEAR = (long)(1000*60*60*24*365.25);
    
    public Person(String name,Calendar birthdate){
        this.name=name;
        this.birthdate=birthdate;
    }
    public String getName(){
        return name;
    }
    public Calendar getBirthdate(){
        return birthdate;
    }
    public int getAge(){
        Calendar hoy= GregorianCalendar.getInstance();
        return (int)(milliSecondsToYear(hoy.getTimeInMillis()-birthdate.getTimeInMillis()));
    }
    private long milliSecondsToYear(long milisegundos){
        return milisegundos/MILISECONDS_IN_A_YEAR;
    }
}
