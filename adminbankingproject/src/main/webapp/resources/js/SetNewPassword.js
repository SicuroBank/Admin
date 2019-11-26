function validateForm() {
    var pwd = document.forms["NewPassword"]["pwd"].value;
    if (pwd == "") {
      alert("Enter the New Password");
      return false;
    }
    var cpwd = document.forms["NewPassword"]["cpwd"].value;
    if (cpwd == "") {
      alert("Enter the New Password again to save");
      return false;
    }

    if(pwd!=cpwd){
      alert("Both the Passwords must be same");
      return false;
    }

}