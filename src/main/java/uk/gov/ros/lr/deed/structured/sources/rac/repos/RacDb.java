package uk.gov.ros.lr.deed.structured.sources.rac.repos;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import uk.gov.ros.lr.deed.structured.sources.rac.model.RacSqlQuery;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.List;


@Component
public class RacDb {
    private Connection con = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    //--------------------------------------------------------------------------------
    // date format = yyyy-MM-dd
    public ResultSet getRecordsInDateRange(String startDate, String endDate){
        String SQL = RacSqlQuery
                .select().abridgements()
                .thatAreInDateRange(startDate, endDate)
                .getSql();
        log.debug("QUERY: "+SQL);
        return executeQuery(SQL);
    }

    //--------------------------------------------------------------------------------
    // date format = yyyy-MM-dd
    public ResultSet getAbridgementTextsInDateRange(String startDate, String endDate){
        String SQL = RacSqlQuery
                .select().abridgementTexts()
                .thatAreInDateRange(startDate, endDate)
                .getSql();
        log.debug("QUERY: "+SQL);
        return executeQuery(SQL);
    }

    //--------------------------------------------------------------------------------
    public ResultSet getAbridgementTextByRef(String ref){
        String SQL = RacSqlQuery
                .select().abridgementTexts()
                .thatHaveReference(ref)
                .getSql();
        log.debug("QUERY: "+SQL);
        return executeQuery(SQL);
    }

    //------------------------------------------------------------
    // date format = yyyy-MM-dd
    public ResultSet getRecordsOnDate(String dt){
        String SQL = RacSqlQuery
                .select().abridgements()
                .thatAreInDate(dt)
                .getSql();
        log.debug("QUERY: "+SQL);
        return executeQuery(SQL);
    }
    //--------------------------------------------------------------------------------
    public ResultSet getRecordByRef(String ref){
        String SQL = RacSqlQuery
                .select().abridgements()
                .thatHaveReference(ref)
                .getSql();
        log.debug("QUERY: "+SQL);
        return executeQuery(SQL);
    }

    //--------------------------------------------------------------------------------
    public ResultSet getRecordsForRefs(List<String> refs){
        String SQL = RacSqlQuery
                .select().abridgements()
                .withReferences(refs)
                .getSql();
        log.debug("QUERY: "+SQL);
        return executeQuery(SQL);
    }

    //------------------------------------------------------------
    public ResultSet getRecordsOnMonth(int month, int year){
        String SQL = RacSqlQuery
                .select().abridgements()
                .thatAreInMonth(month, year)
                .getSql();

        log.debug("QUERY: "+SQL);
        return executeQuery(SQL);
    }

    //------------------------------------------------------------
    public ResultSet getIdsOnMonth(int month, int year){
        String SQL = RacSqlQuery
                .select().ids()
                .thatAreInMonth(month, year)
                .getSql();
        log.debug("QUERY: "+SQL);
        return executeQuery(SQL);
    }

    //----------------------------------------------------------
    public long getCountOnMonth(int month, int year){
        String SQL = RacSqlQuery
                .select().countOfRecords()
                .thatAreInMonth(month, year)
                .getSql();

        log.debug("QUERY: "+SQL);
        return executeCountQuery(SQL);
    }
    //------------------------------------------------------------
    public ResultSet getPartiesInAbridgement(String abrRef){
        String SQL = RacSqlQuery
                .select().parties()
                .thatAreInAbridgement(abrRef)
                .getSql();

        log.debug("QUERY: "+SQL);
        return executeQuery(SQL);
    }
    //------------------------------------------------------------
    public ResultSet getPlacesInAbridgement(String abrRef){
        String SQL = RacSqlQuery
                .select().places()
                .thatAreInAbridgement(abrRef)
                .getSql();

        log.debug("QUERY: "+SQL);
        return executeQuery(SQL);
    }

    //------------------------------
    @Value("${rac-db.user}")
    private String user;
    @Value("${rac-db.password}")
    private String password;
    @Value("${rac-db.host}")
    private String host;
    @Value("${rac-db.port}")
    private int port;
    @Value("${rac-db.db-name}")
    private String dbName;


    public void connect() {

        try {
            SQLServerDataSource ds = new SQLServerDataSource();
            ds.setIntegratedSecurity(false);
            ds.setUser(user);
            ds.setPassword(password);
            ds.setServerName(host);
            ds.setPortNumber(port);
            ds.setDatabaseName(dbName);
            this.con = ds.getConnection();

        } catch (Exception e) {
            log.error("Failed to connect to RAC Db", e);
        }
    }

    //----------------------------------------------------------
    private ResultSet executeQuery(String query)  {
        ResultSet rs = null;
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
        } catch (Exception e){
            log.error("Failed to execute query '"+query+"'", e);
        }
        return rs;
    }

    //-------------------------------------
    private long executeCountQuery(String query) {
        long result = -1;
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            rs.next();
            result = rs.getLong(1);
        } catch(Exception e) {
            log.error("Failed to execute query '"+query+"'", e);
        }
        return result;
    }

    //------------------------------------
    public void  disconnect() {
        if (rs != null) try{ rs.close(); } catch(Exception e){}
        if (stmt != null) try{ stmt.close(); } catch(Exception e){}
        if (con != null) try{ con.close(); } catch(Exception e){}

        rs = null;
        stmt  = null;
        con = null;
    }

}
