package uk.gov.ros.lr.deed.structured.sources.rac.model;


import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

/**
 * Data structure containing a collection of data
 * items from the original source of a Deed
 */
public abstract class SourceData {


    // A human readable unique reference for the deed.
    // Computed and set by the subclass
    @Getter
    protected String deedRef = null;

    // The sequence no. of the batch in which this was loaded
    // This is given by yyyyMM from the entry date.
    @Getter @Setter
    private int batchSeq = 0;

    //-------------------------------------------
    //Let the subclass provide the deedRef
    protected abstract String computeDeedRef();

    //--------------------------------------------------
    //Helper to compute base31 based deedRef
    public static String encode(long num) {
        StringBuilder sb = new StringBuilder();
        long r = 0L;
        long q = num;
        while(q >= radix) {
            r = q % radix;
            q = q /radix;
            sb.append(base29[(int)r]);
        }
        sb.append(base29[(int)q]);
        if(sb.length() < 6) {
            for(int i= sb.length(); i < 6; i++) sb.append("2"); //left pad with '2' which is 0
        }
        sb.reverse();

        return sb.toString();
    }

    //----------------------------------------------------------------------
    private static final int radix = 29;
    private static final char[] base29 = "23456789BCDFGHJKLMNPQRSTVWXYZ".toCharArray(); // (numbers except 0 & 1) + (cap alphabets except vowels)
    protected static final HashMap<String, Long> countyN = new HashMap<>();

    //load county nums
    static {
        countyN.put("ABN", 100000000L); countyN.put("ANG", 200000000L); countyN.put("ARG", 300000000L); countyN.put("AYR", 400000000L);
        countyN.put("BNF", 500000000L); countyN.put("BER", 600000000L); countyN.put("BUT", 700000000L); countyN.put("CTH", 800000000L);
        countyN.put("CLK", 900000000L); countyN.put("CRO", 1000000000L); countyN.put("DMB", 1100000000L); countyN.put("DMF", 1200000000L);
        countyN.put("EAF", 1300000000L); countyN.put("EDI", 1400000000L); countyN.put("ELN", 1500000000L); countyN.put("FFE", 1600000000L);
        countyN.put("FOR", 1700000000L); countyN.put("GLA", 1800000000L); countyN.put("HAD", 1900000000L); countyN.put("INV", 2000000000L);
        countyN.put("KNC", 2100000000L); countyN.put("KNR", 2200000000L); countyN.put("KRK", 2300000000L); countyN.put("LAN", 2400000000L);
        countyN.put("LIN", 2500000000L); countyN.put("MID", 2600000000L); countyN.put("MOR", 2700000000L); countyN.put("NRN", 2800000000L);
        countyN.put("OAZ", 2900000000L); countyN.put("PBL", 3000000000L); countyN.put("PTH", 3100000000L); countyN.put("REN", 3200000000L);
        countyN.put("ROS", 3300000000L); countyN.put("ROX", 3400000000L); countyN.put("RSS", 3500000000L); countyN.put("SEL", 3600000000L);
        countyN.put("STG", 3700000000L); countyN.put("STH", 3800000000L); countyN.put("WLN", 3900000000L); countyN.put("WGN", 4000000000L);

    }

}
