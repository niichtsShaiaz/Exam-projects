//1
let numbers = [1, 3, 5, 10, 11];
//expected 4,8,15,21,11


//Longer anon function
let result = numbers.map((n, index) => {
    if (index + 1 >= numbers.length)
        return n;
    else
        return numbers[index] + numbers[index + 1]
})
console.log("\nOpgave A: "+result.join(" # "));    

//2
//short anon function
let result2 = result.filter((n) => n>=15)

console.log("\nOpgave B: "+result2.join(" # "));  

//3
function myMap (arr,cb){
   let resar =[];
   for (let i = 0; i<arr.length; i++){
       resar.push(cb(arr[i],i));
   }
    return resar;
}

let res = myMap(numbers, (n,i)=>numbers[i]+numbers[i+1]);
console.log("\nOpgave C: "+res);

//4
var votes = ["Clinton", "Trump", "Clinton", "Clinton", "Trump", "Trump", "Trump", "None"]
var a= {
    Clinton: 0,
    Trump: 0,
    None: 0,
}

function count(b, currVal) {
    
    if (currVal in b)
    {
        b[currVal]++;
    } else {
        b[currVal] = 1;
    }
    return b;
}
var voted = votes.reduce(count, {});
console.log("\nOpgave D: ")
console.log(voted);

//5
let person = function () {
    return {
        getFirstName: function () {
            return _firstname;
        }
        ,
        setFirstName: function (name) {
            this._firstname = name;
        },
        setAge: function (age) {
            this._age = age;
        },
        getInfo: function () {
            return this._firstname +", "+ this._age;
        }
    }
}
let Jesper = person();
Jesper.setFirstName("Jesper");
Jesper.setAge(33);
console.log("\nOpgave E: "+Jesper.getInfo());


class Persons {
    constructor(initialData){
        this._persons = initialData;
    }

    set addPerson(p){
        this._persons.push(p);
    }

    getPersonById(i) {
        return this._persons[i];
    }
    
    getPersons() {
        return this._persons;
    }
}