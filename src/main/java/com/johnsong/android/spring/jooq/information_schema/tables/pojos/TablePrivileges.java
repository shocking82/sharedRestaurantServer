/*
 * This file is generated by jOOQ.
*/
package com.johnsong.android.spring.jooq.information_schema.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


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
public class TablePrivileges implements Serializable {

    private static final long serialVersionUID = 211958424;

    private final String grantee;
    private final String tableCatalog;
    private final String tableSchema;
    private final String tableName;
    private final String privilegeType;
    private final String isGrantable;

    public TablePrivileges(TablePrivileges value) {
        this.grantee = value.grantee;
        this.tableCatalog = value.tableCatalog;
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
        this.privilegeType = value.privilegeType;
        this.isGrantable = value.isGrantable;
    }

    public TablePrivileges(
        String grantee,
        String tableCatalog,
        String tableSchema,
        String tableName,
        String privilegeType,
        String isGrantable
    ) {
        this.grantee = grantee;
        this.tableCatalog = tableCatalog;
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.privilegeType = privilegeType;
        this.isGrantable = isGrantable;
    }

    public String getGrantee() {
        return this.grantee;
    }

    public String getTableCatalog() {
        return this.tableCatalog;
    }

    public String getTableSchema() {
        return this.tableSchema;
    }

    public String getTableName() {
        return this.tableName;
    }

    public String getPrivilegeType() {
        return this.privilegeType;
    }

    public String getIsGrantable() {
        return this.isGrantable;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TablePrivileges (");

        sb.append(grantee);
        sb.append(", ").append(tableCatalog);
        sb.append(", ").append(tableSchema);
        sb.append(", ").append(tableName);
        sb.append(", ").append(privilegeType);
        sb.append(", ").append(isGrantable);

        sb.append(")");
        return sb.toString();
    }
}