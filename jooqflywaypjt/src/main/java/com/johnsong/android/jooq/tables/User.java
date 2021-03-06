/*
 * This file is generated by jOOQ.
*/
package com.johnsong.android.jooq.tables;


import com.johnsong.android.jooq.Banana;
import com.johnsong.android.jooq.Indexes;
import com.johnsong.android.jooq.Keys;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
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
public class User extends TableImpl<Record> {

    private static final long serialVersionUID = 880554706;

    /**
     * The reference instance of <code>banana.User</code>
     */
    public static final User USER = new User();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>banana.User.user_id</code>.
     */
    public final TableField<Record, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>banana.User.email</code>.
     */
    public final TableField<Record, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>banana.User.login_platform</code>.
     */
    public final TableField<Record, String> LOGIN_PLATFORM = createField("login_platform", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>banana.User.picture</code>.
     */
    public final TableField<Record, String> PICTURE = createField("picture", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>banana.User.name</code>.
     */
    public final TableField<Record, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * Create a <code>banana.User</code> table reference
     */
    public User() {
        this(DSL.name("User"), null);
    }

    /**
     * Create an aliased <code>banana.User</code> table reference
     */
    public User(String alias) {
        this(DSL.name(alias), USER);
    }

    /**
     * Create an aliased <code>banana.User</code> table reference
     */
    public User(Name alias) {
        this(alias, USER);
    }

    private User(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private User(Name alias, Table<Record> aliased, Field<?>[] parameters) {
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
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.USER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<Record, Integer> getIdentity() {
        return Keys.IDENTITY_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.KEY_USER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<Record>> getKeys() {
        return Arrays.<UniqueKey<Record>>asList(Keys.KEY_USER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User as(String alias) {
        return new User(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User as(Name alias) {
        return new User(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public User rename(String name) {
        return new User(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public User rename(Name name) {
        return new User(name, null);
    }
}
