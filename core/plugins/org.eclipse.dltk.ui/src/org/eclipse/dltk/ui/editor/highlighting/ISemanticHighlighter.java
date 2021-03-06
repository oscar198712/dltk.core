/*******************************************************************************
 * Copyright (c) 2011 xored software, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.ui.editor.highlighting;

import org.eclipse.dltk.compiler.env.IModuleSource;

public interface ISemanticHighlighter {

	/**
	 * Returns highlighting keys used by this highlighter.
	 * 
	 * @return
	 */
	String[] getHighlightingKeys();

	/**
	 * Performs the highlighting of the specified <code>code</code> and reports
	 * positions to be highlighted to the specified <code>requestor</code>.
	 * 
	 * @param code
	 * @param requestor
	 * @throws AbortSemanticHighlightingException
	 */
	void process(IModuleSource code, ISemanticHighlightingRequestor requestor);

}
