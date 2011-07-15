/*******************************************************************************
 * Copyright (c) 2011 Igor Fedorenko
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *      Igor Fedorenko - initial API and implementation
 *******************************************************************************/

package com.ifedorenko.p2browser.views;

abstract class AbstractPatternMatcher
    implements InstallableUnitMatcher
{

    private final String pattern;

    protected AbstractPatternMatcher( String pattern )
    {
        this.pattern = pattern;

    }

    protected boolean match( String string )
    {
        return string != null && string.contains( pattern );
    }
}