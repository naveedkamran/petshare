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

            <p>
            This is to confirm that your user account information was updated.
            <div style="height: 5px; clear: both;"></div>
            Please click the following Link to login to the application:
            <div style="height: 5px; clear: both;"></div>
            <a href="$application_url">Login Now</a>
            <div style="height: 5px; clear: both;"></div>
            You can also use following link by copying it on your browser:
            <div style="height: 5px; clear: both;"></div>
            ${application_url}


        </td>
    </tr>

    <tr>
        <td style=" padding: 10px;">
            <#include "/freemarker/footer.ftl">
        </td>
    </tr>
</table>