package animalorg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class TestList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 11, 14);
        ArrayList<String> nameList = new ArrayList<>();
        List<String> phoneList = new ArrayList<>(10);
        phoneList.add("iphone 1");
        phoneList.add("iphone 2");
        phoneList.add("iphone 3");
        phoneList.add("iphone 5");
        phoneList.add(3, "iphone 4");
        List<String> samsung =Arrays.asList( "note 1", "note 2", "note 3");
        phoneList.addAll(samsung);
        phoneList.addAll(0, samsung);
        System.out.println(phoneList.get(1));
        System.out.println(phoneList.indexOf("Note 2"));
        System.out.println(phoneList.isEmpty());
        System.out.println(phoneList);
        List<String> laptop = new LinkedList<>();
    }
}
