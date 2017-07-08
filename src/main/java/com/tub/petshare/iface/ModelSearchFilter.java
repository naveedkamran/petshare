package com.tub.petshare.iface;

import java.util.Map;

/**
 * interface for Search Filter
 *
 * @author Naveed
 * @param <ADomainObject>
 * @param <ADomainObjectForm>
 */
public interface ModelSearchFilter<ADomainObject, ADomainObjectForm> {

    public Map<String, Object> getFilter(ADomainObject domainObject, ADomainObjectForm domainObjectForm);
}
