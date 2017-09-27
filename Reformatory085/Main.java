public class Main {

    public static void main(String[] args) {
       /* WeightWatchersAssociation toronto = new WeightWatchersAssociation(26);

        Person daniel = new Person("Daniel", 35);
        daniel.setWeight(88);
        daniel.setHeight(183);
        System.out.println(daniel);

        Person songyi = new Person("Songyi");
        songyi.setWeight(67);
        songyi.setHeight(167);
        songyi.becomeOlder(28);
        System.out.println(songyi);

        if (toronto.isAcceptedAsMember(daniel)) {
            System.out.println("Your request has been authorized " + daniel.getName());
        }
            else {
            System.out.println("Your request has been denied " + daniel.getName());
        };

        if (toronto.isAcceptedAsMember(songyi)) {
            System.out.println("Your request has been authorized " + songyi.getName());
        }
        else {
            System.out.println("Your request has been denied " + songyi.getName());
        };
    */
       Reformatory eastHelsinkiReformatory = new Reformatory();
       Person brian = new Person("Brian", 1, 7,110);
       Person pekka = new Person("Pekka", 33, 85, 176);

        System.out.println(brian.getName() + " weight: " + eastHelsinkiReformatory.weight(brian) + " kilos");
        System.out.println(pekka.getName() + " weight: " + eastHelsinkiReformatory.weight(pekka) + " kilos");

            eastHelsinkiReformatory.feed(brian);
            eastHelsinkiReformatory.feed(brian);
            eastHelsinkiReformatory.feed(brian);

        System.out.println("");
        System.out.println(brian.getName() + " weight: " + brian.getWeight());
        System.out.println(pekka.getName() + " weight: " + pekka.getWeight());
        System.out.println("total weights measured: " + eastHelsinkiReformatory.totalWeightMeasured());
    }
}
