package com.sudipcseseu.customscopewithcomponentdependency.scope;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import javax.inject.Scope;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

// Custom scope, to create this we need to add those 3 annotations
@Scope
@Documented
@Retention(RUNTIME)
public @interface ActivityScope {
}
