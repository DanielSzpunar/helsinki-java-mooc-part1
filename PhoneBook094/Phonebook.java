import java.util.ArrayList;

public class Phonebook {
    ArrayList<Person> phoneBook = new ArrayList<Person>();

    public void add(String name, String number) {
        phoneBook.add(new Person(name, number));

    }
    public void printAll() {
        for(Person i: this.phoneBook) {
            System.out.println(i);
        }
    }
    public String searchNumber(String name) {
        for (Person i : phoneBook) {
            if (i.getName() == name) {
                return i.getNumber();
            }
        }
        return "number not known.";
    }


}