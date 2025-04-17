// COMMENT!

/**
hello there this
is a
multiline
comment
*/

// insteaf of String, int , float... All data types are automatically inferred
// in javascript e.g.

var name = "thafim";
var name = 32;
var name = 456.098
var name = {"hello" : "world"}

console.log("whatever you wish to print goes here");
// multiple values can be printed at once
console.log("Hi", "hello", 32, "time is 9.40");

// Conditional Statements
var age = 23;
if(age > 18) {
    console.log("Elligble to vote!"); // OUTPUT!!
} else {
    console.log("Not Elligible");
}

if(age > 18 && country=="India") {
    console.log("Elligible to vote in India");
}else if(age > 20 && country == "china") {
    console.log("Elligible to vote in China");
} else {
    console.log("Not elligible");
}

// LOOPS
// for loop
for(var i=0; i<100; i++){
    console.log("Iterating for "+i+" time");
}

// while loop
var i=0;
while(i<100){
    console.log("Running while loop for "+i+" time");
    i++;
}