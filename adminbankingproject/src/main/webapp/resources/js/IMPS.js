function validateForm() {
    var faccno = document.forms["IMPS"]["accno"].value;
    if (faccno == "") {
      alert("Account No. must be filled out");
      return false;
    }
    var toaccno = document.forms["IMPS"]["toaccno"].value;
    if (toaccno == "") {
      alert("To Account No. must be filled out");
      return false;
    }
    var amt = document.forms["IMPS"]["amt"].value;
    if (amt == "") {
      alert("Amount must be filled out");
      return false;
    }
    var date = document.forms["IMPS"]["transd"].value;
    if (date == "") {
      alert("Transaction Date must be filled out");
      return false;
    }
}