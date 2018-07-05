/*
 * This file is generated by jOOQ.
*/
package com.johnsong.android.spring.jooq.information_schema.tables.records;


import com.johnsong.android.spring.jooq.information_schema.tables.InnodbCmpmem;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class InnodbCmpmemRecord extends TableRecordImpl<InnodbCmpmemRecord> implements Record6<Integer, Integer, Integer, Integer, Long, Integer> {

    private static final long serialVersionUID = 90481516;

    /**
     * Setter for <code>information_schema.INNODB_CMPMEM.page_size</code>.
     */
    public InnodbCmpmemRecord setPageSize(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.INNODB_CMPMEM.page_size</code>.
     */
    public Integer getPageSize() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>information_schema.INNODB_CMPMEM.buffer_pool_instance</code>.
     */
    public InnodbCmpmemRecord setBufferPoolInstance(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.INNODB_CMPMEM.buffer_pool_instance</code>.
     */
    public Integer getBufferPoolInstance() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>information_schema.INNODB_CMPMEM.pages_used</code>.
     */
    public InnodbCmpmemRecord setPagesUsed(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.INNODB_CMPMEM.pages_used</code>.
     */
    public Integer getPagesUsed() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>information_schema.INNODB_CMPMEM.pages_free</code>.
     */
    public InnodbCmpmemRecord setPagesFree(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.INNODB_CMPMEM.pages_free</code>.
     */
    public Integer getPagesFree() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>information_schema.INNODB_CMPMEM.relocation_ops</code>.
     */
    public InnodbCmpmemRecord setRelocationOps(Long value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.INNODB_CMPMEM.relocation_ops</code>.
     */
    public Long getRelocationOps() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>information_schema.INNODB_CMPMEM.relocation_time</code>.
     */
    public InnodbCmpmemRecord setRelocationTime(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.INNODB_CMPMEM.relocation_time</code>.
     */
    public Integer getRelocationTime() {
        return (Integer) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, Integer, Long, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, Integer, Long, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return InnodbCmpmem.INNODB_CMPMEM.PAGE_SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return InnodbCmpmem.INNODB_CMPMEM.BUFFER_POOL_INSTANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return InnodbCmpmem.INNODB_CMPMEM.PAGES_USED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return InnodbCmpmem.INNODB_CMPMEM.PAGES_FREE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return InnodbCmpmem.INNODB_CMPMEM.RELOCATION_OPS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return InnodbCmpmem.INNODB_CMPMEM.RELOCATION_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getPageSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getBufferPoolInstance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getPagesUsed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getPagesFree();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getRelocationOps();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getRelocationTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getPageSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getBufferPoolInstance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getPagesUsed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getPagesFree();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getRelocationOps();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getRelocationTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbCmpmemRecord value1(Integer value) {
        setPageSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbCmpmemRecord value2(Integer value) {
        setBufferPoolInstance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbCmpmemRecord value3(Integer value) {
        setPagesUsed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbCmpmemRecord value4(Integer value) {
        setPagesFree(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbCmpmemRecord value5(Long value) {
        setRelocationOps(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbCmpmemRecord value6(Integer value) {
        setRelocationTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbCmpmemRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Long value5, Integer value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InnodbCmpmemRecord
     */
    public InnodbCmpmemRecord() {
        super(InnodbCmpmem.INNODB_CMPMEM);
    }

    /**
     * Create a detached, initialised InnodbCmpmemRecord
     */
    public InnodbCmpmemRecord(Integer pageSize, Integer bufferPoolInstance, Integer pagesUsed, Integer pagesFree, Long relocationOps, Integer relocationTime) {
        super(InnodbCmpmem.INNODB_CMPMEM);

        set(0, pageSize);
        set(1, bufferPoolInstance);
        set(2, pagesUsed);
        set(3, pagesFree);
        set(4, relocationOps);
        set(5, relocationTime);
    }
}
