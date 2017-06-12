/**
 * Copyright (c) 2016, 791650277@qq.com(Mr.kiwi) All Rights Reserved.
 */
package com.lami.mybatis.plugins.ext;

import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

import java.sql.Types;


@Deprecated
public class JavaTypeResolveExt extends JavaTypeResolverDefaultImpl {

    public JavaTypeResolveExt() {

        super();
        super.typeMap.put(Types.BIT, new JdbcTypeInformation("INTEGER", //$NON-NLS-1$
            new FullyQualifiedJavaType(Integer.class.getName())));
        super.typeMap.put(Types.TINYINT, new JdbcTypeInformation("INTEGER", //$NON-NLS-1$
            new FullyQualifiedJavaType(Integer.class.getName())));
    }
}
