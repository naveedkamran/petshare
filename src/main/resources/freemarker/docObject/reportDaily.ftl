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

            <div style="display: table;">
                <div style="display: table-row;">
                    <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
                        Title
                    </div>

                    <div style="display: table-cell; padding: 5px; vertical-align: top;">
                        $docObject.name
                    </div>
                </div>

                <div style="display: table-row;">
                    <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
                        Customer
                    </div>

                    <div style="display: table-cell; padding: 5px; vertical-align: top;">
                        $docObject.project.customer.name
                    </div>
                </div>

                <div style="display: table-row;">
                    <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
                        Project
                    </div>

                    <div style="display: table-cell; padding: 5px; vertical-align: top;">
                        $docObject.project.name
                    </div>
                </div>

                <div style="display: table-row;">
                    <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
                        Messages Count
                    </div>

                    <div style="display: table-cell; padding: 5px; vertical-align: top;">
                        $docObject.countEmails
                    </div>
                </div>

                <div style="display: table-row;">
                    <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
                        Sent Count
                    </div>

                    <div style="display: table-cell; padding: 5px; vertical-align: top;">
                        $docObject.countSentEmails ($docObject.percentOfSentEmails %)
                    </div>
                </div>

                <div style="display: table-row;">
                    <div style="display: table-cell; padding: 5px; vertical-align: top; text-wrap: normal; color: #006EB9; min-width: 120px; text-align: right">
                        Read Count
                    </div>

                    <div style="display: table-cell; padding: 5px; vertical-align: top;">
                        $docObject.countReadEmails ($docObject.percentOfReadEmails %)
                    </div>
                </div>

            </div>


        </td>
    </tr>

    <tr>
        <td style=" padding: 10px;">
            <#include "/freemarker/footer.ftl">
        </td>
    </tr>
</table>