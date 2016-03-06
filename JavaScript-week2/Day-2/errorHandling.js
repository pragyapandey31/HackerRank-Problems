function processData(my_string) {
    
    try
    
    {
        var rev=my_string.split(``).reverse().join(``);
        console.log('Reversed string is : '+rev);
        
        
        
    }
    
    catch(err){
        console.log('Error : '+err.message);   
}
    finally
    {
        console.log('Type of my_string is : '+typeof my_string); 
    }
    //Enter your code here
} 
