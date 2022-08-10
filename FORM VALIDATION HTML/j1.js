var fname=document.getElementById('fname');
var no=document.getElementById('mobile');
var eml=document.getElementById('email');
var landl_no=document.getElementById('landline');
var userform= document.getElementById('user1');
var msg=document.getElementById('txt');





var fname_regex =/^([a-zA-Z])/ 
var no_regex =/^([0-9]{10})$/
var email_regex = /^([a-zA-Z0-9._]{5,50})([@]{1})([a-z]{5,15})([.]{1})([a-z]{2,6})$/
var landline_regex=/^([0-9]{3})([-]{1})([0-9]{8})$/



userform.addEventListener("submit", validateForm);





// function validateForm(e){

//   e.preventDefault();


//   if(fname_regex.test(fname.value))
//   {
//     msg.innerText="valid name"
//        console.log("valid name");

// if(no_regex.test(no.value))

//   {  msg.innerText="valid contact";
//        console.log("valid contact");


// if(email_regex.test(eml.value))
// {
//    msg.innerText="valid id";
//         console.log("valid id");

// if(landline_regex.test(landl_no.value))
// {    msg.innerText="valid Landline";


//      console.log("valid landline");
// }



// else{
//    msg.innerText="invalid Landline";
//         console.log("invalid landline");
// }}

// else{
//  msg.innerText="invalid email-id";
//       console.log("invalid email-id");
// }

// }

// else{
//      msg.innerText="invalid contact";
//           console.log("invalid contact");
//   }


// }
//   else{

//      msg.innerText="invalid name";
//           console.log("invalid name");
//   }

// }






















function validateForm(e){

     // var nm=name.value;
     e.preventDefault();
   
   
     if(fname_regex.test(fname.value))
     {
       msg.innerText="valid name"
          console.log("valid name");}
          else{
   
               msg.innerText="invalid name";
                    console.log("invalid name");
            }
   
   if(no_regex.test(no.value))
   
     {  msg.innerText="valid contact";
          console.log("valid contact");}

          else{
               msg.innerText="invalid contact";
                    console.log("invalid contact");
            }
   
   if(email_regex.test(eml.value))
   {
      msg.innerText="valid id";
           console.log("valid email id");}

           else{
               msg.innerText="invalid email-id";
                    console.log("invalid email-id");
              }
   
   if(landline_regex.test(landl_no.value))
   {    msg.innerText="valid Landline";
   
        console.log("valid landline");


       
   }
     
   else{
      msg.innerText="invalid Landline";
           console.log("invalid landline");
   }





   if(fname_regex.test(fname.value) &&no_regex.test(no.value)&& email_regex.test(eml.value)&& landline_regex.test(landl_no.value))   {
     window.open("success.html");
}


}
   


