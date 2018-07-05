/*
 * This file is generated by jOOQ.
*/
package com.johnsong.android.spring.jooq.information_schema.tables;


import com.johnsong.android.spring.jooq.information_schema.InformationSchema;
import com.johnsong.android.spring.jooq.information_schema.tables.records.InnodbSysForeignRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


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
public class InnodbSysForeign extends TableImpl<InnodbSysForeignRecord> {

    private static final long serialVersionUID = 322616556;

    /**
     * The reference instance of <code>information_schema.INNODB_SYS_FOREIGN</code>
     */
    public static final InnodbSysForeign INNODB_SYS_FOREIGN = new InnodbSysForeign();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbSysForeignRecord> getRecordType() {
        return InnodbSysForeignRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_SYS_FOREIGN.ID</code>.
     */
    public final TableField<InnodbSysForeignRecord, String> ID = createField("ID", org.jooq.impl.SQLDataType.VARCHAR(193).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_FOREIGN.FOR_NAME</code>.
     */
    public final TableField<InnodbSysForeignRecord, String> FOR_NAME = createField("FOR_NAME", org.jooq.impl.SQLDataType.VARCHAR(193).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_FOREIGN.REF_NAME</code>.
     */
    public final TableField<InnodbSysForeignRecord, String> REF_NAME = createField("REF_NAME", org.jooq.impl.SQLDataType.VARCHAR(193).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_FOREIGN.N_COLS</code>.
     */
    public final TableField<InnodbSysForeignRecord, UInteger> N_COLS = createField("N_COLS", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_FOREIGN.TYPE</code>.
     */
    public final TableField<InnodbSysForeignRecord, UInteger> TYPE = createField("TYPE", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * Create a <code>information_schema.INNODB_SYS_FOREIGN</code> table reference
     */
    public InnodbSysForeign() {
        this(DSL.name("INNODB_SYS_FOREIGN"), null);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_FOREIGN</code> table reference
     */
    public InnodbSysForeign(String alias) {
        this(DSL.name(alias), INNODB_SYS_FOREIGN);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_FOREIGN</code> table reference
     */
    public InnodbSysForeign(Name alias) {
        this(alias, INNODB_SYS_FOREIGN);
    }

    private InnodbSysForeign(Name alias, Table<InnodbSysForeignRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbSysForeign(Name alias, Table<InnodbSysForeignRecord> aliased, Field<?>[] parameters) {
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
    public InnodbSysForeign as(String alias) {
        return new InnodbSysForeign(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysForeign as(Name alias) {
        return new InnodbSysForeign(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSysForeign rename(String name) {
        return new InnodbSysForeign(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSysForeign rename(Name name) {
        return new InnodbSysForeign(name, null);
    }
}
