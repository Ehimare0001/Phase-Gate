function reverseNumbers(numbers){ 
let result = [];

for (let row of numbers) {

    result.push([...row].reverse());
}

return result;

}

let numbers = [
 [1, 2, 3],
 [4, 5, 6],
 [7, 8, 9]
 ];
  

 
