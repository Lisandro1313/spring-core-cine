package com.epam.spring.hometask.service;

import java.util.Collection;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.epam.spring.hometask.domain.DomainObject;

/**
 * @author Lisandro Etcheverry
 *
 * @param <T>
 *            DomainObject subclass
 */
public interface AbstractDomainObjectService<T extends DomainObject> {

    /**
     * Saving new object to storage or updating existing one
     * 
     * @param object
     *            Object to save
     * @return saved object with assigned id
     */
    public T save(@Nonnull T object);

    /**
     * Removing object from storage
     * 
     * @param object
     *            Object to remove
     */
    public void remove(@Nonnull T object);

    /**
     * Getting object by id from storage
     * 
     * @param id
     *            id of the object
     * @return Found object or <code>null</code>
     */
    @Nullable
    public T getById(@Nonnull Long id);

    /**
     * Getting all objects from storage
     * 
     * @return collection of objects
     */
    public @Nonnull Collection<T> getAll();
}
