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
            You have requested to reset your password.
            <div style="height: 5px; clear: both;"></div>

            <strong>
                <span style="color: red;">If you did not made this request then please ignore this message.</span>
                </strong>

            <div style="height: 5px; clear: both;"></div>
            Please click the following Link to reset your password:
            <div style="height: 5px; clear: both;"></div>
            <a href="${application_url}/user_account/${userAccount.secretCode}/password_reset">Reset My Password</a>

            <div style="height: 5px; clear: both;"></div>
            Or alternatively, you can also use following link by copying it on your browser:
            <div style="height: 5px; clear: both;"></div>
            <a href="${application_url}/user_account/${userAccount.secretCode}/password_reset">
                $application_url/user_account/$userAccount.secretCode/password_reset
                </a>

            <div style="height: 5px; clear: both;"></div>
            <div style="height: 5px; clear: both;"></div>
            <div style="height: 5px; clear: both;"></div>

            </td>
        </tr>

    </table>

<#include "/freemarker/footer.ftl">