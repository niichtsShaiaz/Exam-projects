let numbers = [3, 5, 4, 5, -2];
let expected = [8, 9, 9, 3, -2];

function cbAll(number, index, arr) {
    if (index < arr.length - 1) {
        return number + arr[index + 1];
    } else {
        return number;
    }
}

let res = numbers.map(cbAll);
console.log("\nexpected: " + expected.join(", "));
console.log("result: " + res.join(", "));


var people = ["lars", "jan", "Peter", "Bo", "Frederik"];

var names = ["Lars", "Peter", "Jan", "Bo"];

const res4 = names.filter(names => names.length <= 3);
console.log(res4);
const res5 = res4.map(n => n.toUpperCase());
console.log(res5);

var dick = myFilter(names, myCB);
console.log(dick);

function myFilter(arr, cb) {
    let resar = [];
    for (let i = 0; i < arr.length; i++) {
        if (cb(arr[i]))
            resar.push(arr[i]);
    }
    return resar;
}

function myCB(name) {
    if (name.length <= 3) {
        return true
    }
}
