import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<Kids> {

    @Override
    public int compare(Kids o1, Kids o2) {
        return o1.kidAge - o2.kidAge;
        // return o1.kidName - o2.kidName;
    }

}

class Kids implements Comparable<Kids> {
    int kidAge;
    String kidName;

    public Kids(int kidAge, String kidName) {
        this.kidAge = kidAge;
        this.kidName = kidName;
    }

    @Override
    public String toString() {
        return (kidName + " " + kidAge + "\n");
    }

    @Override
    public int compareTo(Kids that) {
        // return this.kidAge - that.kidAge;

        if (this.kidAge == that.kidAge)
            return that.kidName.compareTo((this.kidName));

        return Integer.compare(this.kidAge, that.kidAge); // for ascending order
        // return Integer.compare(that.kidAge, this.kidAge); // for descending order
    }

    public int getKidAge() {
        return kidAge;
    }

    public void setKidAge(int kidAge) {
        this.kidAge = kidAge;
    }

    public String getKidName() {
        return kidName;
    }

    public void setKidName(String kidName) {
        this.kidName = kidName;
    }
}

public class p62_Comparable {
    public static void main(String[] args) {
        Kids k1 = new Kids(10, "ABC");
        Kids k2 = new Kids(7, "DEF");
        Kids k3 = new Kids(8, "GHI");
        Kids k4 = new Kids(15, "JKL");
        Kids k5 = new Kids(10, "MNO");

        List<Kids> listOfKids = new ArrayList<Kids>();
        listOfKids.add(k1);
        listOfKids.add(k2);
        listOfKids.add(k3);
        listOfKids.add(k4);
        listOfKids.add(k5);

        // Collections.sort(listOfKids);
        // Collections.sort(listOfKids, new MyComparator());

        //////////////////////

        // Collections.sort(listOfKids, (o1, o2) -> o2.kidAge - o1.kidAge);
        // Collections.sort(listOfKids, (o1, o2) -> Integer.compare(o2.kidAge,
        // o1.kidAge));

        //////////////////////

        // Collections.sort(listOfKids, (o1, o2) -> {
        // return o2.kidAge - o1.kidAge;
        // });

        //////////////////////

        Collections.sort(listOfKids, (o1, o2) -> Integer.compare(o1.kidAge, o2.kidAge));

        System.out.println(listOfKids);
    }

}
