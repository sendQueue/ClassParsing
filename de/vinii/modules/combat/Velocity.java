/**
 * 
 */
package de.vinii.modules.combat;

import de.vinii.management.module.Mod;
import de.vinii.management.module.Module;

/**
 * @author sendQueue <Vinii>
 *
 *         Further info at Vinii.de, file created at 07.11.2020
 * 
 *         For example velocity should never be enabled
 * 
 */
@Mod
public class Velocity extends Module {

	@Override
	public void onEnable() {
		System.out.println(
				"Hello from the inside of Velocity.class's enabler! \n BUT, I'm only visible because of the default value for Mod.class's state!");
		System.out.println("");
		super.onEnable();
	}

	@Override
	public void onDisable() {
		// TODO Auto-generated method stub
		super.onDisable();
	}

}
