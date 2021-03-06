/* DefaultGlobalCommand.java

	Purpose:
		
	Description:
		
	History:
		Oct 23, 2012 , Created by dennis

Copyright (C) 2011 Potix Corporation. All Rights Reserved.
*/
package org.zkoss.bind.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marker annotation to identify a global command method. 
 * When a global command send to a view model, it will check GlobalCommand method first, if no GlobalCommand method was found, then it will check
 * DefaultGlobalCommand method.<br/>
 * A DefaultGlobalCommand method could also use with {@link BindingParam} and others to assign a binding argument as its parameter, 
 * and {@link Default} to assign a default value if the argument is null.
 * 
 * @see GlobalCommand
 * @see BindingParam
 * @see ExecutionParam
 * @see ExecutionArgParam
 * @see HeaderParam
 * @see CookieParam
 * @see QueryParam
 * @see ScopeParam
 * @see ContextParam
 * @see Default
 * @author dennischen
 * @since 6.5.1
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DefaultGlobalCommand {
}
