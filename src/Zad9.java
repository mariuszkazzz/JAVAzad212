public class Zad9 {
    public static void main(String[] args) {
        String firstName, middleName, lastName;
        firstName = "Mariusz";
        middleName = "Kazibudzki";
        lastName = "Szczepan";

        char firstinitial, middleinitial, lastinitial;
        firstinitial = firstName.charAt(0);
        middleinitial = middleName.charAt(0);
        lastinitial = lastName.charAt(0);

        System.out.println(firstinitial + ", " + middleinitial + ", " + lastinitial);


    }
}
