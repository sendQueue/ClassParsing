/**
 * 
 */
package de.vinii.management.module;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.reflections.Reflections;
import org.reflections.scanners.Scanner;

/**
 * @author sendQueue <Vinii>
 *
 *         Further info at Vinii.de, file created at 07.11.2020
 * 
 */
public class ModuleManager {
	public static List<Module> moduleList = new ArrayList<Module>();

	/**
	 * Initializes the module manager by parsing every class in de.vinii.module and
	 * checking for present annotation
	 * 
	 */
	public static void initialize() {
		try {
			final Reflections reflections = new Reflections("de.vinii.modules", new Scanner[0]);
			/**
			 * Gets all sub types in hierarchy of the type
			 * 
			 * Why used Set?
			 * 
			 * Membership. Google Set vs List
			 * 
			 */
			final Set<Class<? extends Module>> classes = (Set<Class<? extends Module>>) reflections
					.getSubTypesOf((Class) Module.class);

			for (final Class<? extends Module> moduleClass : classes) {
				// might throw InstantiationException & IllegalAccessException
				final Module module = (Module) moduleClass.newInstance();
				/**
				 * Checks if Mod annotation is present, otherwise skips.
				 */
				if (!moduleClass.isAnnotationPresent(Mod.class))
					continue;
				final Mod moduleAnnotation = moduleClass.getAnnotation(Mod.class);
				// Gets the subpackages name
				final String category = moduleClass.getPackage().getName().split("modules.")[1];

				module.setName(moduleClass.getSimpleName());
				// since conventions say enums are uppercase and packages not
				module.setCategory(Category.valueOf(category.toUpperCase()));

				// process annotations attributes
				if (moduleAnnotation.state())
					module.onEnable();

				moduleList.add(module);
			}
		} catch (Exception e) {
			e.fillInStackTrace();
		}

	}

}
