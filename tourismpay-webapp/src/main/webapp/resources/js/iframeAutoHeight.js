/**
 * Created by yankun on 2016/4/18.
 */
$(document).ready(function () {
    $(document.body).bind("resize", function () {
        autoFullHeight();
    });
    function autoFullHeight() {
        var ifm= $("#mainWindow", window.parent.document);
        if(ifm && ifm.length>0) {
            if( ifm[0].contentDocument.body.offsetHeight>834){
             ifm[0].height =  ifm[0].contentDocument.body.offsetHeight;
            }else{
                ifm[0].height = 834;
            }
        }
    }
});


