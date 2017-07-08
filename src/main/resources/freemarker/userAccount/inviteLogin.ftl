<table style="min-width: 100%; border: 1px solid gainsboro;">
    <tr>
        <td>
            <#include "/freemarker/header.ftl">
            </td>
        </tr>

    <tr>
        <td style=" padding: 10px;">

            Hi <#if userAccount.firstName??>${userAccount.firstName}</#if>
            <div style="height: 10px; clear: both;"></div>
            This is a confirmation email for your account creation on BunnyCRM. Here is your login information:
            <div style="height: 10px; clear: both;"></div>
            Username: <strong><#if userAccount.username??>${userAccount.username}</#if></strong>
            <div style="height: 5px; clear: both;"></div>
            <#if userAccount.passwordTemp??>
            Password: <strong>${userAccount.passwordTemp}</strong>
            <div style="height: 10px; clear: both;"></div>
            Above password is a temporary password and you need to change this after first login.
            </#if>
            <div style="height: 10px; clear: both;"></div>
            Please click the following Link to login to the application.
            <div style="height: 10px; clear: both;"></div>
            <a href="${application_url}/login">Login link</a>
            <div style="height: 10px; clear: both;"></div>
            <#if userAccount.createdBy?? && userAccount.createdBy.firstName??>
            This user account was created by <strong>${userAccount.createdBy.firstName}</strong>
            </#if>

            </td>
        </tr>

    </table>

 <#include "/freemarker/footer.ftl">