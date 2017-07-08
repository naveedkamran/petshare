<table id="activityLogDt" cellpadding="0" cellspacing="0" border="0" class="display fontStd">
    <thead class="thead">
        <tr>
            <th><fmt:message key="label.description"/></th>
<th><fmt:message key="label.boType"/>Object Type</th>
<th><fmt:message key="label.boAction"/>Action</th>
<th><fmt:message key="label.oldValue"/>Old Value</th>
<th><fmt:message key="label.newValue"/>New Value</th>
<th><fmt:message key="label.createdBy"/>Created By</th>
<th><fmt:message key="label.dateCreated"/>Date Created</th>
</tr>
</thead>


<tbody>
        <#list activityLogs_data as activityLog>

        <#--
        <c:url var="update" value="/att_object/${activityLog.rcode}/update_ajax"/>
        <c:url var="view" value="/att_object/${activityLog.rcode}/view_r_ajax"/>
        <c:url var="delete" value="/att_object/${activityLog.rcode}/delete_ajax"/>
        -->

    <tr>

        <td style="">

            </td>
        <td style="">
                <#if activityLog.boType??>${activityLog.boType}</#if>
            </td>

        <td style="">
                <#if activityLog.boAction??>${activityLog.boAction}</#if>
            </td>

        <td style="">
                <#if activityLog.oldValue??>${activityLog.oldValue}</#if>
            </td>

        <td style="">
                <#if activityLog.newValue??>${activityLog.newValue}</#if>
            </td>


        <td style="">
                <#if activityLog.createdBy?? && activityLog.createdBy.preview??>${activityLog.createdBy.preview}</#if>
            </td>

        <td style="">

            </td>

        </tr>


        </#list>
    </tbody>

</table>

<div class="clear10"></div>

<script>

    oTable = $('#activityLogDt').dataTable({
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