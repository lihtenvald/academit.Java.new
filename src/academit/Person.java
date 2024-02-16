package academit;

import java.time.LocalDateTime;

public class Person {
    private String name;
    private String middleName;
    private String familyName;
    private int age;


    public Person(String name, String middleName, String familyName, int age) {
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person :\n" + name + "\n" + middleName + "\n" + familyName + "\n" + age + " years";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public int getYearOfBirth() {
        return (LocalDateTime.now().getYear() - this.age);
    }


}
