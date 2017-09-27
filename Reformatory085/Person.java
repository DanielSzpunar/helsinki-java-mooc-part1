public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name) {
        this(name, 0);
    }
    public Person (String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 0;
        this.height = 0;
    }
    public Person (String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public String getName() {
        return this.name;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return this.height;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return this.weight;
    }
    public void becomeOlder() {
        becomeOlder(1);
    }
    public void becomeOlder(int years) {
        this.age += years;
    }
    public int getAge() {
        return this.age;
    }
    public double weightIndex() {
        double heightInMeters =  this.height / 100.0;
        return this.weight / (heightInMeters * heightInMeters);

    }
    public void printPerson() {
        System.out.println(this.name + " I am " + this.age + " years old.");
    }
    public boolean adult() {
        return this.age >= 18;
    }
    public String toString() {
        return this.name + " I am " + this.age + " years old." + " My weight index is " + String.format("%.2f",this.weightIndex());
    }

}
