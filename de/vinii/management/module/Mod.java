/**
 * 
 */
package de.vinii.management.module;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author sendQueue <Vinii>
 *
 *         Further info at Vinii.de, file created at 07.11.2020.
 * 
 * 
 * 
 *         This annotation is used to pre-specify parameters such as keyBind,
 *         visibility or ignoreModule and to make sure one class shall be parsed
 * 
 *         Explanation to meta-annotations ( @Target & @Retention ) and why it's
 *         needed: https://vinii.de/github/ClassParsing/meta-annotations.png
 * 
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface Mod {

	// by default every module should be enabled and shown
	boolean shown() default true;

	boolean state() default true;
}
