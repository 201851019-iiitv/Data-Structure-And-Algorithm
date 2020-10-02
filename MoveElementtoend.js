//  Time complexity =O(N) and Space Complexity  O(N);
function movetoend()
{
var arr=[2,1,2,2,3,2,4,2];
var k=2;
var res =[];

var count=0;

for(var i=0;i<arr.length;i++)
{
   if(arr[i]!=k)
    res.push(arr[i]);
    else
    count++;


}

for(var i=0;i<count;i++)
res.push(k);



return res;

}

console.log(movetoend());
