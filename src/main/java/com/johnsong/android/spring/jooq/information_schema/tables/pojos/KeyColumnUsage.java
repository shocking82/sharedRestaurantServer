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
public class KeyColumnUsage implements Serializable {

    private static final long serialVersionUID = 1274165684;

    private final String constraintCatalog;
    private final String constraintSchema;
    private final String constraintName;
    private final String tableCatalog;
    private final String tableSchema;
    private final String tableName;
    private final String columnName;
    private final Long   ordinalPosition;
    private final Long   positionInUniqueConstraint;
    private final String referencedTableSchema;
    private final String referencedTableName;
    private final String referencedColumnName;

    public KeyColumnUsage(KeyColumnUsage value) {
        this.constraintCatalog = value.constraintCatalog;
        this.constraintSchema = value.constraintSchema;
        this.constraintName = value.constraintName;
        this.tableCatalog = value.tableCatalog;
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
        this.columnName = value.columnName;
        this.ordinalPosition = value.ordinalPosition;
        this.positionInUniqueConstraint = value.positionInUniqueConstraint;
        this.referencedTableSchema = value.referencedTableSchema;
        this.referencedTableName = value.referencedTableName;
        this.referencedColumnName = value.referencedColumnName;
    }

    public KeyColumnUsage(
        String constraintCatalog,
        String constraintSchema,
        String constraintName,
        String tableCatalog,
        String tableSchema,
        String tableName,
        String columnName,
        Long   ordinalPosition,
        Long   positionInUniqueConstraint,
        String referencedTableSchema,
        String referencedTableName,
        String referencedColumnName
    ) {
        this.constraintCatalog = constraintCatalog;
        this.constraintSchema = constraintSchema;
        this.constraintName = constraintName;
        this.tableCatalog = tableCatalog;
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.columnName = columnName;
        this.ordinalPosition = ordinalPosition;
        this.positionInUniqueConstraint = positionInUniqueConstraint;
        this.referencedTableSchema = referencedTableSchema;
        this.referencedTableName = referencedTableName;
        this.referencedColumnName = referencedColumnName;
    }

    public String getConstraintCatalog() {
        return this.constraintCatalog;
    }

    public String getConstraintSchema() {
        return this.constraintSchema;
    }

    public String getConstraintName() {
        return this.constraintName;
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

    public String getColumnName() {
        return this.columnName;
    }

    public Long getOrdinalPosition() {
        return this.ordinalPosition;
    }

    public Long getPositionInUniqueConstraint() {
        return this.positionInUniqueConstraint;
    }

    public String getReferencedTableSchema() {
        return this.referencedTableSchema;
    }

    public String getReferencedTableName() {
        return this.referencedTableName;
    }

    public String getReferencedColumnName() {
        return this.referencedColumnName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("KeyColumnUsage (");

        sb.append(constraintCatalog);
        sb.append(", ").append(constraintSchema);
        sb.append(", ").append(constraintName);
        sb.append(", ").append(tableCatalog);
        sb.append(", ").append(tableSchema);
        sb.append(", ").append(tableName);
        sb.append(", ").append(columnName);
        sb.append(", ").append(ordinalPosition);
        sb.append(", ").append(positionInUniqueConstraint);
        sb.append(", ").append(referencedTableSchema);
        sb.append(", ").append(referencedTableName);
        sb.append(", ").append(referencedColumnName);

        sb.append(")");
        return sb.toString();
    }
}
