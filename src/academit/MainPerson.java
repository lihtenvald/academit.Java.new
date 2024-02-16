package academit;

public class MainPerson {


public static void main(String[] args) {

    Person Valya = new Person("Valya", "Vladimirovna", "Lihtenvald", 28);

    System.out.println("Сначала она была " + Valya.getName() );
    Valya.setAge(-1);
    Valya.setName("Valentina");
    System.out.println("Потом она стала " + Valya.getName() + " "  + Valya.getMiddleName());

    System.out.println(Valya);

    int YearOfBirth = Valya.getYearOfBirth();
    System.out.println("Год рождения " + YearOfBirth);

 }
}