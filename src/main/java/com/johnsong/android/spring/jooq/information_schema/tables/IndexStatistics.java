/*
 * This file is generated by jOOQ.
*/
package com.johnsong.android.spring.jooq.information_schema.tables;


import com.johnsong.android.spring.jooq.information_schema.InformationSchema;
import com.johnsong.android.spring.jooq.information_schema.tables.records.IndexStatisticsRecord;

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
public class IndexStatistics extends TableImpl<IndexStatisticsRecord> {

    private static final long serialVersionUID = -2066807567;

    /**
     * The reference instance of <code>information_schema.INDEX_STATISTICS</code>
     */
    public static final IndexStatistics INDEX_STATISTICS = new IndexStatistics();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IndexStatisticsRecord> getRecordType() {
        return IndexStatisticsRecord.class;
    }

    /**
     * The column <code>information_schema.INDEX_STATISTICS.TABLE_SCHEMA</code>.
     */
    public final TableField<IndexStatisticsRecord, String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR(192).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INDEX_STATISTICS.TABLE_NAME</code>.
     */
    public final TableField<IndexStatisticsRecord, String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR(192).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INDEX_STATISTICS.INDEX_NAME</code>.
     */
    public final TableField<IndexStatisticsRecord, String> INDEX_NAME = createField("INDEX_NAME", org.jooq.impl.SQLDataType.VARCHAR(192).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INDEX_STATISTICS.ROWS_READ</code>.
     */
    public final TableField<IndexStatisticsRecord, Long> ROWS_READ = createField("ROWS_READ", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>information_schema.INDEX_STATISTICS</code> table reference
     */
    public IndexStatistics() {
        this(DSL.name("INDEX_STATISTICS"), null);
    }

    /**
     * Create an aliased <code>information_schema.INDEX_STATISTICS</code> table reference
     */
    public IndexStatistics(String alias) {
        this(DSL.name(alias), INDEX_STATISTICS);
    }

    /**
     * Create an aliased <code>information_schema.INDEX_STATISTICS</code> table reference
     */
    public IndexStatistics(Name alias) {
        this(alias, INDEX_STATISTICS);
    }

    private IndexStatistics(Name alias, Table<IndexStatisticsRecord> aliased) {
        this(alias, aliased, null);
    }

    private IndexStatistics(Name alias, Table<IndexStatisticsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndexStatistics as(String alias) {
        return new IndexStatistics(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndexStatistics as(Name alias) {
        return new IndexStatistics(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IndexStatistics rename(String name) {
        return new IndexStatistics(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IndexStatistics rename(Name name) {
        return new IndexStatistics(name, null);
    }
}
