package com.gstuer.modelmerging.instance.pcm.surrogate.relation;

import tools.mdsd.mocore.framework.surrogate.RelationTest;
import com.gstuer.modelmerging.instance.pcm.surrogate.element.Component;
import com.gstuer.modelmerging.instance.pcm.surrogate.element.Interface;

public class InterfaceProvisionRelationTest extends RelationTest<InterfaceProvisionRelation, Component, Interface> {
    @Override
    protected InterfaceProvisionRelation createRelation(Component source, Interface destination,
            boolean isPlaceholder) {
        return new InterfaceProvisionRelation(source, destination, isPlaceholder);
    }

    @Override
    protected Component getUniqueSourceEntity() {
        return Component.getUniquePlaceholder();
    }

    @Override
    protected Interface getUniqueDestinationEntity() {
        return Interface.getUniquePlaceholder();
    }
}
