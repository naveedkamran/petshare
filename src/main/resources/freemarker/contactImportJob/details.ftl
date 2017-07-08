<div style="height: 5px; clear: both;"></div>

<div style="display: table;">
    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Name
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <strong><#if contactImportJob.name??>${contactImportJob.name}</#if></strong>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Status
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if contactImportJob.rstatus??>${contactImportJob.rstatus}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Priority
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if contactImportJob.rpriority??>${contactImportJob.rpriority}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Description
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if contactImportJob.description??>${contactImportJob.description}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Details
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if contactImportJob.details??>${contactImportJob.details}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Created By
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if contactImportJob.createdBy.displayName??>${contactImportJob.createdBy.displayName}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Date Created
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if contactImportJob.dateCreated??>${contactImportJob.dateCreated?datetime}</#if>
            </div>
        </div>



    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Time Duration
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if contactImportJob.dateFrom??>${contactImportJob.dateFrom?datetime}</#if> to <#if contactImportJob.dateTo??>${contactImportJob.dateTo?datetime}</#if>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Time Line
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <#if contactImportJob.etw??>${contactImportJob.etw}</#if>
            </div>
        </div>

    </div>


<div style="height: 10px; clear: both;"></div>
You can find the details of the contactImportJob here:
<div style="height: 10px; clear: both;"></div>
<a href="${application_url}/contactImportJobs/${contactImportJob.rcode}/view_r">${application_url}/contactImportJobs/${contactImportJob.rcode}/view_r</a>
<div style="height: 10px; clear: both;"></div>