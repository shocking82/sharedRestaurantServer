/*
 * This file is generated by jOOQ.
*/
package com.johnsong.android.spring.jooq.banana.tables;


import com.johnsong.android.spring.jooq.banana.Banana;
import com.johnsong.android.spring.jooq.banana.tables.records.RegionRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Region extends TableImpl<RegionRecord> {

    private static final long serialVersionUID = -1444346037;

    /**
     * The reference instance of <code>banana.Region</code>
     */
    public static final Region REGION = new Region();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RegionRecord> getRecordType() {
        return RegionRecord.class;
    }

    /**
     * The column <code>banana.Region.region_id</code>.
     */
    public final TableField<RegionRecord, Integer> REGION_ID = createField("region_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>banana.Region.region_name</code>.
     */
    public final TableField<RegionRecord, String> REGION_NAME = createField("region_name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>banana.Region.city_id</code>.
     */
    public final TableField<RegionRecord, Integer> CITY_ID = createField("city_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>banana.Region</code> table reference
     */
    public Region() {
        this(DSL.name("Region"), null);
    }

    /**
     * Create an aliased <code>banana.Region</code> table reference
     */
    public Region(String alias) {
        this(DSL.name(alias), REGION);
    }

    /**
     * Create an aliased <code>banana.Region</code> table reference
     */
    public Region(Name alias) {
        this(alias, REGION);
    }

    private Region(Name alias, Table<RegionRecord> aliased) {
        this(alias, aliased, null);
    }

    private Region(Name alias, Table<RegionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Banana.BANANA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Region as(String alias) {
        return new Region(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Region as(Name alias) {
        return new Region(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Region rename(String name) {
        return new Region(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Region rename(Name name) {
        return new Region(name, null);
    }
}
