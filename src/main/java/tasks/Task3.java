package tasks;

import org.example.CreditCard;
import org.example.Data;
import org.example.Root;
import tasks.Response;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import static org.example.Parser.getPars;

public class Task3 implements Response {
    @Override
    public void getResponse() {
        try {
            Root root = getPars();
            HashSet<String> cardsSet = new HashSet<>();
            ArrayList<String> cardsList = new ArrayList<>();
            List<Data> dataList = root.getData();
            dataList.forEach(d -> cardsSet.add(d.getCreditCard().getIssuer()));
            dataList.forEach(d -> cardsList.add(d.getCreditCard().getIssuer()));
            for (String j:cardsSet) {
                System.out.println(j + " " + cardsList.stream().filter(c -> c.equals(j)).count());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
