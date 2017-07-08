<div style="height: 5px; clear: both;"></div>

<div style="display: table;">
    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Name
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <strong><#if supportTicket.name??>${supportTicket.name}</#if></strong>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Status
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if supportTicket.rstatus??>${supportTicket.rstatus}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Priority
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if supportTicket.rpriority??>${supportTicket.rpriority}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Type
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if supportTicket.rtype?? && supportTicket.rtype.displayName??>${supportTicket.rtype.displayName}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Description
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if supportTicket.description??>${supportTicket.description}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Details
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if supportTicket.details??>${supportTicket.details}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Progress
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if supportTicket.progress??>${supportTicket.progress}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Assigned to
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if supportTicket.assignedTo?? && supportTicket.assignedTo.displayName??>${supportTicket.assignedTo.displayName}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Module
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if supportTicket.moduleName??>${supportTicket.moduleName}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Sub-Module
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if supportTicket.subModuleName??>${supportTicket.subModuleName}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Type
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if supportTicket.rype?? && supportTicket.rype.name ??>${supportTicket.rype.name }</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Level
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if supportTicket.level?? && supportTicket.level.name ??>${supportTicket.level.name }</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Environment
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if supportTicket.environment?? && supportTicket.environment.name ??>${supportTicket.environment.name }</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Estimated Time of Delivery
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if supportTicket.etwAsString ??>${supportTicket.etwAsString }</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Created By
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if supportTicket.createdBy.displayName??>${supportTicket.createdBy.displayName}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Date Created
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if supportTicket.dateCreated??>${supportTicket.dateCreated?datetime}</#if>
            </div>
        </div>



    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Time Duration
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if supportTicket.dateFrom??>${supportTicket.dateFrom?datetime}</#if> to <#if supportTicket.dateTo??>${supportTicket.dateTo?datetime}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Time Line
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if supportTicket.etw??>${supportTicket.etw}</#if>
            </div>
        </div>

    </div>


<div style="height: 10px; clear: both;"></div>
You can find the details of the supportTicket here:
<div style="height: 10px; clear: both;"></div>
<a href="${application_url}/support_ticket/${supportTicket.rcode}/view_r">${application_url}/support_ticket/${supportTicket.rcode}/view_r</a>
<div style="height: 10px; clear: both;"></div>