/**
 * Copyright : http://www.sandpay.com.cn/ , 2003-2014
 * Project : abacus-util-data-sqlbuild
 * $Id$
 * $Revision$
 * Last Changed by sun.mt at 2015年5月8日 下午1:01:12
 * $URL$
 * 
 * Change Log
 * Author      Change Date    Comments
 *-------------------------------------------------------------
 * sun.mt         2015年5月8日        Initailized
 */
package com.sand.abacus.util.data.sqlbuild.impl;

import java.util.List;

import com.sand.abacus.util.data.sqlbuild.FilterBuildResult;

/**
 *
 * @ClassName ：FilterBuildResultImpl
 * @Description : 
 * @author : sun.mt
 * @Date : 2015年5月8日 下午1:01:12
 * @version 1.0.0
 *
 */
public class FilterBuildResultImpl implements FilterBuildResult {
	
	private final StringBuilder builder;
	
	private final List<Object> params;

	FilterBuildResultImpl(StringBuilder builder, List<Object> params) {
		super();
		this.builder = builder;
		this.params = params;
	}

	/* (non-Javadoc)
	 * @see com.sand.abacus.util.data.sqlbuild.FilterBuilderResult#getSql()
	 */
	@Override
	public String getSql() {
		return builder.toString();
	}

	/* (non-Javadoc)
	 * @see com.sand.abacus.util.data.sqlbuild.FilterBuilderResult#getParameters()
	 */
	@Override
	public List<Object> getParameters() {
		return params;
	}

}
