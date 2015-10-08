/*******************************************************************************
 * Copyright (c) 2012-2015 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package org.eclipse.che.examples.newlanguage.server.inject;

import org.eclipse.che.api.project.server.type.ProjectType;
import org.eclipse.che.examples.newlanguage.server.NewLanguageProjectType;
import org.eclipse.che.inject.DynaModule;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;

@DynaModule
public class NewLanguageModule extends AbstractModule {
    /** {@inheritDoc} */
    @Override
    protected void configure() {
        Multibinder<ProjectType> projectTypeMultibinder = Multibinder.newSetBinder(binder(), ProjectType.class);
        projectTypeMultibinder.addBinding().to(NewLanguageProjectType.class);
    }
}