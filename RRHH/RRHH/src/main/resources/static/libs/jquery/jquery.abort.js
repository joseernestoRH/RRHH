﻿// $.xhrPool and $.ajaxSetup are the solution
$.xhrPool = [];
$.xhrPool.abortAll = function () {
    $(this).each(function (idx, jqXHR) {
        jqXHR.abort();
    });
    $.xhrPool.length = 0;
};

$.ajaxSetup({
    beforeSend: function (jqXHR) {
        $.xhrPool.push(jqXHR);
    },
    complete: function (jqXHR) {
        var index = $.xhrPool.indexOf(jqXHR);
        if (index > -1) {
            $.xhrPool.splice(index, 1);
        }
    }
});