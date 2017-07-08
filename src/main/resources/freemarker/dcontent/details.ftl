<div style="height: 5px; clear: both;"></div>

<div style="display: table;">
    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Name
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <strong><#if dcontent.name??>${dcontent.name}</#if></strong>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Status
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if dcontent.rstatus??>${dcontent.rstatus}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Priority
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if dcontent.rpriority??>${dcontent.rpriority}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Description
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if dcontent.description??>${dcontent.description}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Details
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if dcontent.details??>${dcontent.details}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Created By
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if dcontent.createdBy.displayName??>${dcontent.createdBy.displayName}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Date Created
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if dcontent.dateCreated??>${dcontent.dateCreated?datetime}</#if>
            </div>
        </div>



    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Time Duration
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if dcontent.dateFrom??>${dcontent.dateFrom?datetime}</#if> to <#if dcontent.dateTo??>${dcontent.dateTo?datetime}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Time Line
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if dcontent.etw??>${dcontent.etw}</#if>
            </div>
        </div>

    </div>


<div style="height: 10px; clear: both;"></div>
You can find the details of the dcontent here:
<div style="height: 10px; clear: both;"></div>
<a href="${application_url}/dcontent/${dcontent.rcode}/view_r">${application_url}/dcontent/${dcontent.rcode}/view_r</a>
<div style="height: 10px; clear: both;"></div>