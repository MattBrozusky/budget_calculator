"use strict";
$(document).ready(function() {

    let total = $('#total');
    let pay = $('#pay');
    let otherIncome = $('#otherIncome');
    let spending = $('.spend');

    let totalSpending = 0;

    $(document).on('keyup', function(){
        totalSpending = 0;
        for (let i = 0; i < spending.length; i++) {
            if (isNaN(parseInt(spending[i].value))){
                continue;
            } else {
                totalSpending += parseInt(spending[i].value);
            }
        }
        total.html((parseInt(pay.val()) + parseInt(otherIncome.val()) - totalSpending));
    })
});