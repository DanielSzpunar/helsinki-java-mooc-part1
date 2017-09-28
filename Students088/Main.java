import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       /* Student pekka = new Student("Pekka Mikkola", "013141590");
        System.out.println("name: " + pekka.getName());
        System.out.println("student number: " + pekka.getStudentNumber());
        System.out.println(pekka);
        */
       ArrayList<Student> list = new ArrayList<Student>();
       Scanner input = new Scanner(System.in);
       while(true) {
           System.out.print("name: ");
           String name = input.nextLine();
           if (name.equals("")) break;
           System.out.print("studentnumber: ");
           String studentNumber = input.nextLine();
           list.add(new Student(name,studentNumber));
        }
        for (Student i : list){
            System.out.println(i.toString());
        }

        System.out.print("Give search term:");
        String searchTerm = input.nextLine();

        for (int i = 0; i < list.size(); i++) {
            Student searchName = list.get(i);
            String stringSearchName = searchName.getName();
            if(stringSearchName.contains(searchTerm)) {
                System.out.println(searchName.toString());
            }

        }
}
}
