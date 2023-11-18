package tasks;

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
            List<Data> dataList1 = dataList.stream()
                    .collect(Collectors.toList());
            for (int i = 0; i < dataList1.size(); i++) {
                cardsSet.add(dataList1.get(i).getCreditCard().getIssuer());
                cardsList.add(dataList1.get(i).getCreditCard().getIssuer());
            }
            for (String j:cardsSet) {
                System.out.println(j + " " + cardsList.stream().filter(c -> c.equals(j)).count());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
