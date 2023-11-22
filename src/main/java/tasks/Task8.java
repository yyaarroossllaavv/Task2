package tasks;

import org.example.Data;
import org.example.Root;

import java.util.*;

import static org.example.Parser.getPars;

public class Task8 implements Response{
    @Override
    public void getResponse() {
        try {
            Root root = getPars();
            List<Data> dataList = root.getData();
            HashSet<String> companies = new HashSet<>();
            dataList.forEach(d -> companies.add(d.job.company));
            companies.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
