package mokykla;

import java.util.Comparator;

public class SortByKlase implements Comparator <Mokinys> {
    private int flag;

    SortByKlase(int flag){
        this.flag = flag;
    }
    @Override
    public int compare(Mokinys o1, Mokinys o2) {
       if ( o1.klase - o2.klase !=0 ) {
            return o1.klase - o2.klase;
            } else if ( o1.pavarde.compareTo(o2.pavarde) != 0) {
           return o1.pavarde.compareTo(o2.pavarde);
        }
     return o1.vardas.compareTo(o2.vardas);
    }

}
