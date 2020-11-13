/**
 * 
 */
package de.vinii;

import de.vinii.management.module.Module;
import de.vinii.management.module.ModuleManager;

/**
 * @author sendQueue <Vinii>
 *
 *         Further info at Vinii.de, file created at 07.11.2020
 * 
 */
public class ParseClasses {

	/**
	 * Starts the class parsing.
	 */
	public static void main(String[] args) {
		ModuleManager.initialize();
		System.out.println("");
		System.out.println("Printing every parsed module, it's state and visibility:");
		System.out.println("");
		//as seen in output every class with an annotation inside modules got parsed
		for (Module module : ModuleManager.moduleList) {
			
			//Module name + some value saved as annotation attribute
			System.out.println(module.getName() + " " + module.isState() + " " + module.isShown());
			System.out.println("");
		}
		System.err.println("In order to understand how annotation attributes work, try changing Speed.class's visibility (shown) to false!");
	}

}
