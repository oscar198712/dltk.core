/*******************************************************************************
 * Copyright (c) 2008 xored software, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.validators.core;

import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Implementation of the {@link IValidatorOutput} doing nothing.
 */
public class NullValidatorOutput extends OutputStream implements
		IValidatorOutput {

	public OutputStream getStream() {
		return this;
	}

	public boolean isEnabled() {
		return false;
	}

	public boolean checkError() {
		return false;
	}

	public void println(String x) {
		// empty
	}

	public void write(int b) {
		// empty
	}

	public void write(byte[] b) {
		// empty
	}

	public void write(byte[] b, int off, int len) {
		// empty
	}

	public void close() {
		// empty
	}

	private Map attributes = null;

	public Object getAttribute(String name) {
		if (attributes != null) {
			return attributes.get(name);
		} else {
			return null;
		}
	}

	public void setAttribute(String name, Object value) {
		if (attributes == null) {
			attributes = new HashMap();
		}
		attributes.put(name, value);
	}

}
