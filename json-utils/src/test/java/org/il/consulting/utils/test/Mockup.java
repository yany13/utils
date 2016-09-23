package org.il.consulting.utils.test;


import org.il.consulting.utils.JSON2CSV;
import org.jsontocsv.parser.JSONFlattener;
import org.jsontocsv.writer.CSVWriter;

import java.io.File;
import java.util.List;
import java.util.Map;

public class Mockup {

    @org.junit.Test
    public void convert() throws Exception {
        List<Map<String, String>> flatJson = JSONFlattener.parseJson(new File("c:\\tester\\yan.json"), "UTF-8");
        CSVWriter.writeToFile(CSVWriter.getCSV(flatJson), "c:\\tester\\yan.csv");

    }
}
