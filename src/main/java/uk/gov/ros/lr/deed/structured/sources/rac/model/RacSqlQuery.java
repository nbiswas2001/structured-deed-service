package uk.gov.ros.lr.deed.structured.sources.rac.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class RacSqlQuery {

    private String sql = "";
    public String getSql() { return sql; }

    //-----------------------------------
    public static RacSqlQuery select() {
        RacSqlQuery q = new RacSqlQuery();
        q.sql = "select";
        return q;
    }

    //-----------------------------------
    public RacSqlQuery ids() {
        sql += " ae.abridgement_entry_reference as ref from rac.abridgement_entries ae where ";
        return this;
    }

    //-----------------------------------
    public RacSqlQuery abridgements() {
        sql += " ae.abridgement_entry_reference as ref,"+
                    " ae.abridgement_entry_date as dt,"+
                    " co.county_code as ccode,"+
                    " co.nas_county_code as nas_ccode,"+
                    " ae.abridgement_entry_text as text," +
                    " ae.collection_type as collType," +
                    " ae.alternative_reference as altRef," +
                    " ae.volume_id as vol_id," +
                    " ae.page_id as page_id," +
                    " ae.yearly_running_no as yrly_rn," +
                    " ae.daily_running_no as daily_rn" +
                    " from rac.abridgement_entries ae, rac.abridgement_pages ap, rac.volumes v, rac.counties co where" +
                    " ap.abridgement_page_reference = ae.abridgement_page_reference and" +
                    " ap.volume_reference = v.volume_reference and" +
                    " v.county_reference = co.county_reference and";

        return this;
    }

    //-----------------------------------
    public RacSqlQuery abridgementTexts() {
        sql += " ae.abridgement_entry_reference as ref,"+
                " ae.abridgement_entry_text as text" +
                " from rac.abridgement_entries ae where";
        return this;
    }
    //-----------------------------------
    public RacSqlQuery top(int n) {
        sql += " top "+n;
        return this;
    }
    //-----------------------------------
    public RacSqlQuery countOfRecords() {
        sql += " count(1) from rac.abridgement_entries ae where";
        return this;
    }

    //-----------------------------------
    public RacSqlQuery thatAreInDateRange(String startDate, String endDate) {
        sql += " ae.abridgement_entry_date >= '"+startDate+"' and"+
                    " ae.abridgement_entry_date <= '"+endDate+"'";
        return this;
    }

    //-----------------------------------
    public RacSqlQuery thatHaveReference(String ref) {
        sql += " ae.abridgement_entry_reference = '"+ref+"'";
        return this;
    }

    //-----------------------------------
    public RacSqlQuery thatAreInDate(String date) {
        sql += " ae.abridgement_entry_date == '"+date+"'";
        return this;
    }

    //-----------------------------------
    public RacSqlQuery withReferences(List<String> refs) {

        StringBuilder sb = new StringBuilder();
        sb.append(" ae.abridgement_entry_reference in (");
        boolean isFirst = true;
        for(String r : refs){
            sb.append(isFirst?"":",").append(r);
            if(isFirst) isFirst = false;
        }
        sb.append(")");
        sql +=  sb.toString();
        return  this;
    }

    //-----------------------------------
    public RacSqlQuery thatAreInMonth(int month, int year) {

        DateRange dr = getDateRangeForMonth(month, year);
        return thatAreInDateRange(dr.start, dr.end);
    }

    //-----------------------------------
    public RacSqlQuery parties() {
        sql += " p.surname as surname, p.other_names as o_names, p.sub_other_names as sub_o_names" +
                " from rac.people p, rac.person_index_entries pie where" +
                " p.person_reference=pie.person_reference and";
        return this;
    }
    //-----------------------------------
    public RacSqlQuery places() {
        sql += " p.place_name as place, p.area as area, p.sub_area as sub_area" +
                " from rac.places p, rac.place_index_entries pie where" +
                " p.place_reference=pie.place_reference and";
        return this;
    }
    //----------------------------------------------------
    public RacSqlQuery thatAreInAbridgement(String abrRef) {
        sql += " pie.abridgement_entry_reference="+abrRef;
        return this;
    }
    //------------------------------------------------------------
    private DateRange getDateRangeForMonth(int month, int year) {
        Calendar c = Calendar.getInstance();
        c.set(year, month-1, 1);
        Date start = c.getTime();

        Date end = null;
        if(month < 12) {
            c.set(year, month, 1);
            c.add(Calendar.DATE, -1);
            end = c.getTime();
        }
        else  {
            c.set(year, 11, 31);
            end = c.getTime();
        }
        return new DateRange(sdf.format(start), sdf.format(end));
    }

    private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    //------------------------------
    private class DateRange  {
        public String start;
        public String end;

        public DateRange(String start, String end) {
            this.start = start;
            this.end = end;
        }
    }
}
