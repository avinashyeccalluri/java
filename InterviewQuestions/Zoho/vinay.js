let og = "a12b1";
let ogSplit = og.split(""); //  [a,1,0,b,1]
let output = [];
let finalArr = [];
let i, j, k, l;

output = og.split(/(\d+)/);//.filter(Boolean);
console.log(output);

for (k = 0; k < output.length; k += 2) {
  for (l = 0; l < parseInt(output[k + 1]); l++) {
    finalArr.push(output[k]);
  }
}
console.log(finalArr);
console.log(finalArr.join(" "));
