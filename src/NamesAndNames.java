import java.util.LinkedHashSet;
import java.util.Set;

public class NamesAndNames {
    public static void main(String[] args) {
        Set<String> name = new LinkedHashSet<>();
        name.add("Oleg");
        name.add("Taras");
        name.add("Oleg");
        name.add("Vitali");
        name.add("Oleg");
        name.add("Vitali");
        name.add("Oksana");
        name.add("Viktoria");
        name.add("Petro");
        name.add("Bogdan");
        System.out.println(name);
        System.out.println();
        Set<String> name2 = new LinkedHashSet<>();
        name2.add("Sasha");
        name2.add("Andrij");
        name2.add("Sofija");
        name2.add("Anton");
        name2.add("Oleg");
        name2.add("Viktoria");
        name2.add("Petro");
        name2.add("Oksana");
        name2.add("Viktoria");
        name2.add("Bogdan");
        System.out.println(name2);
        System.out.println();
        name.retainAll(name2);
        System.out.println(name);
    }
}
