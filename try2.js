
 function fn1(){
var a =document.getElementById("spring_roll").value;
if(a==0)
return false;
else 
return true;
}
 function fn2(){
var a =document.getElementById("veg_manchurian").value;
if(a==0)
return false;
else 
return true;
}
 function fn3(){
var a =document.getElementById("paneer_roll").value;
if(a==0)
return false;
else 
return true;
}
 function fn4(){
var a =document.getElementById("veg_chopsey").value;
if(a==0)
return false;
else 
return true;
}
 function fn5(){
var a =document.getElementById("gobi_masala").value;
if(a==0)
return false;
else 
return true;
}
 function fn6(){
var a =document.getElementById("mushroom_masala").value;
if(a==0)
return false;
else 
return true;
}
 function fn7(){
var a =document.getElementById("veg_schezwan").value;
if(a==0)
return false;
else 
return true;
}
 function fn8(){
var a =document.getElementById("mushroom_schezwan").value;
if(a==0)
return false;
else 
return true;
}
 function fn9(){
var a =document.getElementById("paneer_schezwan").value;
if(a==0)
return false;
else 
return true;
}


function validate()
{
   var a=fn1();
   var b=fn2();

   var c=fn3();

   var d=fn4();

   var e=fn5();

   var f=fn6();

   var g=fn7();

   var h=fn8();

   var i=fn9();

   
if(a || b || c || d || e || f || g || h || i)
{
alert("Your bill will be processed shortly");
return true;

}
else
{
alert("Please provide the quantity against your desired food");
return false;

}
}
