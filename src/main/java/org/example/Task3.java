package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import static org.example.Parser.getPars;

public class Task3 implements Response{
    @Override
    public void getResponse() {
        try {
            Root root = getPars();
            HashSet<String> cards = new HashSet<>();
            ArrayList<String> cards1 = new ArrayList<>();
            List<Data> dataList = root.getData();
            List<Data> dataList1 = dataList.stream()
                    .collect(Collectors.toList());
            for (int i = 0; i < dataList1.size(); i++) {
                cards.add(dataList1.get(i).getCreditCard().getIssuer());
                cards1.add(dataList1.get(i).getCreditCard().getIssuer());
            }
            System.out.println(cards);
            System.out.println(cards1);
            for (String j:cards) {
                System.out.println(j + " " + cards1.stream().filter(c -> c.equals(j)).count());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
