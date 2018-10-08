import org.junit.Test;

import static org.junit.Assert.*;

public class BTTest {
    BT<Person> personBT = new BT<Person>();
    Person alen = new Person("Alan", "White", 25);
    Person benny = new Person("Benny", "Yellow", 30);
    Person roxy = new Person("Roxy", "Dog", 21);
    Person tom = new Person("Tom", "Black", 50);
    Person erwin = new Person("Erwin", "Long", 12);
    Person poul = new Person("Poul", "Alien", 34);
    Person frank = new Person("Frank", "Prax", 14);
    BT<String> stringBT = new BT<String>();
    String a = "abc";
    String b = "acb";
    String c = "cba";
    String d = "dca";
    String e = "cab";
    String f = "aaa";
    String g = "aba";
    BT<Integer> integerBT = new BT<Integer>();
    Integer aaa = 1;
    Integer daa = 3;
    Integer da = 5;
    Integer afaa = 2;
    Integer aga = 4;
    Integer aha = 9;
    Integer aca = 0;


    {
        personBT.add(alen);
        personBT.add(benny);
        personBT.add(roxy);
        personBT.add(tom);
        personBT.add(erwin);
        personBT.add(poul);
        personBT.add(frank);
        stringBT.add(a);
        stringBT.add(b);
        stringBT.add(c);
        stringBT.add(d);
        stringBT.add(e);
        stringBT.add(f);
        stringBT.add(g);
        integerBT.add(aaa);
        integerBT.add(daa);
        integerBT.add(da);
        integerBT.add(afaa);
        integerBT.add(aga);
        integerBT.add(aha);
        integerBT.add(aca);
    }

    @Test
    public void traverseInOrder() {
        String result = erwin + "\n" + frank + "\n" + roxy + "\n" + alen + "\n" + benny + "\n" + poul + "\n" + tom + "\n";
        assertEquals(result, personBT.traverseInOrder(personBT.root));
        System.out.println("test passed");
    }

    @Test
    public void intTraverseInOrder() {
        String result = aca + "\n" + aaa + "\n" + afaa + "\n" + daa + "\n" + aga + "\n" + da + "\n" + aha + "\n";
        assertEquals(result, integerBT.traverseInOrder(integerBT.root));
        System.out.println("test passed");
    }

    @Test
    public void stringTraverseInOrder(){
        String result = f + "\n" + g + "\n" + a + "\n" + b + "\n" + e + "\n" + c + "\n" + d + "\n";
        assertEquals(result, stringBT.traverseInOrder(stringBT.root));
        System.out.println("test passed");
    }
}