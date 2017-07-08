
<div style="text-align: right; min-width: 98%; max-width: 98%; border: 1px solid black;">
    <div class="attObjectMaster" style="text-align: center; padding: 5px;">

        <#if attObjectMaster?has_content>
        <img alt="${attObjectMaster.docObject.name}" class="imageIcon100" src="doc_object/${attObjectMaster.docObject.rcode}/download"/>
        <#else>
        <img src="http://datenc.com/public/bunnycrm.net/static/images/no-image.png" class="imageIcon72"/>
        </#if>
        </div>


    <div class="attObjectMasterHov" style="text-align: center;" onclick="createAttObject();">
        <img src="http://datenc.com/public/bunnycrm.net/static/images/icons/update.png" class="imageIcon24"/>
        </div>
    <div class="clear2"></div>
    <!--
    <form method="POST" enctype="multipart/form-data" action="upload">
        <table>
            <tr><td>File to upload:</td><td><input type="file" name="file" /></td></tr>
            <tr><td>Name:</td><td><input type="text" name="name" /></td></tr>
            <tr><td></td><td><input type="submit" value="Upload" /></td></tr>
            </table>
        </form>

    -->
    </div>

<!--<form method="POST" enctype="multipart/form-data" action="att_object/create?_csrf=8306bdbb-3ee5-4f1a-a407-db31e4fbafa3">-->

<div id="attObjectCreateThumb">
    <form method="POST" action="att_object/create">
        <input type="hidden" name="boType" value="product"/>
        <input type="hidden" name="parentUid" value="57dd846e-71ce-4e9a-9979-cc9cef65a87c"/>
        <input type="hidden" name="attObjectType" value="do_thumb"/>

        <select id="docObjectId" name="docObject.id" class="form-control">
            <option value="">--SELECT--</option>
            <#list attObjects_data as attObject>
            <option value="${attObject.id}">${attObject.docObject.name}</option>
             </#list>
            </select>

        <input type="submit" value="Upload" />
        </form>
    </div>

<script language="javascript" type="text/javascript">
    $(document).ready(function() {
        $("#attObjectCreateThumb").hide();
    });
    </script>