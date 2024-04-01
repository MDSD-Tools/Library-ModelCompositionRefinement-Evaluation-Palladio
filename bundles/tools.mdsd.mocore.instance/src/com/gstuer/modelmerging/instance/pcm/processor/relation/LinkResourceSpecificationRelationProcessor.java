package com.gstuer.modelmerging.instance.pcm.processor.relation;

import tools.mdsd.mocore.framework.processor.RelationProcessor;
import com.gstuer.modelmerging.instance.pcm.surrogate.PcmSurrogate;
import com.gstuer.modelmerging.instance.pcm.surrogate.relation.LinkResourceSpecificationRelation;

public class LinkResourceSpecificationRelationProcessor
        extends RelationProcessor<PcmSurrogate, LinkResourceSpecificationRelation> {
    public LinkResourceSpecificationRelationProcessor(PcmSurrogate model) {
        super(model, LinkResourceSpecificationRelation.class);
    }
}
