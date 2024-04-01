package com.gstuer.modelmerging.evaluation.discovery;

import java.util.Set;

import tools.mdsd.mocore.framework.discovery.Discoverer;
import tools.mdsd.mocore.framework.surrogate.Replaceable;

public class PcmDiscoverer<T extends Replaceable> extends Discoverer<T> {
    public PcmDiscoverer(Set<T> discoveries, Class<T> discoveryType) {
        super(discoveries, discoveryType);
    }
}
