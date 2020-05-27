# Getting Started


Run  the Application.
java jar contact-0.0.1-SNAPSHOT.jar

step 1- 

install mysql db .

create a user with credential root/12345678


 create a schema contacts  .
 
import attached sql .




end point urls -
get all contacts -

http://localhost:8080/api/v1/contacts


create contact of type company  ->

http://localhost:8080/api/v1/contacts

company type contact -->

{
     
      "type":"c",	 
    "company":{
         "cname":"abc consultan pvt ltd .",
         "regno":"xy123456"
      },
      "phone":{
         "number":56745348,
         "code":80
      },
  "customer":
         {
            "cnumber":12342,
            "orderdate":"15-12-2020"
         },
   
      "supplier":
         {
            "txnumber":"tx1324",
            "leadtime":"5d"            
         }
   }

   
     
   
   
   contact type person -->

{
      "id":1,
      "type":"p",	 
      "person":{
         "fname":"Ramesh",
         "lname":"Singh"
      },
    
      "phone":{
         "number":58658964,
         "code":80
      },
  "customer":
         {
            "cnumber":12342,
            "orderdate":"15-12-2020"
         },
   
      "supplier":
         {
            "txnumber":"tx1324",
            "leadtime":"5d"
            
         }
   }
   
 
get contact by id -->

Get 
http://localhost:8080/api/v1/contacts/11



delete a contact -->

http://localhost:8080/api/v1/contacts/11


update a contact 

put  ->


http://localhost:8080/api/v1/contacts/11

{
      "id":1,
      "type":"p",	 
      "person":{
         "fname":"Ramesh",
         "lname":"Singh"
      },
    
      "phone":{
         "number":58658964,
         "code":80
      },
  "customer":
         {
            "cnumber":12342,
            "orderdate":"15-12-2020"
         },
   
      "supplier":
         {
            "txnumber":"tx1324",
            "leadtime":"5d"
            
         }
   }


   
