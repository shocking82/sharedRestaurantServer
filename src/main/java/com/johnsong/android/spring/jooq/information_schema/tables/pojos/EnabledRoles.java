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
public class EnabledRoles implements Serializable {

    private static final long serialVersionUID = 1236867710;

    private final String roleName;

    public EnabledRoles(EnabledRoles value) {
        this.roleName = value.roleName;
    }

    public EnabledRoles(
        String roleName
    ) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return this.roleName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EnabledRoles (");

        sb.append(roleName);

        sb.append(")");
        return sb.toString();
    }
}