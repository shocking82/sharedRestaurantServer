/*
 * This file is generated by jOOQ.
*/
package com.johnsong.android.jooq;


import com.johnsong.android.jooq.tables.City;
import com.johnsong.android.jooq.tables.FlywaySchemaHistory;
import com.johnsong.android.jooq.tables.Foodcategory;
import com.johnsong.android.jooq.tables.Region;
import com.johnsong.android.jooq.tables.Storesummary;
import com.johnsong.android.jooq.tables.User;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in banana
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>banana.City</code>.
     */
    public static final City CITY = com.johnsong.android.jooq.tables.City.CITY;

    /**
     * The table <code>banana.flyway_schema_history</code>.
     */
    public static final FlywaySchemaHistory FLYWAY_SCHEMA_HISTORY = com.johnsong.android.jooq.tables.FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY;

    /**
     * The table <code>banana.FoodCategory</code>.
     */
    public static final Foodcategory FOODCATEGORY = com.johnsong.android.jooq.tables.Foodcategory.FOODCATEGORY;

    /**
     * The table <code>banana.Region</code>.
     */
    public static final Region REGION = com.johnsong.android.jooq.tables.Region.REGION;

    /**
     * The table <code>banana.StoreSummary</code>.
     */
    public static final Storesummary STORESUMMARY = com.johnsong.android.jooq.tables.Storesummary.STORESUMMARY;

    /**
     * The table <code>banana.User</code>.
     */
    public static final User USER = com.johnsong.android.jooq.tables.User.USER;
}
