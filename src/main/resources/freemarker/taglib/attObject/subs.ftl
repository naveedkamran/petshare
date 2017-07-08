<span id="subscribeItemSpan" class="linkAjax">
    <img src="http://datenc.com/public/bunnycrm.net/static/images/icons/star-blur.png"
         alt="Subscribe" title="Subscribe" onclick="submitFormUpdateSubs();"
         class="imageIcon24">
    </img>
</span>



<span id="unsubscribeItemSpan" class="linkAjax">
    <img src="http://datenc.com/public/bunnycrm.net/static/images/icons/star-shining.png"
         alt="Un-subscribe" title="Un-subscribe" onclick="submitFormUpdateSubs();"
         class="imageIcon24">
    </img>
</span>


<form id="cruAttObjectSubsForm" method="post">
    <input type="hidden" name="parentUid" id="parentUid" value="${parentUid}">
    <input type="hidden" name="boType" id="boType" value="${boType}">
    <input type="hidden" name="attObjectType" id="attObjectType" value="${attObjectType}">
    <input type="hidden" name="upk" id="attObjectType" value="${upk}">
</form>

<#if attObjectExists == true ??>
<script language="javascript" type="text/javascript">
    $(document).ready(function () {
        $("#subscribeItemSpan").hide();
        $("#unsubscribeItemSpan").show();
    });
</script>
<#else>
<script language="javascript" type="text/javascript">
    $(document).ready(function () {
        $("#subscribeItemSpan").show();
        $("#unsubscribeItemSpan").hide();
    });
</script>
</#if>

<script type="text/javascript">
    function submitFormUpdateSubs() {
        $.ajax({
            url: 'rest/att_object/update_subs',
            type: "POST",
            data: $("#cruAttObjectSubsForm").serialize(),
            beforeSend: function (xhr) {
                $("#cruAttObjectSubsForm :input").attr("disabled", true);
                $("#formActionAlertDiv").html("Please wait ...");
            }
        }).done(function (responseText) {
            try {
                $("#subscribeItemSpan").toggle();
                $("#unsubscribeItemSpan").toggle();
            } catch (e) {
                alert("Exception: " + e.toString());
            }
        }).fail(function (jqXHR, textStatus) {
            $("#formActionAlertDiv").html(getFailureMessageFormatted(obj.message));
        }).always(function () {
            $("#cruAttObjectSubsForm :input").attr("disabled", false);
        });
        return false;
    }
</script>