public class Main {

    public static void main(String[] args) {
        BT<Person> personBT = new BT<Person>();
        Person alen = new Person("Alan", "White", 25);
        Person benny = new Person("Benny", "Yellow", 30);
        Person roxy = new Person("Roxy", "Dog", 21);
        Person tom = new Person("Tom", "Black", 50);
        Person erwin = new Person("Erwin", "Long", 12);
        Person poul = new Person("Poul", "Alien", 34);
        Person frank = new Person("Frank", "Prax", 14);

        personBT.add(alen);
        personBT.add(benny);
        personBT.add(roxy);
        personBT.add(tom);
        personBT.add(erwin);
        personBT.add(poul);
        personBT.add(frank);

       personBT.traverseInOrder(personBT.root);
    }
}
