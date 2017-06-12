/**
 * Copyright (c) 2017, 791650277@qq.com(Mr.kiwi) All Rights Reserved.
 */
package com.lami.mybatis.plugins.plugins;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.TopLevelClass;

import java.util.List;


public class CommentPlugin extends PluginAdapter {

    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public boolean modelFieldGenerated(Field field, TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn, IntrospectedTable introspectedTable, ModelClassType modelClassType) {

        String sb = "/**" + "\n\t   * " + introspectedColumn.getRemarks() + "\n\t   * default = "
            + introspectedColumn.getDefaultValue() + "\n\t   * length = "
            + introspectedColumn.getLength() + "\n\t   */";
        field.addJavaDocLine(sb);
        return super.modelFieldGenerated(field, topLevelClass, introspectedColumn, introspectedTable, modelClassType);
    }
}
