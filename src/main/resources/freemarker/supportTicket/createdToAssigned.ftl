<table style="min-width: 100%; border: 1px solid gainsboro;">
    <tr>
        <td>
            <#include "/freemarker/header.ftl">
        </td>
    </tr>

    <tr>
        <td style=" padding: 10px;">

            Hi!

            <div style="height: 5px; clear: both;"></div>

            <p>
            A new ticket is created:

            <#include "/freemarker/supportTicket/details.ftl">
            <#include "/freemarker/footer.ftl">

        </td>
    </tr>

    <tr>
        <td style=" padding: 10px;">
            <#include "/freemarker/footer.ftl">
        </td>
    </tr>
</table>