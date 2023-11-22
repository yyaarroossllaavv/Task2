package tasks;

import org.example.Data;
import org.example.Root;
import tasks.Response;

import java.util.List;
import java.util.stream.Collectors;

import static org.example.Parser.getPars;

public class Task2 implements Response {
    @Override
    public void getResponse() {
        try {
            Root root = getPars();
            List<Data> dataList = root.getData();
            long count = dataList.stream()
                    .filter(d -> d.emails.get(0).contains("gmail.com") || d.emails.get(1).contains("gmail.com"))
                    .count();
            System.out.println(count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
