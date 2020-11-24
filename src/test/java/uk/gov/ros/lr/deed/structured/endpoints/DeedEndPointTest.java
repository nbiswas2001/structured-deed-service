package uk.gov.ros.lr.deed.structured.endpoints;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeedEndPointTest {

    @Autowired
    DeedEndPoint deedEndPoint;

    @Test
    public void getByReference() {
    }

    @Test
    public void getStructuredContent() {

        ResponseEntity resp = deedEndPoint.getStructuredContent("B28HJSK");
    }

    @Test
    public void getDeedByReference() {
    }

    @Test
    public void getBasicDeedByReference() {
    }

    @Test
    public void getFullDeedByReference() {
    }

    @Test
    public void findDeed() {
    }

    @Test
    public void findDeedsInBatch() {
    }

    @Test
    public void updateCorrectedEntryText() {
        deedEndPoint.updateCorrectedEntryText("B22NFVX", "DISP. by ALISTAIR KEITH SIMPSON, Joiner and Builder, Muirtack Schoolhouse, Auchleuchries, Ellon ~ TO STEWART MARTIN McKAY and ELIZABETH ANN McKAY, spouses, Rocklea, 2 Old Rectory Avenue, Ellon, equally and survivor, ~ of 39 square metres, in PARISH OF ELLON, bounded on east by subjects belonging to said Grantees, part of (I.) 2 acres, in said Parish, described in Feu Ch. to Bishop of Diocese of Aberdeen and Sasine thereon, recorded Aberdeen and Kincardine P.R. 25 Aug. 1854 and (II.) 1.446 acres, part of lands and Barony of ELLON, in said Parish, described in Disp. to Trustees for Vestry of Congregation of St. Mary's on the Rock, recorded 21 Jan. 1920. Dated 26 Apr. 1990.");

    }

    @Test
    public void getStructuredContent1() {
    }
}