function validateForm() {
    var baccno = document.forms["AddBeneficiary"]["baccno"].value;
    if (baccno == "") {
      alert("Beneficiary Account No. must be filled out");
      return false;
    }
    var renterbaccno = document.forms["AddBeneficiary"]["renterbaccno"].value;
    if (renterbaccno == "") {
      alert("Re-Enter Account No. must be filled out");
      return false;
    }

    if(baccno!=renterbaccno){
      alert("Beneficiary Account No. must be same");
      return false;
    }
    var benname = document.forms["AddBeneficiary"]["benname"].value;
    if (benname == "") {
      alert("Beneficiary Name must be filled out");
      return false;
    }
}