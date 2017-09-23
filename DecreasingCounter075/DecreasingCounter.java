public class DecreasingCounter {
    private int value;
    private int valueAtStart;// object variable that remembers the value of the counter

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.valueAtStart = valueAtStart;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        // write here the code that decrements the value of counter by one
        if(this.value >= 1)
        this.value--;
    }
    public void reset() {
        this.value = 0;
    }
    public void setInitial() {
        this.value = this.valueAtStart;
    }

    // and here the rest of the methods
}
