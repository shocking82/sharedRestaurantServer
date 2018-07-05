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
public class UserStatistics implements Serializable {

    private static final long serialVersionUID = 710664942;

    private final String  user;
    private final Integer totalConnections;
    private final Integer concurrentConnections;
    private final Integer connectedTime;
    private final Double  busyTime;
    private final Double  cpuTime;
    private final Long    bytesReceived;
    private final Long    bytesSent;
    private final Long    binlogBytesWritten;
    private final Long    rowsRead;
    private final Long    rowsSent;
    private final Long    rowsDeleted;
    private final Long    rowsInserted;
    private final Long    rowsUpdated;
    private final Long    selectCommands;
    private final Long    updateCommands;
    private final Long    otherCommands;
    private final Long    commitTransactions;
    private final Long    rollbackTransactions;
    private final Long    deniedConnections;
    private final Long    lostConnections;
    private final Long    accessDenied;
    private final Long    emptyQueries;

    public UserStatistics(UserStatistics value) {
        this.user = value.user;
        this.totalConnections = value.totalConnections;
        this.concurrentConnections = value.concurrentConnections;
        this.connectedTime = value.connectedTime;
        this.busyTime = value.busyTime;
        this.cpuTime = value.cpuTime;
        this.bytesReceived = value.bytesReceived;
        this.bytesSent = value.bytesSent;
        this.binlogBytesWritten = value.binlogBytesWritten;
        this.rowsRead = value.rowsRead;
        this.rowsSent = value.rowsSent;
        this.rowsDeleted = value.rowsDeleted;
        this.rowsInserted = value.rowsInserted;
        this.rowsUpdated = value.rowsUpdated;
        this.selectCommands = value.selectCommands;
        this.updateCommands = value.updateCommands;
        this.otherCommands = value.otherCommands;
        this.commitTransactions = value.commitTransactions;
        this.rollbackTransactions = value.rollbackTransactions;
        this.deniedConnections = value.deniedConnections;
        this.lostConnections = value.lostConnections;
        this.accessDenied = value.accessDenied;
        this.emptyQueries = value.emptyQueries;
    }

    public UserStatistics(
        String  user,
        Integer totalConnections,
        Integer concurrentConnections,
        Integer connectedTime,
        Double  busyTime,
        Double  cpuTime,
        Long    bytesReceived,
        Long    bytesSent,
        Long    binlogBytesWritten,
        Long    rowsRead,
        Long    rowsSent,
        Long    rowsDeleted,
        Long    rowsInserted,
        Long    rowsUpdated,
        Long    selectCommands,
        Long    updateCommands,
        Long    otherCommands,
        Long    commitTransactions,
        Long    rollbackTransactions,
        Long    deniedConnections,
        Long    lostConnections,
        Long    accessDenied,
        Long    emptyQueries
    ) {
        this.user = user;
        this.totalConnections = totalConnections;
        this.concurrentConnections = concurrentConnections;
        this.connectedTime = connectedTime;
        this.busyTime = busyTime;
        this.cpuTime = cpuTime;
        this.bytesReceived = bytesReceived;
        this.bytesSent = bytesSent;
        this.binlogBytesWritten = binlogBytesWritten;
        this.rowsRead = rowsRead;
        this.rowsSent = rowsSent;
        this.rowsDeleted = rowsDeleted;
        this.rowsInserted = rowsInserted;
        this.rowsUpdated = rowsUpdated;
        this.selectCommands = selectCommands;
        this.updateCommands = updateCommands;
        this.otherCommands = otherCommands;
        this.commitTransactions = commitTransactions;
        this.rollbackTransactions = rollbackTransactions;
        this.deniedConnections = deniedConnections;
        this.lostConnections = lostConnections;
        this.accessDenied = accessDenied;
        this.emptyQueries = emptyQueries;
    }

    public String getUser() {
        return this.user;
    }

    public Integer getTotalConnections() {
        return this.totalConnections;
    }

    public Integer getConcurrentConnections() {
        return this.concurrentConnections;
    }

    public Integer getConnectedTime() {
        return this.connectedTime;
    }

    public Double getBusyTime() {
        return this.busyTime;
    }

    public Double getCpuTime() {
        return this.cpuTime;
    }

    public Long getBytesReceived() {
        return this.bytesReceived;
    }

    public Long getBytesSent() {
        return this.bytesSent;
    }

    public Long getBinlogBytesWritten() {
        return this.binlogBytesWritten;
    }

    public Long getRowsRead() {
        return this.rowsRead;
    }

    public Long getRowsSent() {
        return this.rowsSent;
    }

    public Long getRowsDeleted() {
        return this.rowsDeleted;
    }

    public Long getRowsInserted() {
        return this.rowsInserted;
    }

    public Long getRowsUpdated() {
        return this.rowsUpdated;
    }

    public Long getSelectCommands() {
        return this.selectCommands;
    }

    public Long getUpdateCommands() {
        return this.updateCommands;
    }

    public Long getOtherCommands() {
        return this.otherCommands;
    }

    public Long getCommitTransactions() {
        return this.commitTransactions;
    }

    public Long getRollbackTransactions() {
        return this.rollbackTransactions;
    }

    public Long getDeniedConnections() {
        return this.deniedConnections;
    }

    public Long getLostConnections() {
        return this.lostConnections;
    }

    public Long getAccessDenied() {
        return this.accessDenied;
    }

    public Long getEmptyQueries() {
        return this.emptyQueries;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserStatistics (");

        sb.append(user);
        sb.append(", ").append(totalConnections);
        sb.append(", ").append(concurrentConnections);
        sb.append(", ").append(connectedTime);
        sb.append(", ").append(busyTime);
        sb.append(", ").append(cpuTime);
        sb.append(", ").append(bytesReceived);
        sb.append(", ").append(bytesSent);
        sb.append(", ").append(binlogBytesWritten);
        sb.append(", ").append(rowsRead);
        sb.append(", ").append(rowsSent);
        sb.append(", ").append(rowsDeleted);
        sb.append(", ").append(rowsInserted);
        sb.append(", ").append(rowsUpdated);
        sb.append(", ").append(selectCommands);
        sb.append(", ").append(updateCommands);
        sb.append(", ").append(otherCommands);
        sb.append(", ").append(commitTransactions);
        sb.append(", ").append(rollbackTransactions);
        sb.append(", ").append(deniedConnections);
        sb.append(", ").append(lostConnections);
        sb.append(", ").append(accessDenied);
        sb.append(", ").append(emptyQueries);

        sb.append(")");
        return sb.toString();
    }
}