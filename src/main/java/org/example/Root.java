package org.example;

import java.util.ArrayList;

public class Root {
    public ArrayList<Data> data;

    public ArrayList<Data> getData() {
        return data;
    }

    public void setData(ArrayList<Data> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Root{" +
                "data=" + data +
                '}';
    }
}
