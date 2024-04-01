package com.gstuer.modelmerging.instance.pcm.processor.relation;

import tools.mdsd.mocore.framework.processor.RelationProcessor;
import com.gstuer.modelmerging.instance.pcm.surrogate.PcmSurrogate;
import com.gstuer.modelmerging.instance.pcm.surrogate.relation.ServiceEffectSpecificationRelation;

public class ServiceEffectSpecificationRelationProcessor extends RelationProcessor<PcmSurrogate, ServiceEffectSpecificationRelation> {
    public ServiceEffectSpecificationRelationProcessor(PcmSurrogate model) {
        super(model, ServiceEffectSpecificationRelation.class);
    }
}
