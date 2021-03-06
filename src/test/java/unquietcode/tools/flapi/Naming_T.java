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

import org.junit.Test;
import unquietcode.tools.flapi.generator.GeneratorContext;
import unquietcode.tools.flapi.graph.components.LateralTransition;
import unquietcode.tools.flapi.graph.components.StateClass;
import unquietcode.tools.flapi.graph.components.Transition;

import static org.junit.Assert.assertFalse;

public class Naming_T extends AbstractCompiledTest {

	@Test
	public void test() {
		Descriptor descriptor = Flapi.builder()
			.setPackage("some.thing")
			.setDescriptorName("Something")
			.addMethod("method(int a, int b)").last()
			.addMethod("method(int a)").last()
		.build();

		descriptor.writeToFolder(getTemporaryFolder());
		testCompile();
	}
}

