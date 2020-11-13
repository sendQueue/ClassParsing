/**
 * 
 */
package de.vinii.modules.movement;

import de.vinii.management.module.Mod;
import de.vinii.management.module.Module;

/**
 * @author sendQueue <Vinii>
 *
 *         Further info at Vinii.de or github@vinii.de, file created at
 *         14.11.2020. Use is only authorized if given credit!
 * 
 */
@Mod(state = false)
public class Speed extends Module {

	/**
	 * 
	 */
	public Speed() {
		System.out.println(
				"Hi, I'm from Speed's constructor, sadly my enable message is not being processed, since my default state was set to false :( \n Go look at my annotation!");
		System.out.println("");
	}

	@Override
	public void onEnable() {
		System.out.println("Hello, if you read me you are trying to understand the concept. Good work!");
		super.onEnable();
	}

	@Override
	public void onDisable() {
		// TODO Auto-generated method stub
		super.onDisable();
	}

}
