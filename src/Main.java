class stack{
   int arr [] = new int[10];
   int tos;

   stack(){
       tos=-1;
   }
    void push(int item){
       if( tos ==9){
           System.out.println(" the stack is full");
       }else{
           arr[++tos]=item;
       }
   }
   int pop(){
       if(tos<0){
           System.out.println(" stack is underflow");
           return 0;
       }else{
          return arr[tos--];
       }
   }
}
 class main1{
    public static void main(String []args){
    stack mystack1=  new stack();
    stack mystack2= new stack();

        for( int i=0;i<10;i++){
            mystack1.push(i);
        }
        for( int z=0;z<20;z++){
            mystack2.push(z);
        }


        System.out.println(" stacks in mystack2");
        for(int i=0;i<10;i++){
            System.out.println(mystack1.pop());
        }
        System.out.println(" stacks in mystack2");
        for(int i=0;i<20;i++){
            System.out.println(mystack2.pop());
        }
    }
}






