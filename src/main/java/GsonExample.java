import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GsonExample {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) {
        Person person1 = new Person(1, "Ivan", "Tertov", 32);
        Person person2 = new Person(2, "Anton", "Kipov", 24);
        Person person3 = new Person(3, "Vadim", "Fenin", 29);
        List<Person> personList = new ArrayList<Person>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        String json = GSON.toJson(personList);
        System.out.println(json);

        List<Person> personList1 = Arrays.asList(GSON.fromJson(json, Person[].class));
        for (Person person : personList1) {
            System.out.println(person);
        }

    }
}
