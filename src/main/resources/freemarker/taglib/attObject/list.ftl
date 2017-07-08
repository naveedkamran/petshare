<table id="attObjectDt" cellpadding="0" cellspacing="0" border="0" class="display fontStd">
    <thead class="thead">
        <tr>
            <th><fmt:message key="label.name"/></th>
<th><fmt:message key="label.name"/></th>
</tr>
</thead>

<tbody>
        <#list attObjects_data as attObject>
<c:url var="update" value="/att_object/${attObject.rcode}/update_ajax"/>
<c:url var="view" value="/att_object/${attObject.rcode}/view_r_ajax"/>
<c:url var="delete" value="/att_object/${attObject.rcode}/delete_ajax"/>

<tr>

    <td style="">
        <img alt="${attObject.docObject.name}" class="imageIcon100" src="doc_object/${attObject.docObject.rcode}/download"/>
        </td>
    <td style="">
                       <#if attObject.name??>${attObject.name}</#if>
        </td>

    </tr>

         </#list>
</tbody>
</table>

<div class="clear10"></div>

<script>

    oTable = $('#attObjectDt').dataTable({
        "aLengthMenu": [10, 25, 50, 100, 500, 1000, 5000],
        "sPaginationType": "full_numbers",
        "bStateSave": true,
        //"bJQueryUI": true,
        //"bServerSide": true,
        "aoColumnDefs": [
            //{"bSortable": false, "aTargets": [6]}//,
            //{"sClass": "center", "aTargets": [2, 3]}
        ]

    });
    </script>