public class Main {

    public static void main(String[] args) {

        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);
        BoundedCounter seconds = new BoundedCounter(59);
        seconds.setValue(50);
        minutes.setValue(59);
        hours.setValue(23);

        int i = 0;
        while (i < 121) {
            System.out.println(hours.toString() + ":" + minutes.toString() + ":" + seconds.toString());
            seconds.next();
            if (seconds.getValue() == 0) {
                minutes.next();
                if (minutes.getValue() == 0) {
                    hours.next();
                }
            }
            i++;
        }
    }
}
