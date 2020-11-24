package uk.gov.ros.lr.deed.structured.model.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.StringWriter;
import java.text.SimpleDateFormat;

public class ToStringHelper {

    private static ObjectWriter writerPretty;
    private static ObjectWriter writerNormal;
    //---------------------------------------------
    static {
        ObjectMapper mapper = new ObjectMapper();
        mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        writerPretty = mapper.writerWithDefaultPrettyPrinter();
        writerNormal = mapper.writer();
    }

    //-----------------------------------------
    public static String getString(Object o) {
        return getString(o, false);
    }

    public static String getString(Object o, boolean pretty) {
        StringBuilder sb = new StringBuilder();
        sb.append(o.getClass().getSimpleName()).append(": ").append(getJson(o, pretty));
        return sb.toString() ;
    }

    //-----------------------------------------
    public static String getJson(Object o, boolean pretty) {
        StringWriter w = new StringWriter();
        ObjectWriter writer = pretty ? writerPretty : writerNormal;
        try { writer.writeValue(w, o); } catch(Exception e){e.printStackTrace();}
        return w.toString();
    }
}
