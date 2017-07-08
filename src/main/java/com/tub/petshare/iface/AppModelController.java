package com.tub.petshare.iface;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Naveed Kamran
 */
public interface AppModelController<ADomainObject, ADomainObjectForm> {

    public String paginatedListGet(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response);

    public String paginatedListPost(ADomainObjectForm aDomainObjectForm,
            BindingResult results, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response);
    ////////////////////////////////////////////////////////////////////////////

    public String listAllGet(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response);

    public String listAllPost(ADomainObjectForm aDomainObjectForm,
            BindingResult results, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response);

    public String listAllAjaxGet(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response);

    public List<ADomainObject> listAllAjaxPost(ADomainObjectForm aDomainObjectForm,
            BindingResult results, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response);
    ////////////////////////////////////////////////////////////////////////////

    public String searchGet(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response);

    public String searchPost(ADomainObjectForm aDomainObjectForm,
            BindingResult results, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response);

    public String searchAjaxGet(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response);

    public String searchAjaxPost(ADomainObjectForm aDomainObjectForm,
            BindingResult results, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response);
    ////////////////////////////////////////////////////////////////////////////

    public String searchPostCsv(ADomainObjectForm aDomainObjectForm,
            BindingResult results, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response);

    public String searchPostXls(ADomainObjectForm aDomainObjectForm,
            BindingResult results, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response);

    public String searchPostPdf(ADomainObjectForm aDomainObjectForm,
            BindingResult results, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response);

    public void searchPostTxt(ADomainObjectForm aDomainObjectForm,
            BindingResult results, ModelMap modelMap,
            HttpServletRequest request, HttpServletResponse response);

    public void searchPostDoc(ADomainObjectForm aDomainObjectForm,
            BindingResult results, ModelMap modelMap,
            HttpServletRequest request, HttpServletResponse response);

    public void searchPostRtf(ADomainObjectForm aDomainObjectForm,
            BindingResult results, ModelMap modelMap,
            HttpServletRequest request, HttpServletResponse response);

    public void searchPostXml(ADomainObjectForm aDomainObjectForm,
            BindingResult results, ModelMap modelMap,
            HttpServletRequest request, HttpServletResponse response);

    ////////////////////////////////////////////////////////////////////////////
    public String myViewGet(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response);

    public String myViewAjaxGet(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response);

    public String viewByIdGet(@PathVariable("aDomainObjectId") Long aDomainObjectId,
            ModelMap modelMap, HttpServletRequest request, HttpServletResponse response);

//    public String viewPropertiesGet(@PathVariable("rcode") String rcode,
//            ModelMap modelMap, HttpServletRequest request,HttpServletResponse response);
//
//    public String viewPropertiesAjaxGet(@PathVariable("rcode") String rcode,
//            ModelMap modelMap, HttpServletRequest request,HttpServletResponse response);
    public String viewByRcodeGet(@PathVariable("rcode") String rcode,
            ModelMap modelMap, HttpServletRequest request, HttpServletResponse response);

    public String viewByRcodeAjaxGet(@PathVariable("rcode") String rcode,
            ModelMap modelMap, HttpServletRequest request, HttpServletResponse response);

    ////////////////////////////////////////////////////////////////////////////
    public String createGet(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response);

    public String createPost(ADomainObjectForm aDomainObjectForm,
            BindingResult results, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response);

    public String createAjaxGet(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response);

    public String createAjaxPost(ADomainObjectForm aDomainObjectForm,
            BindingResult results, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response);
    ////////////////////////////////////////////////////////////////////////////

    public String updateGet(
            @PathVariable("aDomainObjectId") String aDomainObjectId,
            ModelMap modelMap, HttpServletRequest request, HttpServletResponse response);

    public String updatePut(
            @PathVariable("aDomainObjectId") String aDomainObjectId,
            ADomainObjectForm aDomainObjectForm,
            BindingResult results,
            ModelMap modelMap, HttpServletRequest request, HttpServletResponse response);

    public String updateAjaxGet(
            @PathVariable("aDomainObjectId") String aDomainObjectId,
            ModelMap modelMap, HttpServletRequest request, HttpServletResponse response);

    public String updateAjaxPut(
            @PathVariable("aDomainObjectId") String aDomainObjectId,
            ADomainObjectForm aDomainObjectForm,
            BindingResult results,
            ModelMap modelMap, HttpServletRequest request, HttpServletResponse response);
    ////////////////////////////////////////////////////////////////////////////

    public String deleteGet(
            @PathVariable("aDomainObjectId") String aDomainObjectId,
            ModelMap modelMap, HttpServletRequest request, HttpServletResponse response);

    public String deleteAjaxGet(
            @PathVariable("aDomainObjectId") String aDomainObjectId,
            ModelMap modelMap, HttpServletRequest request, HttpServletResponse response);
    ////////////////////////////////////////////////////////////////////////////

    public String reportsGet(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response);

    public String reportsAjaxGet(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response);

    public String graphsGet(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response);

    public String graphsAjaxGet(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response);
    ////////////////////////////////////////////////////////////////////////////

    public void logNewObject(Object object, Long id);

    public void logEditedObject(Object oldCopy, Object newCopy, Long id);
    ////////////////////////////////////////////////////////////////////////////
}
