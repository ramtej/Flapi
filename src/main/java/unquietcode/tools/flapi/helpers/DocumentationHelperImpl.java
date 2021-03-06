/*******************************************************************************
 Copyright 2013 Benjamin Fagin

     Licensed under the Apache License, Version 2.0 (the "License");
     you may not use this file except in compliance with the License.
     You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

     Unless required by applicable law or agreed to in writing, software
     distributed under the License is distributed on an "AS IS" BASIS,
     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     See the License for the specific language governing permissions and
     limitations under the License.


     Read the included LICENSE.TXT for more information.
 ******************************************************************************/

package unquietcode.tools.flapi.helpers;

import unquietcode.tools.flapi.builder.Documentation.DocumentationHelper;
import unquietcode.tools.flapi.outline.MethodOutline;

/**
 * @author Ben Fagin
 * @version 01-27-2013
 */
public class DocumentationHelperImpl implements DocumentationHelper {
	private final MethodOutline method;
	private final StringBuilder buffer = new StringBuilder();


	public DocumentationHelperImpl(MethodOutline method) {
		this.method = method;
	}

	@Override
	public void addContent(String content) {
		if (content == null) {
			throw new IllegalArgumentException("Content cannot be null!");
		}

		buffer.append(content);
	}

	@Override
	public void finish() {
		method.setDocumentation(buffer.toString());
	}
}
