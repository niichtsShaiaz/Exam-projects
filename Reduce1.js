var all = ["Lars", "Peter", "Jan", "Bo"];
console.log(all.join(", "))

let numbers = [2, 3, 67, 33];
result = numbers.reduce((n, s) => n + s);
console.log(result);

var members = [
    { name: "Peter", age: 18 },
    { name: "Jan", age: 35 },
    { name: "Janne", age: 25 },
    { name: "Martin", age: 22 },
]

//0, peter, 0, members
//18, jan, 1, members
//53 janne, 2, members
//78, martin, 3, members
var reducer = function (accumulator, member, index, arr) {
    if (index < arr.length - 1) {
        return accumulator + member.age;
    } else {
        return sum = (accumulator + member.age) / arr.length;
    }
}
console.log(members.reduce(reducer, 0));
console.log("\nOpgave D\n")

var votes = ["Clinton", "Trump", "Clinton", "Clinton", "Trump", "Trump", "Trump", "None"]
var a= {
    Clinton: 0,
    Trump: 0,
    None: 0,
}

function cbReduce(accumulator, currVal, index, array) {
    
    if(currVal =="Clinton")
    a["Clinton"] ++;

    if(currVal =="Trump")
    a["Trump"] ++;
    if(currVal =="None")
    a["None"] ++;
    return a;
}
const voted = votes.reduce(cbReduce, 0);
console.log(voted);

function count(b, currVal) {
    
    if (currVal in b)
    {
        b[currVal]++;
    } else {
        b[currVal] = 1;
    }
    return b;
}
var BLOB = votes.reduce(count, {});
console.log("\n\nnew object l0l");
console.log(BLOB);
