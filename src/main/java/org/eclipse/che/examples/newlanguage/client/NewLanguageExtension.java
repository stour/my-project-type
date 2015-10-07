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
import org.eclipse.che.ide.api.extension.Extension;
import org.eclipse.che.ide.api.icon.Icon;
import org.eclipse.che.ide.api.icon.IconRegistry;
import org.vectomatic.dom.svg.ui.SVGResource;

import com.google.gwt.resources.client.ClientBundle;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
@Extension(title = "New Language Project Type Extension", version = "1.0.0")
public class NewLanguageExtension {
    @Inject
    public NewLanguageExtension(ParserResource parserResource, IconRegistry iconRegistry) {
        iconRegistry.registerIcon(new Icon(ProjectAttributes.NEW_LANGUAGE_PROJECT_TYPE_CATEGORY + ".samples.category.icon",
                                           parserResource.sampleProjectTypeCategoryIcon()));
    }
 
    public interface ParserResource extends ClientBundle {
        @Source("org/eclipse/che/examples/newlanguage/newlanguage_icon.svg")
        SVGResource sampleProjectTypeCategoryIcon();
    }
}
