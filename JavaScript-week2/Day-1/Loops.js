function vowelsAndConsonants(s) {
    var v="";
    var c="";
    for(var i=0;i<s.length;i++)
        {
            var ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                v=v+ch;
                
            }
            else
            {
            c=c+ch;    
            }
        }
    for(var j=0;j<v.length;j++)
        {
            console.log(v.charAt(j));
            
        }
     for(var j=0;j<c.length;j++)
        {
            console.log(c.charAt(j));
            
        }
}
