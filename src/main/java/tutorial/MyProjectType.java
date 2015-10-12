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
package tutorial;

import org.eclipse.che.api.project.server.type.ProjectType;
import org.eclipse.che.ide.Constants;

import com.google.inject.Singleton;

@Singleton
public class MyProjectType extends ProjectType {

    public final static String MY_PROJECT_TYPE_ID = "myprojecttype";
    public final static String MY_PROJECT_TYPE_NAME = "My Project Type Name";
    public final static String MY_PROJECT_TYPE_CATEGORY = "My Project Type Category";
    public final static String PROGRAMMING_LANGUAGE = "java";

    public MyProjectType() {
        super(MY_PROJECT_TYPE_ID, MY_PROJECT_TYPE_NAME, true, false);
        addConstantDefinition(Constants.LANGUAGE, "language", PROGRAMMING_LANGUAGE);
    }
}
