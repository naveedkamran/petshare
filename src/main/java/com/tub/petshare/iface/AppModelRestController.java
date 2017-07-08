package com.tub.petshare.iface;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.ui.ModelMap;

/**
 *
 * @author Naveed Kamran
 */
public interface AppModelRestController<ADomainObject, ADomainObjectForm> {

    //@RequestMapping(value = "/ADomainObjects/rest", method = RequestMethod.GET)
    public String listAllGet(String upk, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response);

}
