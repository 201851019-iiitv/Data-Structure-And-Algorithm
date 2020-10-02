
function Palidrome(s,i)
{

    if(i>=s.length-i-1)
    return true;
    if(s[i]!=s[s.length-i-1])
    return false;

    return Palidrome(s,i+1);


}

if(Palidrome("malayalam",0))
console.log("Yes It's Palidrome !!");
else
console.log("No it is not a Palidrome ");
