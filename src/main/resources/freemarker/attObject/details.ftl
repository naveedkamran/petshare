<div style="height: 5px; clear: both;"></div>

<div style="display: table;">
    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Name
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <strong><#if attObject.name??>${attObject.name}</#if></strong>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Status
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if attObject.rstatus??>${attObject.rstatus}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Priority
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if attObject.rpriority??>${attObject.rpriority}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Description
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if attObject.description??>${attObject.description}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Details
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if attObject.details??>${attObject.details}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Created By
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if attObject.createdBy.displayName??>${attObject.createdBy.displayName}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Date Created
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if attObject.dateCreated??>${attObject.dateCreated?datetime}</#if>
            </div>
        </div>



    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Time Duration
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if attObject.dateFrom??>${attObject.dateFrom?datetime}</#if> to <#if attObject.dateTo??>${attObject.dateTo?datetime}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Time Line
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if attObject.etw??>${attObject.etw}</#if>
            </div>
        </div>

    </div>


<div style="height: 10px; clear: both;"></div>
You can find the details of the attObject here:
<div style="height: 10px; clear: both;"></div>
<a href="${application_url}/att_object/${attObject.rcode}/view_r">${application_url}/att_object/${attObject.rcode}/view_r</a>
<div style="height: 10px; clear: both;"></div>