package com.uwyn.rife2.gradle;

import java.io.Serializable;

public class TemplateType implements Serializable {
    public static TemplateType HTML = new TemplateType("html");
    public static TemplateType JSON = new TemplateType("json");
    public static TemplateType SVG = new TemplateType("svg");
    public static TemplateType XML = new TemplateType("xml");
    public static TemplateType TXT = new TemplateType("txt");
    public static TemplateType SQL = new TemplateType("sql");

    private final String identifier_;

    public TemplateType(String identifier) {
        identifier_ = identifier;
    }

    public String identifier() {
        return identifier_;
    }
}