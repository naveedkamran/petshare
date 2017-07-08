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
            A new attachment has been updated:


            #if($attObject.name!=null &&$attObject.name!="")
            <div style="height: 5px; clear: both;"></div>
            Subject: $attObject.name
            #end


            #if($attObject.description!=null &&$attObject.description!="")
            <div style="height: 5px; clear: both;"></div>
            $attObject.description
            #end


            #if($attObject.details!=null &&$attObject.details!="")
            <div style="height: 5px; clear: both;"></div>
            $attObject.details
            #end


            <div style="height: 5px; clear: both;"></div>
            You can find more details here:

            <div style="height: 5px; clear: both;"></div>
            <a href="$application_url/att_object/$attObject.id/view">$application_url/att_object/$attObject.id/view</a>
            <div style="height: 5px; clear: both;"></div>


        </td>
    </tr>

    <tr>
        <td style=" padding: 10px;">
            <#include "/freemarker/footer.ftl">
        </td>
    </tr>
</table>