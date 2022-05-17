package com.gstuer.modelmerging.framework.creation;

import com.gstuer.modelmerging.framework.surrogate.Model;
import com.gstuer.modelmerging.framework.surrogate.Replaceable;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Merger<M extends Model, T extends Replaceable> {
    private final M model;
    private final Set<Replaceable> implications;
    private final Class<T> processableType;

    protected Merger(M model, Class<T> processableType) {
        this.model = Objects.requireNonNull(model);
        this.implications = new HashSet<>();
        this.processableType = Objects.requireNonNull(processableType);
    }

    public abstract void merge(T discovery);

    public M getModel() {
        return model;
    }

    public Set<Replaceable> getImplications() {
        return Set.copyOf(implications);
    }

    public Class<T> getProcessableType() {
        return processableType;
    }
}
