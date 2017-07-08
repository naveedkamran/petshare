<table style="min-width: 100%; border: 1px solid gainsboro;">
    <tr>
        <td>
            <#include "/freemarker/header.ftl">
        </td>
    </tr>

    <tr>
        <td style=" padding: 10px;">

            Hi ${userAccount.firstName}

            <div style="height: 5px; clear: both;"></div>
            You request to reset your password is completed.
            <div style="height: 5px; clear: both;"></div>

            <strong>
            <span class="errorMessage">
            YOU SHOULD CHANGE THIS TEMPORARY PASSWORD IMMEDIATELY AFTER YOU LOGIN.
            </span>
            </strong>

            <div style="height: 5px; clear: both;"></div>
            <div class="helpText">
            $userAccount.passwordTemp
            <div style="height: 5px; clear: both;"></div>
            </div>
            <div style="height: 5px; clear: both;"></div>

        </td>
    </tr>

    <tr>
        <td style=" padding: 10px;">
            <#include "/freemarker/footer.ftl">
        </td>
    </tr>
</table>