function validateForm() {
    var userid = document.forms["ForgotPassword"]["userid"].value;
    if (userid == "") {
      alert(" User Id must be filled out");
      return false;
    }
    var otp = document.forms["ForgotPassword"]["otp"].value;
    if (otp == "") {
      alert("One Time Password must be filled out");
      return false;
    }
    
}