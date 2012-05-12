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

import unquietcode.tools.flapi.builder.DescriptorBuilder_enableCondensedClassNames_setDescriptorName_setPackage_setReturnType_setStartingMethodName;
import unquietcode.tools.flapi.builder.DescriptorGenerator;

/**
 * @author Ben Fagin
 * @version 05-11-2012
 *
 * From here you can reach the world.
 */
public class Flapi {

	/**
	 * Shortcut to build a new descriptor.
	 *
	 * @return a new {@link unquietcode.tools.flapi.builder.DescriptorBuilder}
	 */
	public static DescriptorBuilder_enableCondensedClassNames_setDescriptorName_setPackage_setReturnType_setStartingMethodName<Descriptor> builder() {
		return DescriptorGenerator.create(new DescriptorHelperImpl());

	}
}
