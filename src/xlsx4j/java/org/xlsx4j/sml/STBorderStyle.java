/*
 *  Copyright 2010, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */


package org.xlsx4j.sml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_BorderStyle.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_BorderStyle">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="thin"/>
 *     &lt;enumeration value="medium"/>
 *     &lt;enumeration value="dashed"/>
 *     &lt;enumeration value="dotted"/>
 *     &lt;enumeration value="thick"/>
 *     &lt;enumeration value="double"/>
 *     &lt;enumeration value="hair"/>
 *     &lt;enumeration value="mediumDashed"/>
 *     &lt;enumeration value="dashDot"/>
 *     &lt;enumeration value="mediumDashDot"/>
 *     &lt;enumeration value="dashDotDot"/>
 *     &lt;enumeration value="mediumDashDotDot"/>
 *     &lt;enumeration value="slantDashDot"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ST_BorderStyle")
@XmlEnum
public enum STBorderStyle {


    /**
     * None
     * 
     */
    @XmlEnumValue("none")
    NONE("none"),

    /**
     * Thin Border
     * 
     */
    @XmlEnumValue("thin")
    THIN("thin"),

    /**
     * Medium Border
     * 
     */
    @XmlEnumValue("medium")
    MEDIUM("medium"),

    /**
     * Dashed
     * 
     */
    @XmlEnumValue("dashed")
    DASHED("dashed"),

    /**
     * Dotted
     * 
     */
    @XmlEnumValue("dotted")
    DOTTED("dotted"),

    /**
     * Thick Line Border
     * 
     */
    @XmlEnumValue("thick")
    THICK("thick"),

    /**
     * Double Line
     * 
     */
    @XmlEnumValue("double")
    DOUBLE("double"),

    /**
     * Hairline Border
     * 
     */
    @XmlEnumValue("hair")
    HAIR("hair"),

    /**
     * Medium Dashed
     * 
     */
    @XmlEnumValue("mediumDashed")
    MEDIUM_DASHED("mediumDashed"),

    /**
     * Dash Dot
     * 
     */
    @XmlEnumValue("dashDot")
    DASH_DOT("dashDot"),

    /**
     * Medium Dash Dot
     * 
     */
    @XmlEnumValue("mediumDashDot")
    MEDIUM_DASH_DOT("mediumDashDot"),

    /**
     * Dash Dot Dot
     * 
     */
    @XmlEnumValue("dashDotDot")
    DASH_DOT_DOT("dashDotDot"),

    /**
     * Medium Dash Dot Dot
     * 
     */
    @XmlEnumValue("mediumDashDotDot")
    MEDIUM_DASH_DOT_DOT("mediumDashDotDot"),

    /**
     * Slant Dash Dot
     * 
     */
    @XmlEnumValue("slantDashDot")
    SLANT_DASH_DOT("slantDashDot");
    private final String value;

    STBorderStyle(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STBorderStyle fromValue(String v) {
        for (STBorderStyle c: STBorderStyle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
