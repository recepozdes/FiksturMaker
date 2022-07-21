import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<String> teams = new ArrayList<String>();
        teams.add("Galatasaray");
        teams.add("Bursaspor");
        teams.add("Fenerbahce");
        teams.add("Beşiktaş");
        teams.add("Trabzonspor");
        teams.add("Başakşehir");
        teams.add("Kayserispor");
        FiksturMaker fiksturMaker = new FiksturMaker();
        List<List<Match>> all= fiksturMaker.getFikstur(teams);
        fiksturMaker.print(all);
     }


}
