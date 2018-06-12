let numbers = [1,2,3,4];

function myMap (arr,cb){
   let resar =[];
   for (let i = 0; i<arr.length; i++){
       resar.push(cb(arr[i]));
   }
    return resar;
}

let res = myMap(numbers, (n)=>n*-10);
console.log(res);

