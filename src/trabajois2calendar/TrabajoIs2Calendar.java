package trabajois2calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TrabajoIs2Calendar {

    public static void main(String[] args) {
        Calendar date= GregorianCalendar.getInstance();
        date.set(2000,8,13);
        Person persona= new Person("Ana",date);
        System.out.println(persona.getName()+" tiene " + persona.getAge()+" años ");
    }
    
}
