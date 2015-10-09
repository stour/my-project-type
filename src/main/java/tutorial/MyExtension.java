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
@Extension(title = "My Project Type Extension", version = "1.0.0")
public class MyExtension {

    private final static String MY_PROJECT_TYPE_GROUP_MAIN_MENU = "My Project Type Menu";

    @Inject
    public MyExtension(MyResources resources, IconRegistry iconRegistry,
                       ActionManager actionManager, MyAction action) {
        iconRegistry.registerIcon(new Icon(ProjectAttributes.MY_PROJECT_TYPE_CATEGORY + ".samples.category.icon",
                                           resources.myProjectTypeIcon()));

        DefaultActionGroup mainMenu = (DefaultActionGroup)actionManager.getAction(GROUP_MAIN_MENU);

        DefaultActionGroup myProjectTypeMenu = new DefaultActionGroup(MY_PROJECT_TYPE_GROUP_MAIN_MENU, true, actionManager);
        actionManager.registerAction("myprojecttype", myProjectTypeMenu);
        mainMenu.add(myProjectTypeMenu, Constraints.LAST);

        actionManager.registerAction("myprojecttypeActionID", action);
        myProjectTypeMenu.add(action);

    }
}
