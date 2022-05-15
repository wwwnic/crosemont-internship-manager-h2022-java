var btnContainer = document.getElementById("formSelector");

var btns = btnContainer.getElementsByClassName("btnFormSelector");

for (var i = 0; i < btns.length; i++) {
    btns[i].addEventListener("click", function () {
        var current = document.getElementsByClassName("active");
        current[0].className = current[0].className.replace(" active", "");
        this.className += " active";
    });

    function displayStudent() {
        var student = document.getElementById("formStudent");
        var teacher = document.getElementById("formTeacher");
        var company = document.getElementById("formCompany");
        student.style.display = "block";
        teacher.style.display = "none";
        company.style.display = "none";
    }

    function displayTeacher() {
        var student = document.getElementById("formStudent");
        var teacher = document.getElementById("formTeacher");
        var company = document.getElementById("formCompany");
        student.style.display = "none";
        teacher.style.display = "block";
        company.style.display = "none";
    }
    function displayCompany() {
        var student = document.getElementById("formStudent");
        var teacher = document.getElementById("formTeacher");
        var company = document.getElementById("formCompany");
        student.style.display = "none";
        teacher.style.display = "none";
        company.style.display = "block";
    }
}