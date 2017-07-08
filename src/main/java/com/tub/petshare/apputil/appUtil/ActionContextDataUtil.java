package com.tub.petshare.apputil.appUtil;

import com.tub.petshare.apputil.ObjFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Naveed Kamran
 */
@Component
public class ActionContextDataUtil {

    static Logger logger = LogManager.getLogger(ActionContextDataUtil.class);
    ////////////////////////////////////////////////////////////////////////////
    @Autowired
    private ObjFactory objFactory;

//    public ActionContextData getActionContextDataForWeb()
//            throws ApplicationException, DALException {
//        return new ActionContextData(
//                objFactory.getUserAccountUtil().getCurrentUserAccountFromDb(),
//                objFactory.getUserAccountUtil().getCurrentUserAppDomainFromDb(),
//                Boolean.TRUE);
//    }
//
//    public ActionContextData getActionContextDataForRest(String upk)
//            throws ApplicationException, DALException {
//        UserAccount userAccount = objFactory.getUserAccountService().readByPrivateKey(upk);
//
//        return new ActionContextData(
//                userAccount, objFactory.getUserAccountUtil().getUserAppDomain(userAccount),
//                Boolean.TRUE);
//    }
//
//    public ActionContextData getActionContextDataByUsername(String username)
//            throws ApplicationException, DALException {
//        UserAccount userAccount = objFactory.getUserAccountService().readByUsername(username);
//
//        return new ActionContextData(
//                userAccount, objFactory.getUserAccountUtil().getUserAppDomain(userAccount),
//                Boolean.TRUE);
//    }
//
//    public ActionContextData getActionContextData(UserAccount userAccount)
//            throws ApplicationException, DALException {
//        return new ActionContextData(
//                userAccount, objFactory.getUserAccountUtil().getUserAppDomain(userAccount),
//                Boolean.TRUE);
//    }
//
//    public ActionContextData getActionContextDataForSystem()
//            throws ApplicationException, DALException {
//        return new ActionContextData(objFactory.getUserAccountService().readById(
//                Constants.UserAccount.USER_ACCOUNT_ID_SYSTEM), null, Boolean.TRUE);
//    }
}
