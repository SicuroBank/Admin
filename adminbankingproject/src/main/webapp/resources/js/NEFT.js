function validateForm() {
    var faccno = document.forms["NEFT"]["accno"].value;
    if (faccno == "") {
      alert("Account No. must be filled out");
      return false;
    }
    var toaccno = document.forms["NEFT"]["toaccno"].value;
    if (toaccno == "") {
      alert("To Account No. must be filled out");
      return false;
    }
    var amt = document.forms["NEFT"]["amt"].value;
    if (amt == "") {
      alert("Amount must be filled out");
      return false;
    }
    var date = document.forms["NEFT"]["transd"].value;
    if (date == "") {
      alert("Transaction Date must be filled out");
      return false;
    }
}