<#include "/freemarker/header.ftl">

<table style="min-width: 100%; border: 1px solid gainsboro;">
    <tr>
        <td style=" padding: 10px;">

            Hi ${userAccount.firstName}

            <div style="height: 5px; clear: both;"></div>

            <p>
                This is to confirm that your registration is successful.
            <div style="height: 5px; clear: both;"></div>



            Please click the following Link to activate your user account:
            <div style="height: 5px; clear: both;"></div>
            <a href="${application_url}/user_account/${userAccount.secretCode}/activation/accept">Accept</a>
            <div style="height: 5px; clear: both;"></div>
            You can also use following link by copying it on your browser:
            <div style="height: 5px; clear: both;"></div>
            ${application_url}/user_account/${userAccount.secretCode}/activation/accept

            <div style="height: 5px; clear: both;"></div>
            <div style="height: 5px; clear: both;"></div>
            If you did not requested for this request then please reject this by clicking the following Link:
            <div style="height: 5px; clear: both;"></div>
            <a href="${application_url}/user_account/${userAccount.secretCode}/activation/reject">Reject</a>
            <div style="height: 5px; clear: both;"></div>
            You can also use following link by copying it on your browser:
            <div style="height: 5px; clear: both;"></div>
            ${application_url}/user_account/${userAccount.secretCode}/activation/reject

            <div style="height: 5px; clear: both;"></div>

            </td>
        </tr>

    </table>


<div class="clear2"></div>
<#include "/freemarker/footer.ftl">