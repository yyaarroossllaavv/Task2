package tasks;

import org.example.Data;
import org.example.Root;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import static org.example.Parser.getPars;

public class Task7 implements Response{
    @Override
    public void getResponse() {
        try {
            Root root = getPars();
            List<Data> dataList = root.getData();
            List<Data> dataList1 = dataList.stream()
                    .filter(d -> d.status.equals("ACTIVE"))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
