package uk.gov.ros.lr.deed.structured.sources.rac.model;

import lombok.Getter;

/**
 *  A record from racAbridgement.places table belonging
 *  to this abridgement entry
 */
public class RacPlace {

    @Getter
    private String placeName;

    @Getter
    private String area;

    @Getter
    private String subArea;


    //---------------------------------------------
    public RacPlace(String placeName, String area, String subArea) {
        this.placeName = placeName;
        this.area = area;
        this.subArea = subArea;
    }

    public RacPlace(){}

    //--------------------------------------------
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(placeName);
        if(subArea!=null)sb.append(' ').append(subArea);
        if(area!=null) sb.append(' ').append(area);
        return sb.toString().toUpperCase();
    }
}
