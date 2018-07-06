/*
 * This file is generated by jOOQ.
*/
package com.johnsong.android.jooq.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Region implements Serializable {

    private static final long serialVersionUID = 1432371771;

    private final Integer regionId;
    private final String  regionName;
    private final Integer cityId;

    public Region(Region value) {
        this.regionId = value.regionId;
        this.regionName = value.regionName;
        this.cityId = value.cityId;
    }

    public Region(
        Integer regionId,
        String  regionName,
        Integer cityId
    ) {
        this.regionId = regionId;
        this.regionName = regionName;
        this.cityId = cityId;
    }

    public Integer getRegionId() {
        return this.regionId;
    }

    public String getRegionName() {
        return this.regionName;
    }

    public Integer getCityId() {
        return this.cityId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Region (");

        sb.append(regionId);
        sb.append(", ").append(regionName);
        sb.append(", ").append(cityId);

        sb.append(")");
        return sb.toString();
    }
}
