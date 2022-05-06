# FitnessTrackerAssignment


This application will run on localhost:8081

Terminals: 
- /appointment              - AppointmentController
- /contact                  - ContactController
- /appointment/getdetails   - AppointmentController for getting data

Connect to postgres: 
1. Look out the application.properties file
2. Make a Database in Postgre Sql


JSON POST Requset for /appointment syntax : 
*************

{
    "customer" : {
        "name": "Urvi",
        "age" : 21,
        "mobileNumber" : "9123456780",
        "emailId": "urvi@gmail.com",
        "address": {
            "address": "Ramtek",
            "nearBy": "Shitalwadi",
            "city": "Nagpur",
            "state": "Maharashtra",
            "country" : "India",
            "pincode": "441106"
        },
        "selectedPackage": {
            "name": "FOURSESSIONS",
            "amount": 4500 
        }
    },
        "trainerPreference": "FEMALE",
        "needPysiohotherapist": true
}


Note:

Inside selectedPackage, name is Enum and only accepts :
(ONETIME, FOURSESSIONS, FIVESESSIONS)




****
JSON POST request for /contact syntax : 
****


{
    "name": "urvi",
    "message": "compiled code",
    "email": "urv@gmail.com",
    "phoneNumber": 9123456780
}

*************
