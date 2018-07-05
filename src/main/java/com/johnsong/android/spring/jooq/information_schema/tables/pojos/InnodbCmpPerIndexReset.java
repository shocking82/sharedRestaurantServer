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
public class InnodbCmpPerIndexReset implements Serializable {

    private static final long serialVersionUID = 173950039;

    private final String  databaseName;
    private final String  tableName;
    private final String  indexName;
    private final Integer compressOps;
    private final Integer compressOpsOk;
    private final Integer compressTime;
    private final Integer uncompressOps;
    private final Integer uncompressTime;

    public InnodbCmpPerIndexReset(InnodbCmpPerIndexReset value) {
        this.databaseName = value.databaseName;
        this.tableName = value.tableName;
        this.indexName = value.indexName;
        this.compressOps = value.compressOps;
        this.compressOpsOk = value.compressOpsOk;
        this.compressTime = value.compressTime;
        this.uncompressOps = value.uncompressOps;
        this.uncompressTime = value.uncompressTime;
    }

    public InnodbCmpPerIndexReset(
        String  databaseName,
        String  tableName,
        String  indexName,
        Integer compressOps,
        Integer compressOpsOk,
        Integer compressTime,
        Integer uncompressOps,
        Integer uncompressTime
    ) {
        this.databaseName = databaseName;
        this.tableName = tableName;
        this.indexName = indexName;
        this.compressOps = compressOps;
        this.compressOpsOk = compressOpsOk;
        this.compressTime = compressTime;
        this.uncompressOps = uncompressOps;
        this.uncompressTime = uncompressTime;
    }

    public String getDatabaseName() {
        return this.databaseName;
    }

    public String getTableName() {
        return this.tableName;
    }

    public String getIndexName() {
        return this.indexName;
    }

    public Integer getCompressOps() {
        return this.compressOps;
    }

    public Integer getCompressOpsOk() {
        return this.compressOpsOk;
    }

    public Integer getCompressTime() {
        return this.compressTime;
    }

    public Integer getUncompressOps() {
        return this.uncompressOps;
    }

    public Integer getUncompressTime() {
        return this.uncompressTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InnodbCmpPerIndexReset (");

        sb.append(databaseName);
        sb.append(", ").append(tableName);
        sb.append(", ").append(indexName);
        sb.append(", ").append(compressOps);
        sb.append(", ").append(compressOpsOk);
        sb.append(", ").append(compressTime);
        sb.append(", ").append(uncompressOps);
        sb.append(", ").append(uncompressTime);

        sb.append(")");
        return sb.toString();
    }
}
