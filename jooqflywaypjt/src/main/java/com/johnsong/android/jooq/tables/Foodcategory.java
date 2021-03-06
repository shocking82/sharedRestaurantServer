/*
 * This file is generated by jOOQ.
*/
package com.johnsong.android.jooq.tables;


import com.johnsong.android.jooq.Banana;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Record;
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
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Foodcategory extends TableImpl<Record> {

    private static final long serialVersionUID = -184638601;

    /**
     * The reference instance of <code>banana.FoodCategory</code>
     */
    public static final Foodcategory FOODCATEGORY = new Foodcategory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>banana.FoodCategory.food_category_id</code>.
     */
    public final TableField<Record, Integer> FOOD_CATEGORY_ID = createField("food_category_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>banana.FoodCategory.titme</code>.
     */
    public final TableField<Record, String> TITME = createField("titme", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * Create a <code>banana.FoodCategory</code> table reference
     */
    public Foodcategory() {
        this(DSL.name("FoodCategory"), null);
    }

    /**
     * Create an aliased <code>banana.FoodCategory</code> table reference
     */
    public Foodcategory(String alias) {
        this(DSL.name(alias), FOODCATEGORY);
    }

    /**
     * Create an aliased <code>banana.FoodCategory</code> table reference
     */
    public Foodcategory(Name alias) {
        this(alias, FOODCATEGORY);
    }

    private Foodcategory(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Foodcategory(Name alias, Table<Record> aliased, Field<?>[] parameters) {
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
    public Foodcategory as(String alias) {
        return new Foodcategory(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Foodcategory as(Name alias) {
        return new Foodcategory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Foodcategory rename(String name) {
        return new Foodcategory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Foodcategory rename(Name name) {
        return new Foodcategory(name, null);
    }
}
