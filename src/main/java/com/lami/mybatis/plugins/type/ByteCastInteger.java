/**
 * Copyright (c) 2017, 791650277@qq.com(Mr.kiwi) All Rights Reserved.
 */
package com.lami.mybatis.plugins.type;

import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

import java.sql.Types;

public class ByteCastInteger extends JavaTypeResolverDefaultImpl {

    public ByteCastInteger() {

        super.typeMap.put(Types.TINYINT, new JdbcTypeInformation("INTEGER", //$NON-NLS-1$
            new FullyQualifiedJavaType(Integer.class.getName())));
    }
}
