/*
 * This file is generated by jOOQ.
*/
package com.johnsong.android.spring.jooq.information_schema.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;

import org.jooq.types.ULong;


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
public class Parameters implements Serializable {

    private static final long serialVersionUID = 1614675878;

    private final String  specificCatalog;
    private final String  specificSchema;
    private final String  specificName;
    private final Integer ordinalPosition;
    private final String  parameterMode;
    private final String  parameterName;
    private final String  dataType;
    private final Integer characterMaximumLength;
    private final Integer characterOctetLength;
    private final Integer numericPrecision;
    private final Integer numericScale;
    private final ULong   datetimePrecision;
    private final String  characterSetName;
    private final String  collationName;
    private final String  dtdIdentifier;
    private final String  routineType;

    public Parameters(Parameters value) {
        this.specificCatalog = value.specificCatalog;
        this.specificSchema = value.specificSchema;
        this.specificName = value.specificName;
        this.ordinalPosition = value.ordinalPosition;
        this.parameterMode = value.parameterMode;
        this.parameterName = value.parameterName;
        this.dataType = value.dataType;
        this.characterMaximumLength = value.characterMaximumLength;
        this.characterOctetLength = value.characterOctetLength;
        this.numericPrecision = value.numericPrecision;
        this.numericScale = value.numericScale;
        this.datetimePrecision = value.datetimePrecision;
        this.characterSetName = value.characterSetName;
        this.collationName = value.collationName;
        this.dtdIdentifier = value.dtdIdentifier;
        this.routineType = value.routineType;
    }

    public Parameters(
        String  specificCatalog,
        String  specificSchema,
        String  specificName,
        Integer ordinalPosition,
        String  parameterMode,
        String  parameterName,
        String  dataType,
        Integer characterMaximumLength,
        Integer characterOctetLength,
        Integer numericPrecision,
        Integer numericScale,
        ULong   datetimePrecision,
        String  characterSetName,
        String  collationName,
        String  dtdIdentifier,
        String  routineType
    ) {
        this.specificCatalog = specificCatalog;
        this.specificSchema = specificSchema;
        this.specificName = specificName;
        this.ordinalPosition = ordinalPosition;
        this.parameterMode = parameterMode;
        this.parameterName = parameterName;
        this.dataType = dataType;
        this.characterMaximumLength = characterMaximumLength;
        this.characterOctetLength = characterOctetLength;
        this.numericPrecision = numericPrecision;
        this.numericScale = numericScale;
        this.datetimePrecision = datetimePrecision;
        this.characterSetName = characterSetName;
        this.collationName = collationName;
        this.dtdIdentifier = dtdIdentifier;
        this.routineType = routineType;
    }

    public String getSpecificCatalog() {
        return this.specificCatalog;
    }

    public String getSpecificSchema() {
        return this.specificSchema;
    }

    public String getSpecificName() {
        return this.specificName;
    }

    public Integer getOrdinalPosition() {
        return this.ordinalPosition;
    }

    public String getParameterMode() {
        return this.parameterMode;
    }

    public String getParameterName() {
        return this.parameterName;
    }

    public String getDataType() {
        return this.dataType;
    }

    public Integer getCharacterMaximumLength() {
        return this.characterMaximumLength;
    }

    public Integer getCharacterOctetLength() {
        return this.characterOctetLength;
    }

    public Integer getNumericPrecision() {
        return this.numericPrecision;
    }

    public Integer getNumericScale() {
        return this.numericScale;
    }

    public ULong getDatetimePrecision() {
        return this.datetimePrecision;
    }

    public String getCharacterSetName() {
        return this.characterSetName;
    }

    public String getCollationName() {
        return this.collationName;
    }

    public String getDtdIdentifier() {
        return this.dtdIdentifier;
    }

    public String getRoutineType() {
        return this.routineType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Parameters (");

        sb.append(specificCatalog);
        sb.append(", ").append(specificSchema);
        sb.append(", ").append(specificName);
        sb.append(", ").append(ordinalPosition);
        sb.append(", ").append(parameterMode);
        sb.append(", ").append(parameterName);
        sb.append(", ").append(dataType);
        sb.append(", ").append(characterMaximumLength);
        sb.append(", ").append(characterOctetLength);
        sb.append(", ").append(numericPrecision);
        sb.append(", ").append(numericScale);
        sb.append(", ").append(datetimePrecision);
        sb.append(", ").append(characterSetName);
        sb.append(", ").append(collationName);
        sb.append(", ").append(dtdIdentifier);
        sb.append(", ").append(routineType);

        sb.append(")");
        return sb.toString();
    }
}
