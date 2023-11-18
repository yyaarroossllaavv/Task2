package tasks;

import org.example.Data;
import org.example.Root;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.example.Parser.getPars;

public class Task5 implements Response{
    @Override
    public void getResponse() {
        try {
            Root root = getPars();
            List<Data> dataList = root.getData();
            List<Data> dataList1 = dataList.stream()
                    .filter(d -> d.status.equals("ACTIVE") && lessThen100(d.monthlySalary) && (d.emails.get(0).contains("example.com") || d.emails.get(1).contains("example.com")))
                    .collect(Collectors.toList());
            for (int i = 0; i < dataList1.size(); i++) {
                System.out.println(dataList1.get(i).getName().getLast() + " " + dataList1.get(i).getName().getFirst().charAt(0) + ". " + dataList1.get(i).getName().getMiddle().charAt(0) + ". " + dataList1.get(i).getEmails().toString());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public boolean lessThen100(BigDecimal n) {
        BigDecimal bd = BigDecimal.valueOf(500);
        switch (n.compareTo(bd)) {
            case -1 :
                return true;
            case 0 :
                return false;
            case  1 :
                return false;
        }
        return true;
    }
}
