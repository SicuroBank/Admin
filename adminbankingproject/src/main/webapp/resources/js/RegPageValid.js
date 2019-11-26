function validateForm() {
    var first = document.forms["OpenAccount"]["fname"].value;
    if (first == "") {
      alert("FName must be filled out");
      return false;
    }
    var middle = document.forms["OpenAccount"]["mname"].value;
    if (middle == "") {
      alert("MName must be filled out");
      return false;
    }
    var last = document.forms["OpenAccount"]["lname"].value;
    if (last == "") {
      alert("LName must be filled out");
      return false;
    }
    var faname = document.forms["OpenAccount"]["faname"].value;
    if (faname == "") {
      alert("Father's Name must be filled out");
      return false;
    }
    var phno = document.forms["OpenAccount"]["phno"].value;
    if (phno == "" ) {
      alert("Phone No. must be filled out");
      return false;
    }
    if (phno < 10) {
        alert("Phone No. must be 10 digits");
        return false;
      }
    var email = document.forms["OpenAccount"]["email"].value;
    if (email == "") {
      alert("Email must be filled out");
      return false;
    }
    var aadhar = document.forms["OpenAccount"]["aadhar"].value;
    if (aadhar == "") {
      alert("Aadhar Card No. must be filled out");
      return false;
    }
    if (aadhar < 12) {
        alert("Aadhar Card No. must be 12 digits");
        return false;
      }
    var dob = document.forms["OpenAccount"]["dob"].value;
    if (dob == "") {
      alert("Date Of Birth must be filled out");
      return false;
    }


    var resaddrl1 = document.forms["OpenAccount"]["resaddrl1"].value;
    if (resaddrl1 == "") {
      alert("Resdential Address must be filled out");
      return false;
    }
    var resaddrl2 = document.forms["OpenAccount"]["resaddrl2"].value;
    if (resaddrl2 == "") {
      alert("Resdential Address must be filled out");
      return false;
    }
    var city = document.forms["OpenAccount"]["city"].value;
    if (city == "") {
      alert("City must be filled out");
      return false;
    }
    var state = document.forms["OpenAccount"]["state"].value;
    if (state == "") {
      alert("State must be filled out");
      return false;
    }
    var pincode = document.forms["OpenAccount"]["pincode"].value;
    if (pincode == "") {
      alert("Pincode must be filled out");
      return false;
    }
    if (pincode < 6) {
        alert("Pincode must be 12 digits");
        return false;
      }


      var addrl1 = document.forms["OpenAccount"]["addrl1"].value;
      if (resaddrl1 == "") {
        alert("Resdential Address must be filled out");
        return false;
      }
      var addrl2 = document.forms["OpenAccount"]["addrl2"].value;
      if (resaddrl2 == "") {
        alert("Resdential Address must be filled out");
        return false;
      }
      var city2 = document.forms["OpenAccount"]["city2"].value;
      if (city2 == "") {
        alert("City must be filled out");
        return false;
      }
      var state2 = document.forms["OpenAccount"]["state2"].value;
      if (state2 == "") {
        alert("State must be filled out");
        return false;
      }
      var pincode2 = document.forms["OpenAccount"]["pincode2"].value;
      if (pincode2 == "") {
        alert("Pincode must be filled out");
        return false;
      }
      if (pincode2 < 6) {
          alert("Pincode must be 12 digits");
          return false;
        }


        var Occtype = document.forms["OpenAccount"]["occtype"].value;
        if (Occtype == "") {
          alert("Occupation Type must be filled out");
          return false;
        }
        var srci = document.forms["OpenAccount"]["srci"].value;
        if (srci == "") {
          alert("Source of Income must be filled out");
          return false;
        }
        var gai = document.forms["OpenAccount"]["gai"].value;
        if (gai == "") {
          alert("Gross Annual Income must be filled out");
          return false;
        }
   
  
  }
  function FillAddress(a) {
    if(a.sameasaddr.checked == true) {
      a.resaddrl1.value = a.addrl1.value;
      a.resaddrl2.value = a.addrl2.value;
      a.landmark.value = a.landmark2.value;
      a.city.value = a.city2.value;
      a.state.value = a.state2.value;
      a.pincode.value = a.pincode2.value;
    
    }
  }
  
