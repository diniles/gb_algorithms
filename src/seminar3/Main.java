package seminar3;

public class Main {
    public static void main(String[] args) {
        Band hellowen = new Band("Helloween", 1983);
        Band ironMaiden = new Band("Iron Maiden", 1975);
        Band manowar = new Band("Manowar", 1980);
        Band motorhead = new Band("Motörhead", 1975);

        DoubleLinkedList<Band> bandsList = new DoubleLinkedList<>();
        bandsList.addToStart(hellowen);
        bandsList.addToStart(ironMaiden);
        bandsList.addToEnd(manowar);
        bandsList.addToEnd(motorhead);

        System.out.println("Original list");
        System.out.println(bandsList);
        System.out.println();

        bandsList.reverse();

        System.out.println("Reversed list");
        System.out.println(bandsList);
    }
}
