/*******************************************************************************
 Copyright 2012 Benjamin Fagin

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

package unquietcode.tools.flapi;

import unquietcode.tools.flapi.support.BuilderImplementation;
import unquietcode.tools.flapi.support.ExpectedInvocationsException;
import unquietcode.tools.flapi.support.ObjectWrapper;

import java.io.File;

/**
 * @author Ben Fagin
 * @version 04-28-2012
 *
 * Y'arr, here be project constants!
 */
public final class Constants {
	private Constants() { }

	public static final String PROJECT_URL = "https://github.com/UnquietCode/Flapi";
	public static final String PROJECT_VERSION = "0.4";     // TODO I hate this. Can we get it from the build?
	public static final String RETURN_TYPE_NAME = "_ReturnType";
	public static final String HELPER_VALUE_NAME = "_helper";

	public static final String[] REQUIRED_FILES = {
		BuilderImplementation.class.getSimpleName(),
		ExpectedInvocationsException.class.getSimpleName(),
		ObjectWrapper.class.getSimpleName()
	};

	public static String getSupportPath(File folder) {
		String path = folder.getAbsolutePath();
		path += File.separator;
		path += "unquietcode"+File.separator+"tools"+File.separator+"flapi"+File.separator+"support"+File.separator;

		return path;
	}
}
