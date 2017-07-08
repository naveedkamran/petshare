<table style="min-width: 100%; border: 1px solid gainsboro;">
    <tr>
        <td>
            <#include "/freemarker/header.ftl">
            </td>
        </tr>

    <tr>
        <td style=" padding: 10px;">

            Hi <#if userAccount.firstName??>${userAccount.firstName}</#if>

            <div style="height: 5px; clear: both;"></div>

            <p>
                Your user account status has been changed.
            <p><p>
                New Status:&nbsp;<strong><#if userAccount.rstatus??>${userAccount.rstatus}</#if></strong>
            <div style="height: 5px; clear: both;"></div><div style="height: 5px; clear: both;"></div><div style="height: 5px; clear: both;"></div>

            </td>
        </tr>

    <tr>
        <td style=" padding: 10px;">
            <#include "/freemarker/footer.ftl">
            </td>
        </tr>
    </table>