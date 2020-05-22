# Getting Started


Run  the Application.
java jar contact-0.0.1-SNAPSHOT.jar

step 1- 

install mongodb .

create a user with credential root/12345678


 create a test db and contact collection .
 
 




end point urls -
get all contacts -

http://localhost:8080/api/v1/contacts

get single contact by id -
http://localhost:8080/api/v1/contacts/12341


Delete a contact --

http://localhost:8080/api/v1/contacts/12345




create a contact --

http://localhost:8080/api/v1/contacts

{
   "contact":{
      "id":12346,
      "type":"person",	 
      "person":{
         "fname":"xf",
         "lname":"xl"
      },
      "company":{
         "cname":"xf",
         "cadd":"xl"
      },
      "phone":{
         "number":12345568,
         "code":12345568
      },
  "customer":[
         {
            "cnumber":12342,
            "orderdate":"15-12-2020"
         },
         {
            "cnumber":12343,
            "orderdate":"16-12-2020"
         }
      ],
      "supplier":[
         {
            "txnumber":"tx1324",
            "leadtime":"5d",
             "supid":12344 
         },
         {
            "txnumber":"tx1324",
            "leadtime":"5d",
             "supid":12345 
         }
      ]
   }
}
