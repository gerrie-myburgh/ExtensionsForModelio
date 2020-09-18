/**
 * Java Class : AddReferenceDiagramExplorerButton.java
 *
 * Description :
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing,
 *    software distributed under the License is distributed on an
 *    "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *    KIND, either express or implied.  See the License for the
 *    specific language governing permissions and limitations
 *    under the License.
 *
 * @category   Command explorer
 * @package    com.modeliosoft.modelio.sysml.gui.explorer
 * @author     Modelio
 * @license    http://www.apache.org/licenses/LICENSE-2.0
 * @version    2.0.08
 **/
package org.modelio.module.sysml.commands.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.module.sysml.filters.ConstraintBlockFilter;
import org.modelio.module.sysml.i18n.I18nMessageService;
import org.modelio.module.sysml.impl.SysMLModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * This command handles the creation of SysML references in the model explorer
 * @author ebrosse
 */
@objid ("00ca4523-1bf6-4b54-80d3-1bc2efe7d7c2")
public class ReferenceExplorerCommand extends DefaultModuleCommandHandler {
    @objid ("68368edb-75e8-4197-b233-7231212fba71")
    @Override
    public void actionPerformed(List<MObject> selectedElements, IModule module) {
        IModelingSession session = SysMLModule.getInstance().getModuleContext().getModelingSession();
        try( ITransaction transaction = session.createTransaction (I18nMessageService.getString ("Info.Session.Create", "Reference"))){
        
            for (MObject element : selectedElements) {
                if (element instanceof NameSpace){
                    Attribute part = session.getModel().createAttribute();
                    part.setOwner((Classifier)element);
                    part.setName("ref" + ((Classifier)element).getOwnedAttribute().size());
                }
            }
        
            transaction.commit ();
        }
    }

    @objid ("6825dd12-25ab-48ad-b1ce-b3181fcd6fac")
    @Override
    public boolean accept(List<MObject> selectedElements, IModule module) {
        if ((selectedElements == null)
                || (selectedElements.size() == 0)
                || ConstraintBlockFilter.isAConstraintBlock(selectedElements.get(0))){
            return false;
        }
        return super.accept(selectedElements, module);
    }

    @objid ("e7e1d2c6-4fdf-48e9-9ae4-acd897bd96e3")
    @Override
    public boolean isActiveFor(List<MObject> selectedElements, IModule module) {
        MObject selectedElt = selectedElements.get(0);
        if ((selectedElt instanceof Profile)  || (selectedElt instanceof IModule))
            return false;
        return selectedElt.getStatus().isModifiable();
    }

}
