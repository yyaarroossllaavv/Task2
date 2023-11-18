package tasks;

import org.example.Data;
import org.example.Job;
import org.example.Root;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.example.Parser.getPars;

public class Task4 implements Response {

    @Override
    public void getResponse() {
        try {
            Root root = getPars();
            List<String> jobTitleList = new ArrayList<>();
            List<Data> dataList = root.getData();
            List<Data> dataList1 = dataList.stream()
                    .filter(d -> moreThen500(d.monthlySalary))
                    .collect(Collectors.toList());
            for (int i = 0; i < dataList1.size(); i++) {
                jobTitleList.add(dataList1.get(i).job.getTitle());
            }
            Collections.sort(jobTitleList);
            for (String s : jobTitleList) {
                System.out.println(s);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public boolean moreThen500(BigDecimal n) {
        BigDecimal bd = BigDecimal.valueOf(500);
        switch (n.compareTo(bd)) {
            case -1 :
                return false;
            case 0 :
                return false;
            case  1 :
                return true;
        }
        return true;
    }
}
