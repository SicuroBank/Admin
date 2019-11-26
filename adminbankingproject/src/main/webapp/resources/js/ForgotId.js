function validateForm() {
    var accno = document.forms["Forgotid"]["accno"].value;
    if (accno == "") {
      alert(" Account No. must be filled out");
      return false;
    }
    var otp = document.forms["Forgotid"]["otp"].value;
    if (otp == "") {
      alert("One Time Password must be filled out");
      return false;
    }
    
}