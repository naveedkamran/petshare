<div style="height: 5px; clear: both;"></div>

<div style="display: table;">
    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Credits
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <strong><#if membership.credits??>${membership.credits}</#if></strong>
            </div>
        </div>

    <div style="display: table-row;">
        <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
            Expiry Date
            </div>

        <div style="display: table-cell; padding: 5px; vertical-align: top;">
            <strong><#if membership.dateTo??>${membership.dateTo?datetime}</#if></strong>
            </div>

<!--
<div style="display: table-row;">
<div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
    Priority
    </div>

<div style="display: table-cell; padding: 5px; vertical-align: top;">
    $membership.rpriority
    </div>
</div>

<div style="display: table-row;">
<div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
    Description
    </div>

<div style="display: table-cell; padding: 5px; vertical-align: top;">
    $membership.description
    </div>
</div>

<div style="display: table-row;">
<div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
    Details
    </div>

<div style="display: table-cell; padding: 5px; vertical-align: top;">
    $membership.details
    </div>
</div>

<div style="display: table-row;">
<div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
    Created By
    </div>

<div style="display: table-cell; padding: 5px; vertical-align: top;">
    $membership.createdBy.displayName
    </div>
</div>

<div style="display: table-row;">
<div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
    Date Created
    </div>

<div style="display: table-cell; padding: 5px; vertical-align: top;">
    $membership.dateCreated
    </div>
</div>

<div style="display: table-row;">
<div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
    Type
    </div>

<div style="display: table-cell; padding: 5px; vertical-align: top;">
    #$membership.rtype.name
    </div>
</div>


<div style="display: table-row;">
<div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
    Time Duration
    </div>

<div style="display: table-cell; padding: 5px; vertical-align: top;">
    $membership.dateFrom to $membership.dateTo
    </div>
</div>

<div style="display: table-row;">
<div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
    Time Line
    </div>

<div style="display: table-cell; padding: 5px; vertical-align: top;">
    $membership.etw
    </div>
</div>
        -->
        </div>


<!--##TEMPCOMMENT
##<div style="height: 5px; clear: both;"></div>
##Assigned to: $membership.assignedTo.firstName!-->

<!--<div style="height: 10px; clear: both;"></div>
You can find the details of the membership here:
<div style="height: 10px; clear: both;"></div>
<a href="$application_url/memberships/$membership.rcode/view_r">$application_url/memberships/$membership.rcode/view_r</a>
<div style="height: 10px; clear: both;"></div>-->