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
package org.eclipse.che.examples.newlanguage.server;

import org.eclipse.che.api.project.server.type.ProjectType;
import org.eclipse.che.examples.newlanguage.shared.ProjectAttributes;
import org.eclipse.che.ide.Constants;

import com.google.inject.Singleton;

@Singleton
public class SampleProjectType extends ProjectType {
 
    public SampleProjectType() {
        super(ProjectAttributes.NEW_LANGUAGE_PROJECT_TYPE_ID, ProjectAttributes.NEW_LANGUAGE_PROJECT_TYPE_NAME, true, false);
        addConstantDefinition(Constants.LANGUAGE, "language", ProjectAttributes.PROGRAMMING_LANGUAGE);
    }
}
