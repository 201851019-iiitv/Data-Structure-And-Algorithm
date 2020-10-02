function mindiff()
{
var a=[-1,3,1,2,20,29];
var b=[26,2,135,15,17];
a.sort(function(c,d){return c-d;});
b.sort(function(c,d){return c-d;});

var i=0,j=0,val;
var mindiff=Number.MAX_VALUE;

var a1=0,b1=0;

while(i<a.length && j<b.length)
{
   val=Math.abs(a[i]-b[j]);
   if(mindiff>val)
   {
  mindiff=val;
  a1=a[i];
  b1=b[j];
   }
   //mindiff=Math.min(mindiff,val);

   if(a[i]<b[j])
   i++;
   else {
     j++;
   }


}

return [a1,b1,mindiff];
}

console.log(mindiff());
