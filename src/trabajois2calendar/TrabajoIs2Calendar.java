package trabajois2calendar;

import java.util.Date;

public class TrabajoIs2Calendar {

    public static void main(String[] args) {
        Person persona = new Person("Juana",new Date(01,9,15));
        System.out.println(persona.getName()+" tiene " + persona.getAge()+" años ");
    }
    
}
