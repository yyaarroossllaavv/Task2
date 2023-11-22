package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Parser {
    public static Root getPars() throws IOException {
        ObjectMapper om = new ObjectMapper();
        return om.readValue(new File("data.json"), Root.class);
    }
}
