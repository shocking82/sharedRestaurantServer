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
public class Views implements Serializable {

    private static final long serialVersionUID = -18048008;

    private final String tableCatalog;
    private final String tableSchema;
    private final String tableName;
    private final String viewDefinition;
    private final String checkOption;
    private final String isUpdatable;
    private final String definer;
    private final String securityType;
    private final String characterSetClient;
    private final String collationConnection;

    public Views(Views value) {
        this.tableCatalog = value.tableCatalog;
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
        this.viewDefinition = value.viewDefinition;
        this.checkOption = value.checkOption;
        this.isUpdatable = value.isUpdatable;
        this.definer = value.definer;
        this.securityType = value.securityType;
        this.characterSetClient = value.characterSetClient;
        this.collationConnection = value.collationConnection;
    }

    public Views(
        String tableCatalog,
        String tableSchema,
        String tableName,
        String viewDefinition,
        String checkOption,
        String isUpdatable,
        String definer,
        String securityType,
        String characterSetClient,
        String collationConnection
    ) {
        this.tableCatalog = tableCatalog;
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.viewDefinition = viewDefinition;
        this.checkOption = checkOption;
        this.isUpdatable = isUpdatable;
        this.definer = definer;
        this.securityType = securityType;
        this.characterSetClient = characterSetClient;
        this.collationConnection = collationConnection;
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

    public String getViewDefinition() {
        return this.viewDefinition;
    }

    public String getCheckOption() {
        return this.checkOption;
    }

    public String getIsUpdatable() {
        return this.isUpdatable;
    }

    public String getDefiner() {
        return this.definer;
    }

    public String getSecurityType() {
        return this.securityType;
    }

    public String getCharacterSetClient() {
        return this.characterSetClient;
    }

    public String getCollationConnection() {
        return this.collationConnection;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Views (");

        sb.append(tableCatalog);
        sb.append(", ").append(tableSchema);
        sb.append(", ").append(tableName);
        sb.append(", ").append(viewDefinition);
        sb.append(", ").append(checkOption);
        sb.append(", ").append(isUpdatable);
        sb.append(", ").append(definer);
        sb.append(", ").append(securityType);
        sb.append(", ").append(characterSetClient);
        sb.append(", ").append(collationConnection);

        sb.append(")");
        return sb.toString();
    }
}
