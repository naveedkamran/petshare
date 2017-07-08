<#include "/freemarker/header.ftl">

<table style="min-width: 100%; border: 1px solid gainsboro;">
    <tr>
        <td style=" padding: 10px;">

            Hi ${userAccount.firstName}

            <div style="height: 5px; clear: both;"></div>


            A new user account is crated on BunnyCRM and needs screening.
            Please click to rewivew the account:
            <div style="height: 5px; clear: both;"></div>
            <a href="${application_url}/user_account/${userAccount.rcode}/view_r">Review Now</a>
            </td>
        </tr>

    </table>


<div class="clear2"></div>
<#include "/freemarker/footer.ftl">