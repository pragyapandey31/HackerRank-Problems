
static int B,H;
static boolean flag;
static
    {
    
    Scanner in=new Scanner(System.in);
    B=in.nextInt();
    flag=true;
    H=in.nextInt();
    if(B<=0||H<=0)
    {
        flag=false;
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
    
}
