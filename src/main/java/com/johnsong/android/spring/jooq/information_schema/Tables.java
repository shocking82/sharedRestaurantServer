/*
 * This file is generated by jOOQ.
*/
package com.johnsong.android.spring.jooq.information_schema;


import com.johnsong.android.spring.jooq.information_schema.tables.AllPlugins;
import com.johnsong.android.spring.jooq.information_schema.tables.ApplicableRoles;
import com.johnsong.android.spring.jooq.information_schema.tables.CharacterSets;
import com.johnsong.android.spring.jooq.information_schema.tables.ClientStatistics;
import com.johnsong.android.spring.jooq.information_schema.tables.CollationCharacterSetApplicability;
import com.johnsong.android.spring.jooq.information_schema.tables.Collations;
import com.johnsong.android.spring.jooq.information_schema.tables.ColumnPrivileges;
import com.johnsong.android.spring.jooq.information_schema.tables.Columns;
import com.johnsong.android.spring.jooq.information_schema.tables.EnabledRoles;
import com.johnsong.android.spring.jooq.information_schema.tables.Engines;
import com.johnsong.android.spring.jooq.information_schema.tables.Events;
import com.johnsong.android.spring.jooq.information_schema.tables.Files;
import com.johnsong.android.spring.jooq.information_schema.tables.GlobalStatus;
import com.johnsong.android.spring.jooq.information_schema.tables.GlobalVariables;
import com.johnsong.android.spring.jooq.information_schema.tables.IndexStatistics;
import com.johnsong.android.spring.jooq.information_schema.tables.InnodbBufferPage;
import com.johnsong.android.spring.jooq.information_schema.tables.InnodbBufferPageLru;
import com.johnsong.android.spring.jooq.information_schema.tables.InnodbBufferPoolStats;
import com.johnsong.android.spring.jooq.information_schema.tables.InnodbChangedPages;
import com.johnsong.android.spring.jooq.information_schema.tables.InnodbCmp;
import com.johnsong.android.spring.jooq.information_schema.tables.InnodbCmpPerIndex;
import com.johnsong.android.spring.jooq.information_schema.tables.InnodbCmpPerIndexReset;
import com.johnsong.android.spring.jooq.information_schema.tables.InnodbCmpReset;
import com.johnsong.android.spring.jooq.information_schema.tables.InnodbCmpmem;
import com.johnsong.android.spring.jooq.information_schema.tables.InnodbCmpmemReset;
import com.johnsong.android.spring.jooq.information_schema.tables.InnodbFtBeingDeleted;
import com.johnsong.android.spring.jooq.information_schema.tables.InnodbFtConfig;
import com.johnsong.android.spring.jooq.information_schema.tables.InnodbFtDefaultStopword;
import com.johnsong.android.spring.jooq.information_schema.tables.InnodbFtDeleted;
import com.johnsong.android.spring.jooq.information_schema.tables.InnodbFtIndexCache;
import com.johnsong.android.spring.jooq.information_schema.tables.InnodbFtIndexTable;
import com.johnsong.android.spring.jooq.information_schema.tables.InnodbLockWaits;
import com.johnsong.android.spring.jooq.information_schema.tables.InnodbLocks;
import com.johnsong.android.spring.jooq.information_schema.tables.InnodbMetrics;
import com.johnsong.android.spring.jooq.information_schema.tables.InnodbSysColumns;
import com.johnsong.android.spring.jooq.information_schema.tables.InnodbSysDatafiles;
import com.johnsong.android.spring.jooq.information_schema.tables.InnodbSysFields;
import com.johnsong.android.spring.jooq.information_schema.tables.InnodbSysForeign;
import com.johnsong.android.spring.jooq.information_schema.tables.InnodbSysForeignCols;
import com.johnsong.android.spring.jooq.information_schema.tables.InnodbSysIndexes;
import com.johnsong.android.spring.jooq.information_schema.tables.InnodbSysTables;
import com.johnsong.android.spring.jooq.information_schema.tables.InnodbSysTablespaces;
import com.johnsong.android.spring.jooq.information_schema.tables.InnodbSysTablestats;
import com.johnsong.android.spring.jooq.information_schema.tables.InnodbTrx;
import com.johnsong.android.spring.jooq.information_schema.tables.KeyCaches;
import com.johnsong.android.spring.jooq.information_schema.tables.KeyColumnUsage;
import com.johnsong.android.spring.jooq.information_schema.tables.Parameters;
import com.johnsong.android.spring.jooq.information_schema.tables.Partitions;
import com.johnsong.android.spring.jooq.information_schema.tables.Plugins;
import com.johnsong.android.spring.jooq.information_schema.tables.Processlist;
import com.johnsong.android.spring.jooq.information_schema.tables.Profiling;
import com.johnsong.android.spring.jooq.information_schema.tables.ReferentialConstraints;
import com.johnsong.android.spring.jooq.information_schema.tables.Routines;
import com.johnsong.android.spring.jooq.information_schema.tables.SchemaPrivileges;
import com.johnsong.android.spring.jooq.information_schema.tables.Schemata;
import com.johnsong.android.spring.jooq.information_schema.tables.SessionStatus;
import com.johnsong.android.spring.jooq.information_schema.tables.SessionVariables;
import com.johnsong.android.spring.jooq.information_schema.tables.Statistics;
import com.johnsong.android.spring.jooq.information_schema.tables.TableConstraints;
import com.johnsong.android.spring.jooq.information_schema.tables.TablePrivileges;
import com.johnsong.android.spring.jooq.information_schema.tables.TableStatistics;
import com.johnsong.android.spring.jooq.information_schema.tables.Tablespaces;
import com.johnsong.android.spring.jooq.information_schema.tables.Triggers;
import com.johnsong.android.spring.jooq.information_schema.tables.UserPrivileges;
import com.johnsong.android.spring.jooq.information_schema.tables.UserStatistics;
import com.johnsong.android.spring.jooq.information_schema.tables.Views;
import com.johnsong.android.spring.jooq.information_schema.tables.XtradbInternalHashTables;
import com.johnsong.android.spring.jooq.information_schema.tables.XtradbReadView;
import com.johnsong.android.spring.jooq.information_schema.tables.XtradbRseg;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in information_schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>information_schema.ALL_PLUGINS</code>.
     */
    public static final AllPlugins ALL_PLUGINS = com.johnsong.android.spring.jooq.information_schema.tables.AllPlugins.ALL_PLUGINS;

    /**
     * The table <code>information_schema.APPLICABLE_ROLES</code>.
     */
    public static final ApplicableRoles APPLICABLE_ROLES = com.johnsong.android.spring.jooq.information_schema.tables.ApplicableRoles.APPLICABLE_ROLES;

    /**
     * The table <code>information_schema.CHARACTER_SETS</code>.
     */
    public static final CharacterSets CHARACTER_SETS = com.johnsong.android.spring.jooq.information_schema.tables.CharacterSets.CHARACTER_SETS;

    /**
     * The table <code>information_schema.CLIENT_STATISTICS</code>.
     */
    public static final ClientStatistics CLIENT_STATISTICS = com.johnsong.android.spring.jooq.information_schema.tables.ClientStatistics.CLIENT_STATISTICS;

    /**
     * The table <code>information_schema.COLLATIONS</code>.
     */
    public static final Collations COLLATIONS = com.johnsong.android.spring.jooq.information_schema.tables.Collations.COLLATIONS;

    /**
     * The table <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY</code>.
     */
    public static final CollationCharacterSetApplicability COLLATION_CHARACTER_SET_APPLICABILITY = com.johnsong.android.spring.jooq.information_schema.tables.CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY;

    /**
     * The table <code>information_schema.COLUMNS</code>.
     */
    public static final Columns COLUMNS = com.johnsong.android.spring.jooq.information_schema.tables.Columns.COLUMNS;

    /**
     * The table <code>information_schema.COLUMN_PRIVILEGES</code>.
     */
    public static final ColumnPrivileges COLUMN_PRIVILEGES = com.johnsong.android.spring.jooq.information_schema.tables.ColumnPrivileges.COLUMN_PRIVILEGES;

    /**
     * The table <code>information_schema.ENABLED_ROLES</code>.
     */
    public static final EnabledRoles ENABLED_ROLES = com.johnsong.android.spring.jooq.information_schema.tables.EnabledRoles.ENABLED_ROLES;

    /**
     * The table <code>information_schema.ENGINES</code>.
     */
    public static final Engines ENGINES = com.johnsong.android.spring.jooq.information_schema.tables.Engines.ENGINES;

    /**
     * The table <code>information_schema.EVENTS</code>.
     */
    public static final Events EVENTS = com.johnsong.android.spring.jooq.information_schema.tables.Events.EVENTS;

    /**
     * The table <code>information_schema.FILES</code>.
     */
    public static final Files FILES = com.johnsong.android.spring.jooq.information_schema.tables.Files.FILES;

    /**
     * The table <code>information_schema.GLOBAL_STATUS</code>.
     */
    public static final GlobalStatus GLOBAL_STATUS = com.johnsong.android.spring.jooq.information_schema.tables.GlobalStatus.GLOBAL_STATUS;

    /**
     * The table <code>information_schema.GLOBAL_VARIABLES</code>.
     */
    public static final GlobalVariables GLOBAL_VARIABLES = com.johnsong.android.spring.jooq.information_schema.tables.GlobalVariables.GLOBAL_VARIABLES;

    /**
     * The table <code>information_schema.INDEX_STATISTICS</code>.
     */
    public static final IndexStatistics INDEX_STATISTICS = com.johnsong.android.spring.jooq.information_schema.tables.IndexStatistics.INDEX_STATISTICS;

    /**
     * The table <code>information_schema.INNODB_BUFFER_PAGE</code>.
     */
    public static final InnodbBufferPage INNODB_BUFFER_PAGE = com.johnsong.android.spring.jooq.information_schema.tables.InnodbBufferPage.INNODB_BUFFER_PAGE;

    /**
     * The table <code>information_schema.INNODB_BUFFER_PAGE_LRU</code>.
     */
    public static final InnodbBufferPageLru INNODB_BUFFER_PAGE_LRU = com.johnsong.android.spring.jooq.information_schema.tables.InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU;

    /**
     * The table <code>information_schema.INNODB_BUFFER_POOL_STATS</code>.
     */
    public static final InnodbBufferPoolStats INNODB_BUFFER_POOL_STATS = com.johnsong.android.spring.jooq.information_schema.tables.InnodbBufferPoolStats.INNODB_BUFFER_POOL_STATS;

    /**
     * The table <code>information_schema.INNODB_CHANGED_PAGES</code>.
     */
    public static final InnodbChangedPages INNODB_CHANGED_PAGES = com.johnsong.android.spring.jooq.information_schema.tables.InnodbChangedPages.INNODB_CHANGED_PAGES;

    /**
     * The table <code>information_schema.INNODB_CMP</code>.
     */
    public static final InnodbCmp INNODB_CMP = com.johnsong.android.spring.jooq.information_schema.tables.InnodbCmp.INNODB_CMP;

    /**
     * The table <code>information_schema.INNODB_CMPMEM</code>.
     */
    public static final InnodbCmpmem INNODB_CMPMEM = com.johnsong.android.spring.jooq.information_schema.tables.InnodbCmpmem.INNODB_CMPMEM;

    /**
     * The table <code>information_schema.INNODB_CMPMEM_RESET</code>.
     */
    public static final InnodbCmpmemReset INNODB_CMPMEM_RESET = com.johnsong.android.spring.jooq.information_schema.tables.InnodbCmpmemReset.INNODB_CMPMEM_RESET;

    /**
     * The table <code>information_schema.INNODB_CMP_PER_INDEX</code>.
     */
    public static final InnodbCmpPerIndex INNODB_CMP_PER_INDEX = com.johnsong.android.spring.jooq.information_schema.tables.InnodbCmpPerIndex.INNODB_CMP_PER_INDEX;

    /**
     * The table <code>information_schema.INNODB_CMP_PER_INDEX_RESET</code>.
     */
    public static final InnodbCmpPerIndexReset INNODB_CMP_PER_INDEX_RESET = com.johnsong.android.spring.jooq.information_schema.tables.InnodbCmpPerIndexReset.INNODB_CMP_PER_INDEX_RESET;

    /**
     * The table <code>information_schema.INNODB_CMP_RESET</code>.
     */
    public static final InnodbCmpReset INNODB_CMP_RESET = com.johnsong.android.spring.jooq.information_schema.tables.InnodbCmpReset.INNODB_CMP_RESET;

    /**
     * The table <code>information_schema.INNODB_FT_BEING_DELETED</code>.
     */
    public static final InnodbFtBeingDeleted INNODB_FT_BEING_DELETED = com.johnsong.android.spring.jooq.information_schema.tables.InnodbFtBeingDeleted.INNODB_FT_BEING_DELETED;

    /**
     * The table <code>information_schema.INNODB_FT_CONFIG</code>.
     */
    public static final InnodbFtConfig INNODB_FT_CONFIG = com.johnsong.android.spring.jooq.information_schema.tables.InnodbFtConfig.INNODB_FT_CONFIG;

    /**
     * The table <code>information_schema.INNODB_FT_DEFAULT_STOPWORD</code>.
     */
    public static final InnodbFtDefaultStopword INNODB_FT_DEFAULT_STOPWORD = com.johnsong.android.spring.jooq.information_schema.tables.InnodbFtDefaultStopword.INNODB_FT_DEFAULT_STOPWORD;

    /**
     * The table <code>information_schema.INNODB_FT_DELETED</code>.
     */
    public static final InnodbFtDeleted INNODB_FT_DELETED = com.johnsong.android.spring.jooq.information_schema.tables.InnodbFtDeleted.INNODB_FT_DELETED;

    /**
     * The table <code>information_schema.INNODB_FT_INDEX_CACHE</code>.
     */
    public static final InnodbFtIndexCache INNODB_FT_INDEX_CACHE = com.johnsong.android.spring.jooq.information_schema.tables.InnodbFtIndexCache.INNODB_FT_INDEX_CACHE;

    /**
     * The table <code>information_schema.INNODB_FT_INDEX_TABLE</code>.
     */
    public static final InnodbFtIndexTable INNODB_FT_INDEX_TABLE = com.johnsong.android.spring.jooq.information_schema.tables.InnodbFtIndexTable.INNODB_FT_INDEX_TABLE;

    /**
     * The table <code>information_schema.INNODB_LOCKS</code>.
     */
    public static final InnodbLocks INNODB_LOCKS = com.johnsong.android.spring.jooq.information_schema.tables.InnodbLocks.INNODB_LOCKS;

    /**
     * The table <code>information_schema.INNODB_LOCK_WAITS</code>.
     */
    public static final InnodbLockWaits INNODB_LOCK_WAITS = com.johnsong.android.spring.jooq.information_schema.tables.InnodbLockWaits.INNODB_LOCK_WAITS;

    /**
     * The table <code>information_schema.INNODB_METRICS</code>.
     */
    public static final InnodbMetrics INNODB_METRICS = com.johnsong.android.spring.jooq.information_schema.tables.InnodbMetrics.INNODB_METRICS;

    /**
     * The table <code>information_schema.INNODB_SYS_COLUMNS</code>.
     */
    public static final InnodbSysColumns INNODB_SYS_COLUMNS = com.johnsong.android.spring.jooq.information_schema.tables.InnodbSysColumns.INNODB_SYS_COLUMNS;

    /**
     * The table <code>information_schema.INNODB_SYS_DATAFILES</code>.
     */
    public static final InnodbSysDatafiles INNODB_SYS_DATAFILES = com.johnsong.android.spring.jooq.information_schema.tables.InnodbSysDatafiles.INNODB_SYS_DATAFILES;

    /**
     * The table <code>information_schema.INNODB_SYS_FIELDS</code>.
     */
    public static final InnodbSysFields INNODB_SYS_FIELDS = com.johnsong.android.spring.jooq.information_schema.tables.InnodbSysFields.INNODB_SYS_FIELDS;

    /**
     * The table <code>information_schema.INNODB_SYS_FOREIGN</code>.
     */
    public static final InnodbSysForeign INNODB_SYS_FOREIGN = com.johnsong.android.spring.jooq.information_schema.tables.InnodbSysForeign.INNODB_SYS_FOREIGN;

    /**
     * The table <code>information_schema.INNODB_SYS_FOREIGN_COLS</code>.
     */
    public static final InnodbSysForeignCols INNODB_SYS_FOREIGN_COLS = com.johnsong.android.spring.jooq.information_schema.tables.InnodbSysForeignCols.INNODB_SYS_FOREIGN_COLS;

    /**
     * The table <code>information_schema.INNODB_SYS_INDEXES</code>.
     */
    public static final InnodbSysIndexes INNODB_SYS_INDEXES = com.johnsong.android.spring.jooq.information_schema.tables.InnodbSysIndexes.INNODB_SYS_INDEXES;

    /**
     * The table <code>information_schema.INNODB_SYS_TABLES</code>.
     */
    public static final InnodbSysTables INNODB_SYS_TABLES = com.johnsong.android.spring.jooq.information_schema.tables.InnodbSysTables.INNODB_SYS_TABLES;

    /**
     * The table <code>information_schema.INNODB_SYS_TABLESPACES</code>.
     */
    public static final InnodbSysTablespaces INNODB_SYS_TABLESPACES = com.johnsong.android.spring.jooq.information_schema.tables.InnodbSysTablespaces.INNODB_SYS_TABLESPACES;

    /**
     * The table <code>information_schema.INNODB_SYS_TABLESTATS</code>.
     */
    public static final InnodbSysTablestats INNODB_SYS_TABLESTATS = com.johnsong.android.spring.jooq.information_schema.tables.InnodbSysTablestats.INNODB_SYS_TABLESTATS;

    /**
     * The table <code>information_schema.INNODB_TRX</code>.
     */
    public static final InnodbTrx INNODB_TRX = com.johnsong.android.spring.jooq.information_schema.tables.InnodbTrx.INNODB_TRX;

    /**
     * The table <code>information_schema.KEY_CACHES</code>.
     */
    public static final KeyCaches KEY_CACHES = com.johnsong.android.spring.jooq.information_schema.tables.KeyCaches.KEY_CACHES;

    /**
     * The table <code>information_schema.KEY_COLUMN_USAGE</code>.
     */
    public static final KeyColumnUsage KEY_COLUMN_USAGE = com.johnsong.android.spring.jooq.information_schema.tables.KeyColumnUsage.KEY_COLUMN_USAGE;

    /**
     * The table <code>information_schema.PARAMETERS</code>.
     */
    public static final Parameters PARAMETERS = com.johnsong.android.spring.jooq.information_schema.tables.Parameters.PARAMETERS;

    /**
     * The table <code>information_schema.PARTITIONS</code>.
     */
    public static final Partitions PARTITIONS = com.johnsong.android.spring.jooq.information_schema.tables.Partitions.PARTITIONS;

    /**
     * The table <code>information_schema.PLUGINS</code>.
     */
    public static final Plugins PLUGINS = com.johnsong.android.spring.jooq.information_schema.tables.Plugins.PLUGINS;

    /**
     * The table <code>information_schema.PROCESSLIST</code>.
     */
    public static final Processlist PROCESSLIST = com.johnsong.android.spring.jooq.information_schema.tables.Processlist.PROCESSLIST;

    /**
     * The table <code>information_schema.PROFILING</code>.
     */
    public static final Profiling PROFILING = com.johnsong.android.spring.jooq.information_schema.tables.Profiling.PROFILING;

    /**
     * The table <code>information_schema.REFERENTIAL_CONSTRAINTS</code>.
     */
    public static final ReferentialConstraints REFERENTIAL_CONSTRAINTS = com.johnsong.android.spring.jooq.information_schema.tables.ReferentialConstraints.REFERENTIAL_CONSTRAINTS;

    /**
     * The table <code>information_schema.ROUTINES</code>.
     */
    public static final Routines ROUTINES = com.johnsong.android.spring.jooq.information_schema.tables.Routines.ROUTINES;

    /**
     * The table <code>information_schema.SCHEMATA</code>.
     */
    public static final Schemata SCHEMATA = com.johnsong.android.spring.jooq.information_schema.tables.Schemata.SCHEMATA;

    /**
     * The table <code>information_schema.SCHEMA_PRIVILEGES</code>.
     */
    public static final SchemaPrivileges SCHEMA_PRIVILEGES = com.johnsong.android.spring.jooq.information_schema.tables.SchemaPrivileges.SCHEMA_PRIVILEGES;

    /**
     * The table <code>information_schema.SESSION_STATUS</code>.
     */
    public static final SessionStatus SESSION_STATUS = com.johnsong.android.spring.jooq.information_schema.tables.SessionStatus.SESSION_STATUS;

    /**
     * The table <code>information_schema.SESSION_VARIABLES</code>.
     */
    public static final SessionVariables SESSION_VARIABLES = com.johnsong.android.spring.jooq.information_schema.tables.SessionVariables.SESSION_VARIABLES;

    /**
     * The table <code>information_schema.STATISTICS</code>.
     */
    public static final Statistics STATISTICS = com.johnsong.android.spring.jooq.information_schema.tables.Statistics.STATISTICS;

    /**
     * The table <code>information_schema.TABLES</code>.
     */
    public static final com.johnsong.android.spring.jooq.information_schema.tables.Tables TABLES = com.johnsong.android.spring.jooq.information_schema.tables.Tables.TABLES;

    /**
     * The table <code>information_schema.TABLESPACES</code>.
     */
    public static final Tablespaces TABLESPACES = com.johnsong.android.spring.jooq.information_schema.tables.Tablespaces.TABLESPACES;

    /**
     * The table <code>information_schema.TABLE_CONSTRAINTS</code>.
     */
    public static final TableConstraints TABLE_CONSTRAINTS = com.johnsong.android.spring.jooq.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS;

    /**
     * The table <code>information_schema.TABLE_PRIVILEGES</code>.
     */
    public static final TablePrivileges TABLE_PRIVILEGES = com.johnsong.android.spring.jooq.information_schema.tables.TablePrivileges.TABLE_PRIVILEGES;

    /**
     * The table <code>information_schema.TABLE_STATISTICS</code>.
     */
    public static final TableStatistics TABLE_STATISTICS = com.johnsong.android.spring.jooq.information_schema.tables.TableStatistics.TABLE_STATISTICS;

    /**
     * The table <code>information_schema.TRIGGERS</code>.
     */
    public static final Triggers TRIGGERS = com.johnsong.android.spring.jooq.information_schema.tables.Triggers.TRIGGERS;

    /**
     * The table <code>information_schema.USER_PRIVILEGES</code>.
     */
    public static final UserPrivileges USER_PRIVILEGES = com.johnsong.android.spring.jooq.information_schema.tables.UserPrivileges.USER_PRIVILEGES;

    /**
     * The table <code>information_schema.USER_STATISTICS</code>.
     */
    public static final UserStatistics USER_STATISTICS = com.johnsong.android.spring.jooq.information_schema.tables.UserStatistics.USER_STATISTICS;

    /**
     * The table <code>information_schema.VIEWS</code>.
     */
    public static final Views VIEWS = com.johnsong.android.spring.jooq.information_schema.tables.Views.VIEWS;

    /**
     * The table <code>information_schema.XTRADB_INTERNAL_HASH_TABLES</code>.
     */
    public static final XtradbInternalHashTables XTRADB_INTERNAL_HASH_TABLES = com.johnsong.android.spring.jooq.information_schema.tables.XtradbInternalHashTables.XTRADB_INTERNAL_HASH_TABLES;

    /**
     * The table <code>information_schema.XTRADB_READ_VIEW</code>.
     */
    public static final XtradbReadView XTRADB_READ_VIEW = com.johnsong.android.spring.jooq.information_schema.tables.XtradbReadView.XTRADB_READ_VIEW;

    /**
     * The table <code>information_schema.XTRADB_RSEG</code>.
     */
    public static final XtradbRseg XTRADB_RSEG = com.johnsong.android.spring.jooq.information_schema.tables.XtradbRseg.XTRADB_RSEG;
}
