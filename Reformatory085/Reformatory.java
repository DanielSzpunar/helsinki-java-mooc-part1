public class Reformatory {
    private int weightMeasuredCount = 0;

    public int weight(Person person) {
        weightMeasuredCount++;
        return person.getWeight();
    }
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    public int totalWeightMeasured() {
        return this.weightMeasuredCount;
    }
}
