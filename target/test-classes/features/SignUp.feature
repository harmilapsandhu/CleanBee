Feature: CleanBee Website Validation

Scenario Outline: Test Home Owner Page

Given Initialize the browser
When User clicks Home Owner SignUp and enters <FirstName> and <LastName> and <E-mail> and <PhoneNumber> and <HouseType> then clicks SignUp
Then Verify Alert pop up and click OK

Examples:
|FirstName         	  	|LastName				|E-mail						|PhoneNumber	|HouseType		|
|Harmilap Singh			|Sandhu					|hardpsaffndhfu@gmail.com	|4272434277		|condo			|
|Bandhanjeet			|Sidhu					|sidssndhafnjeet@gmail.com	|4471564370		|house			|
|Andy					|Khatter				|andykddhafer@yahoo.com		|5358525489		|condo			|


Scenario Outline: Test Cleaner Page

Given Initialize the browser Cleaner
When User clicks Cleaner SignUp and enters <FirstName> and <LastName> and <E-mail> and <PhoneNumber> and <Experience> then clicks SignUp
Then Verify Alert pop up and click OK Cleaner

Examples:
|FirstName         	  	|LastName				|E-mail							|PhoneNumber	|Experience			|
|Wayne					|Rooney					|shrekforrver@gmail.com			|6435575277		|Beginner			|
|Alex					|Ferguson				|alexlovettgumandcum@gmail.com	|4859664370		|Intermediate		|
|Andy					|Khatter				|andykddher@yahoo.com			|9053525089		|Mastered			|