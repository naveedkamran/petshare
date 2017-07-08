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
                A new membership is created:

            <#include "/freemarker/membership/details.ftl">

            </td>
        </tr>
    </table>

<div class="clear2"></div>
<#include "/freemarker/footer.ftl">