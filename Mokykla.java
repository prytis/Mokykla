package mokykla;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mokykla {

    public static void main(String[] args) {
        int count = 30;
        List<Mokinys> mokiniai = new ArrayList<>();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            mokiniai.add(new getPerson());
        }
        for (int i = 0; i < mokiniai.size(); i++) {
            mokiniai.get(i).printMokinys();
        }

        Collections.sort(mokiniai, new SortByKlase(0));


        System.out.println("Sorted-----------------------------------");

        for (int i = 0; i < mokiniai.size(); i++) {
            mokiniai.get(i).printMokinys();
        }

        System.out.println("Paskutinis mokinys:");
        Collections.sort(mokiniai, new PaskutinisMokinys());
        mokiniai.get(count-1).printMokinys();

        System.out.println("Trys geriausi mokiniai:");
        for (int i = 0; i < 3; i++) {
            mokiniai.get(i).printMokinys();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Process Times:"+(endTime - startTime)+ "  ms");
    }


}
