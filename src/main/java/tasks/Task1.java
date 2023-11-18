package tasks;

import org.example.Data;
import org.example.Root;
import tasks.Response;

import java.util.List;
import java.util.stream.Collectors;

import static org.example.Parser.getPars;

public class Task1 implements Response {
    @Override
    public void getResponse() {
        try {
            Root root = getPars();
            List<Data> dataList = root.getData();
            List<Data> dataList1 = dataList.stream()
                    .filter(d -> d.status.equals("ACTIVE"))
                    .collect(Collectors.toList());
            for (int i = 0; i < dataList1.size(); i++) {
                System.out.println(dataList1.get(i).getName().getLast() + " " + dataList1.get(i).getName().getMiddle().charAt(0) + ". " + dataList1.get(i).getName().getFirst().charAt(0) + ".");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
