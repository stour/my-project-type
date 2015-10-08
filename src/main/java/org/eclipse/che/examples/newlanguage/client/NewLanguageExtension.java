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
package org.eclipse.che.examples.newlanguage.client;

import org.eclipse.che.examples.newlanguage.shared.ProjectAttributes;
import org.eclipse.che.ide.api.action.ActionManager;
import org.eclipse.che.ide.api.action.DefaultActionGroup;
import org.eclipse.che.ide.api.constraints.Constraints;
import org.eclipse.che.ide.api.extension.Extension;
import org.eclipse.che.ide.api.icon.Icon;
import org.eclipse.che.ide.api.icon.IconRegistry;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import static org.eclipse.che.ide.api.action.IdeActions.GROUP_MAIN_MENU;

@Singleton
@Extension(title = "New Language Project Type Extension", version = "1.0.0")
public class NewLanguageExtension {

    private final static String NEW_LANGUAGE_GROUP_MAIN_MENU = "New Language Menu";

    @Inject
    public NewLanguageExtension(NewLanguageResources resources, IconRegistry iconRegistry,
                                ActionManager actionManager, NewLanguageAction action) {
        iconRegistry.registerIcon(new Icon(ProjectAttributes.NEW_LANGUAGE_PROJECT_TYPE_CATEGORY + ".samples.category.icon",
                                           resources.newLanguageIcon()));

        DefaultActionGroup mainMenu = (DefaultActionGroup)actionManager.getAction(GROUP_MAIN_MENU);

        DefaultActionGroup newlanguageMenu = new DefaultActionGroup(NEW_LANGUAGE_GROUP_MAIN_MENU, true, actionManager);
        actionManager.registerAction("newlanguage", newlanguageMenu);
        mainMenu.add(newlanguageMenu, Constraints.LAST);

        actionManager.registerAction("newlanguageActionID", action);
        newlanguageMenu.add(action);

    }
}
