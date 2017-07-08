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
            Your password has been changed successfully.
            <div style="height: 5px; clear: both;"></div>

        </td>
    </tr>

    <tr>
        <td style=" padding: 10px;">
            <#include "/freemarker/footer.ftl">
        </td>
    </tr>
</table>