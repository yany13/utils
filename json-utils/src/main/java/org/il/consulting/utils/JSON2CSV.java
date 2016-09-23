package org.il.consulting.utils;


import org.jsontocsv.parser.JSONFlattener;
import org.jsontocsv.writer.CSVWriter;

import java.io.File;
import java.util.List;
import java.util.Map;

public class JSON2CSV {

    public void convert(String jsonString, String fileLocation) throws Exception {

        List<Map<String, String>> flatJson = JSONFlattener.parseJson(jsonString);
        CSVWriter.writeToFile(CSVWriter.getCSV(flatJson), fileLocation);
    }

}



