const addNewDoctorForm = document.getElementById("addNewDoctorForm");
const editDoctorDetails = document.getElementById("editDoctorDetails");
const replyToInquiries = document.getElementById("replyToInquiries");


//Open add new doctor popup window
function openAddNewDoctorForm() {
  addNewDoctorForm.classList.remove("hidden");
  addNewDoctorForm.classList.add("flex");
}

//Close add new doctor popup window
function closeAddNewDoctorForm() {
  addNewDoctorForm.classList.remove("flex");
  addNewDoctorForm.classList.add("hidden");
}

//Open edit Doctor Details Window
function openEditDoctorDetailsForm() {
  editDoctorDetails.classList.remove("hidden");
  editDoctorDetails.classList.add("flex");
}

//Close edit Doctor Details window
function closeEditDoctorDetailForm() {
  editDoctorDetails.classList.remove("flex");
  editDoctorDetails.classList.add("hidden");
}

//Open Reply to inquiries forms
function openReplyToInquiries(){
  replyToInquiries.classList.remove('hidden');
  replyToInquiries.classList.add('flex');
}

function closeReplyToInquiries(){
  replyToInquiries.classList.remove('flex');
  replyToInquiries.classList.add('hidden');
}


function showDoctorDeletePopup(doctorId) {
  Confirm.open({
    title: 'Delete Account',
    message: 'Are you sure you wish to delete this doctor\'s account? This action cannot be undone.',
    onok: () => {
      window.location.href = `DeleteDoctorController?id=${doctorId}`;
    }
  });
}

function showPatientDeletePopup(patientId) {
  Confirm.open({
    title: 'Delete Account',
    message: 'Are you sure you wish to delete this patient\'s account? This action cannot be undone.',
    onok: () => {
      window.location.href = `DeletePatientServelet?id=${patientId}`;
    }
  });
}

function showAppointmentDeletePopup(appointmenttId) {
  Confirm.open({
    title: 'Delete Appointment',
    message: 'Are you sure you wish to delete this Appointment? This action cannot be undone.',
    onok: () => {
      window.location.href = `DeleteAppointmentByAdmin?id=${appointmenttId}`;
    }
  });
}