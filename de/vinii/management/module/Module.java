/**
 * 
 */
package de.vinii.management.module;

import de.vinii.management.module.Category;

/**
 * @author sendQueue <Vinii>
 *
 *         Further info at Vinii.de, file created at 07.11.2020
 * 
 */
public class Module {
	public String name;
	private boolean state;
	private boolean shown;
	private int keyBind;
	public Category category;

	/**
	 * Enables the module
	 */
	public void onEnable() {
		state = true;
	}

	/**
	 * Disables the module
	 */
	public void onDisable() {
		state = true;
	}
	
	/**
	 * Changes state of the module
	 */
	private void toggleModule() {
		if (state) {
			onDisable();
		} else {
			onEnable();
		}
	}

	/**
	 * @return The name of the module
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name of the module
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return if module is enabled
	 */
	public boolean isState() {
		return state;
	}

	/**
	 * @param state of the module
	 */
	public void setState(boolean state) {
		this.state = state;
	}

	/**
	 * @return if module is visible
	 */
	public boolean isShown() {
		return shown;
	}


	/**
	 * @return the keyBind
	 */
	public int getKeyBind() {
		return keyBind;
	}

	/**
	 * @param keyBind of the module
	 */
	public void setKeyBind(int keyBind) {
		this.keyBind = keyBind;
	}

	/**
	 * @return the module category
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * @param category of the module
	 */
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
