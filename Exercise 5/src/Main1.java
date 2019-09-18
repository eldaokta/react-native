import enigma.com.model.Friends;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) {
        Set<Friends> angga = new HashSet<>();
        angga.add(new Friends("Joe"));
        angga.add(new Friends("Irfan"));
        angga.add(new Friends("Nanang"));
        angga.add(new Friends("Adist"));
        angga.add(new Friends("Roy"));
        angga.add(new Friends("Rifai"));
        Set<Friends> joe = new HashSet<>();
        joe.add(new Friends("Bambang"));
        joe.add(new Friends("Jono"));
        joe.add(new Friends("Udin"));
        joe.add(new Friends("Nanang"));
        joe.add(new Friends("Irfan"));
        joe.add(new Friends("Roy"));
        joe.add(new Friends("Ida"));

        //to find intersection
        angga.retainAll(joe);
        for (Friends friends:angga){
            System.out.println("Teman yang sama : "+friends.getTeman());
        }
    }
}
