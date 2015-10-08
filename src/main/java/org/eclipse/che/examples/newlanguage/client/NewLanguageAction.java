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

import org.eclipse.che.ide.api.action.Action;
import org.eclipse.che.ide.api.action.ActionEvent;

import com.google.inject.Inject;
import org.eclipse.che.ide.api.notification.NotificationManager;

public class NewLanguageAction extends Action {

    private NotificationManager notificationManager;

    @Inject
    public NewLanguageAction(NewLanguageResources resources, NotificationManager notificationManager) {
        super("New Language Action", "New Language Action Description", null, resources.newLanguageIcon());
        this.notificationManager = notificationManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        notificationManager.showInfo("New Language Action");
    }
}
