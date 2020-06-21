package mokykla;

import java.util.Comparator;

public class PaskutinisMokinys implements Comparator <Mokinys> {

    @Override
    public int compare(Mokinys o1, Mokinys o2) {
        int suma1 = 0;
        for (int  i=0; i < o1.pazymiai.length; i++){
            suma1 += o1.pazymiai[i];
        }
        int suma2 =0;
        for (int  i=0; i < o2.pazymiai.length; i++){
            suma2 += o2.pazymiai[i];
        }
        return suma2 - suma1;
    }

}
