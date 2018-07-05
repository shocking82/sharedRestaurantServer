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
public class ApplicableRoles implements Serializable {

    private static final long serialVersionUID = 368960494;

    private final String grantee;
    private final String roleName;
    private final String isGrantable;

    public ApplicableRoles(ApplicableRoles value) {
        this.grantee = value.grantee;
        this.roleName = value.roleName;
        this.isGrantable = value.isGrantable;
    }

    public ApplicableRoles(
        String grantee,
        String roleName,
        String isGrantable
    ) {
        this.grantee = grantee;
        this.roleName = roleName;
        this.isGrantable = isGrantable;
    }

    public String getGrantee() {
        return this.grantee;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public String getIsGrantable() {
        return this.isGrantable;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ApplicableRoles (");

        sb.append(grantee);
        sb.append(", ").append(roleName);
        sb.append(", ").append(isGrantable);

        sb.append(")");
        return sb.toString();
    }
}