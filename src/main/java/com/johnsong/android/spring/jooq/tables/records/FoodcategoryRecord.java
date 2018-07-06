/*
 * This file is generated by jOOQ.
*/
package com.johnsong.android.spring.jooq.tables.records;


import com.johnsong.android.spring.jooq.tables.Foodcategory;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


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
public class FoodcategoryRecord extends TableRecordImpl<FoodcategoryRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 40930921;

    /**
     * Setter for <code>banana.FoodCategory.food_category_id</code>.
     */
    public FoodcategoryRecord setFoodCategoryId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>banana.FoodCategory.food_category_id</code>.
     */
    public Integer getFoodCategoryId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>banana.FoodCategory.titme</code>.
     */
    public FoodcategoryRecord setTitme(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>banana.FoodCategory.titme</code>.
     */
    public String getTitme() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Foodcategory.FOODCATEGORY.FOOD_CATEGORY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Foodcategory.FOODCATEGORY.TITME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getFoodCategoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getTitme();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getFoodCategoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTitme();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FoodcategoryRecord value1(Integer value) {
        setFoodCategoryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FoodcategoryRecord value2(String value) {
        setTitme(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FoodcategoryRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FoodcategoryRecord
     */
    public FoodcategoryRecord() {
        super(Foodcategory.FOODCATEGORY);
    }

    /**
     * Create a detached, initialised FoodcategoryRecord
     */
    public FoodcategoryRecord(Integer foodCategoryId, String titme) {
        super(Foodcategory.FOODCATEGORY);

        set(0, foodCategoryId);
        set(1, titme);
    }
}