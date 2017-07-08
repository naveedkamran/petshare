<div style="height: 5px; clear: both;"></div>

<div style="display: table;">
    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Name
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <strong><#if timeLog.name??>${timeLog.name}</#if></strong>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Project
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if timeLog.project?? && timeLog.project.name??>${timeLog.project.name}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Support Ticket
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if timeLog.supportTicket?? && timeLog.supportTicket.name??>${timeLog.supportTicket.name}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            ETW
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if timeLog.etwAsString??>${timeLog.etwAsString}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            External System ID
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if timeLog.scVersion??>${timeLog.scVersion}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Request Source
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if timeLog.requestSource??>${timeLog.requestSource}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Status
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if timeLog.rstatus??>${timeLog.rstatus}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Priority
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if timeLog.rpriority??>${timeLog.rpriority}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Description
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if timeLog.description??>${timeLog.description}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Details
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if timeLog.details??>${timeLog.details}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Created By
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if timeLog.createdBy.displayName??>${timeLog.createdBy.displayName}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Date Created
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if timeLog.dateCreated??>${timeLog.dateCreated?datetime}</#if>
            </div>
        </div>



    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Time Duration
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if timeLog.dateFrom??>${timeLog.dateFrom?datetime}</#if> to <#if timeLog.dateTo??>${timeLog.dateTo?datetime}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Time Line
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if timeLog.etw??>${timeLog.etw}</#if>
            </div>
        </div>

    </div>


<div style="height: 10px; clear: both;"></div>
You can find the details of the timeLog here:
<div style="height: 10px; clear: both;"></div>
<a href="${application_url}/time_log/${timeLog.rcode}/view_r">${application_url}/time_log/${timeLog.rcode}/view_r</a>
<div style="height: 10px; clear: both;"></div>