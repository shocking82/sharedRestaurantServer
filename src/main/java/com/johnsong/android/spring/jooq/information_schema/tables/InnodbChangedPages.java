/*
 * This file is generated by jOOQ.
*/
package com.johnsong.android.spring.jooq.information_schema.tables;


import com.johnsong.android.spring.jooq.information_schema.InformationSchema;
import com.johnsong.android.spring.jooq.information_schema.tables.records.InnodbChangedPagesRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


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
public class InnodbChangedPages extends TableImpl<InnodbChangedPagesRecord> {

    private static final long serialVersionUID = -72081615;

    /**
     * The reference instance of <code>information_schema.INNODB_CHANGED_PAGES</code>
     */
    public static final InnodbChangedPages INNODB_CHANGED_PAGES = new InnodbChangedPages();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbChangedPagesRecord> getRecordType() {
        return InnodbChangedPagesRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_CHANGED_PAGES.space_id</code>.
     */
    public final TableField<InnodbChangedPagesRecord, UInteger> SPACE_ID = createField("space_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_CHANGED_PAGES.page_id</code>.
     */
    public final TableField<InnodbChangedPagesRecord, UInteger> PAGE_ID = createField("page_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_CHANGED_PAGES.start_lsn</code>.
     */
    public final TableField<InnodbChangedPagesRecord, ULong> START_LSN = createField("start_lsn", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_CHANGED_PAGES.end_lsn</code>.
     */
    public final TableField<InnodbChangedPagesRecord, ULong> END_LSN = createField("end_lsn", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>information_schema.INNODB_CHANGED_PAGES</code> table reference
     */
    public InnodbChangedPages() {
        this(DSL.name("INNODB_CHANGED_PAGES"), null);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_CHANGED_PAGES</code> table reference
     */
    public InnodbChangedPages(String alias) {
        this(DSL.name(alias), INNODB_CHANGED_PAGES);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_CHANGED_PAGES</code> table reference
     */
    public InnodbChangedPages(Name alias) {
        this(alias, INNODB_CHANGED_PAGES);
    }

    private InnodbChangedPages(Name alias, Table<InnodbChangedPagesRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbChangedPages(Name alias, Table<InnodbChangedPagesRecord> aliased, Field<?>[] parameters) {
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
    public InnodbChangedPages as(String alias) {
        return new InnodbChangedPages(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbChangedPages as(Name alias) {
        return new InnodbChangedPages(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbChangedPages rename(String name) {
        return new InnodbChangedPages(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbChangedPages rename(Name name) {
        return new InnodbChangedPages(name, null);
    }
}
