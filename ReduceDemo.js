let numbers = [1, 2, 3, 4];

//let result = 10;


function cbReduce(accumulator, currVal, index, array) {
    if (index < array.length - 1) {
        return accumulator + currVal;
    } else {
        return accumulator+currVal;
    }
}


const result = numbers.reduce(cbReduce, 10);
console.log(result);