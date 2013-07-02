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

package unquietcode.tools.flapi.graph.components;

/**
 * @author Ben Fagin
 * @version 07-11-2012
 */
public enum TransitionType {
	/*
		For backwards compatibility, it is important that the
		order of these does not change. Any new ones should be
		created at the end, with the old ones deprecated and
		left in place.
	 */

	Recursive,      // goes back to itself
	Lateral,        // goes to a version of itself minus a method
	Terminal,       // exits the graph
	Ascending,      // moves upwards by 1 step
}
