package uk.gov.ros.lr.deed.structured.interpreter.util;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class CorpusLoader {

    public static Set<String> load(String fileName) {

        Set<String> result = new HashSet<>();
        try {

            ClassLoader classLoader = CorpusLoader.class.getClassLoader();
            InputStream in = classLoader.getResourceAsStream("corpus/"+fileName);
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            while (reader.ready()) {
                String line = reader.readLine();
                result.add(line.trim());
            }

        }catch (Exception e){
            throw new RuntimeException("Failed to load corpus file '"+fileName+"'", e);
        }

        return result;
    }
}
