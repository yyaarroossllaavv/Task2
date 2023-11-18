package tasks;

import org.example.Data;
import org.example.Root;

import java.util.*;
import java.util.stream.Collectors;

import static org.example.Parser.getPars;

public class Task6 implements Response{
    @Override
    public void getResponse() {
        try {
            Root root = getPars();
            HashSet<String> countriesSet = new HashSet<>();
            HashMap<String, Integer> countriesMap = new HashMap<>();
            List<String> countriesList = new ArrayList<>();
            List<Data> dataList = root.getData();
            List<Data> dataList1 = dataList.stream()
                    .filter(d -> d.status.equals("DISABLED"))
                    .collect(Collectors.toList());
            for (int i = 0; i < dataList1.size(); i++) {
                countriesSet.add(dataList1.get(i).getLocation().state);
                countriesList.add(dataList1.get(i).getLocation().state);
            }
            for (String j : countriesSet) {
                countriesMap.put(j, (int) countriesList.stream().filter(c -> c.equals(j)).count());
            }
            countriesMap.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
