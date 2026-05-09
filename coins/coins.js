let n=Number(prompt());
let c=0;
let i=1;

while (n>=i){
    n-=c;
    c++;
    i++;
}
console.log(c-1);
