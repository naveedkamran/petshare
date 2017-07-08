
<table style="min-width: 100%; border: 1px solid gainsboro;">
    <tr>
        <td>
            <#include "/freemarker/header.ftl">
            </td>
        </tr>

    <tr>
        <td style=" padding: 10px;">

            <#if message.description??>
            ${message.description}
            <#else>
            Hi!

            <div class="clear2"></div>
            <#if message.accountFrom?? && message.accountFrom.preview??>${message.accountFrom.preview}</#if> has sent you following document.
            Please look message attachment.
            </#if>

            <div class="clear4"></div>
            <#if message.accountFrom?? && message.accountFrom.fullName??>${message.accountFrom.fullName}</#if>
            <div class="clear2"></div>
            <#if message.accountFrom?? && message.accountFrom.userRoleSingleName??>${message.accountFrom.userRoleSingleName}</#if>

            </td>
        </tr>

    </table>

<div class="clear2"></div>
<#include "/freemarker/footer.ftl">