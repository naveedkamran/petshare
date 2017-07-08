<#include "../style.ftl">

<div id="rtagsList">
    <#list rtagAss_data as rtagAss>
    <span style="" class="rtagContainer" id="rtag_${rtagAss.rcode}">
        <span style="" class="rtagContainerContent">
            ${rtagAss.name}
        </span>

        <span style="" class="rtagContainerClose" onclick="javascript:deleteRtag('${upk}', '${rtagAss.rcode}');">
            X
        </span>
    </span>
    </#list>
</div>

<div class="clear"></div>
<br/>

<div id="cruRtagInlineFormDiv">
    <form id="cruRtagInlineForm" action="rest/createRtag" onsubmit="javascript:return createNewRtag();">
        <input type="hidden" id="objectRcode" name="objectRcode" value="${objectRcode}"/>
        <input type="hidden" id="boType" name="boType" value="${boType}"/>
        <input type="hidden" id="upk" name="upk" value="${upk}"/>

        <table>
            <tr>
                <td>
                    <input type="text" id="rtagName" class="form-control" name="name" style="max-width: 140px;"></input>
                </td>
                <td>
                    <div class="formTableCellValidation" id="rtagNamev"></div>
                </td>

                <td>
                    <input type="submit" value="Save" class="btn btn-default"/>
                </td>
            </tr>
        </table>
    </form>
</div>

<div id="formActionAlertDiv"></div>
<div id="cruRtagInlineFormResponseDiv"></div>

<script type="text/javascript">

</script>