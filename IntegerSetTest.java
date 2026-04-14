public class IntegerSetTest {
    public static void main(String[] args) {
        IntegerSet a = new IntegerSet(new int[]{10, 5, 15, 3, 7, 12, 18});
        IntegerSet b = new IntegerSet(new int[]{7, 12, 20, 1, 5});
        IntegerSet c = new IntegerSet(new int[]{1, 1, 2, 2, 3, 3});
        IntegerSet empty = new IntegerSet();
        IntegerSet single = new IntegerSet(new int[]{42});

        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C (duplicates removed) = " + c);

        System.out.println("A contains 7: " + a.contains(7));
        System.out.println("A contains 99: " + a.contains(99));

        System.out.println("Union: " + a.union(b));
        System.out.println("Intersection: " + a.intersection(b));
        System.out.println("Difference A - B: " + a.difference(b));
        System.out.println("Symmetric Difference: " + a.symmetricDifference(b));

        System.out.println("Min A: " + a.getMin());
        System.out.println("Max A: " + a.getMax());

        System.out.println("Add duplicate 7 to A: " + a.add(7));
        System.out.println("Add 6 to A: " + a.add(6));
        System.out.println("A after add 6: " + a);

        System.out.println("Remove 10 from A: " + a.remove(10));
        System.out.println("A after remove 10: " + a);

        System.out.println("Remove 999 from A: " + a.remove(999));

        System.out.println("Single set: " + single);
        System.out.println("Single min: " + single.getMin());
        System.out.println("Single max: " + single.getMax());

        System.out.println("Empty is empty: " + empty.isEmpty());
        empty.add(100);
        System.out.println("Empty after add 100: " + empty);
        empty.clear();
        System.out.println("Empty after clear: " + empty);
        System.out.println("Empty is empty now: " + empty.isEmpty());

        System.out.println("Magnitude A: " + a.magnitude());
        System.out.println("Magnitude B: " + b.magnitude());
        System.out.println("Magnitude C: " + c.magnitude());
    }
}