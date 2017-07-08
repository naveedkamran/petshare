package com.tub.petshare.apputil;

import com.tub.petshare.apputil.appUtil.ActionContextDataUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * This implements Facade pattern. (Provide a unified interface to a set of
 * interfaces in a subsystem. Facade defines a higher-level interface that makes
 * the subsystem easier to use. The Facade presents a new interface for the
 * client of the existing system to use)
 *
 * @author Naveed Kamran
 */
@Component
public class ObjFactory {

    @Autowired
    private ActionContextDataUtil actionContextDataUtil;
    @Autowired
    private LocaleUtil localeUtil;
    ////////////////////////////////////////////////////////////////////////////

    /**
     * @return the actionContextDataUtil
     */
    public ActionContextDataUtil getActionContextDataUtil() {
        return actionContextDataUtil;
    }

    /**
     * @param actionContextDataUtil the actionContextDataUtil to set
     */
    public void setActionContextDataUtil(ActionContextDataUtil actionContextDataUtil) {
        this.actionContextDataUtil = actionContextDataUtil;
    }

    /**
     * @return the localeUtil
     */
    public LocaleUtil getLocaleUtil() {
        return localeUtil;
    }

    /**
     * @param localeUtil the localeUtil to set
     */
    public void setLocaleUtil(LocaleUtil localeUtil) {
        this.localeUtil = localeUtil;
    }

}
