function validateForm() {
    var faccno = document.forms["RTGS"]["accno"].value;
    if (faccno == "") {
      alert("Account No. must be filled out");
      return false;
    }
    var toaccno = document.forms["RTGS"]["toaccno"].value;
    if (toaccno == "") {
      alert("To Account No. must be filled out");
      return false;
    }
    var amt = document.forms["RTGS"]["amt"].value;
    if (amt == "") {
      alert("Amount must be filled out");
      return false;
    }
    var date = document.forms["RTGS"]["transd"].value;
    if (date == "") {
      alert("Transaction Date must be filled out");
      return false;
    }
}