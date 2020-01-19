import java.io.File.*; 
import java.util.Scanner;
import java.io.*; 
public class SimpleEncrypt{


///////////////////////////////////////////////////*****************************
public static Stack<Queue<Character>> readSentences(String fileName){
	  char c ;
    Stack<Queue<Character>> po1 = new LinkedStack<Queue<Character>>();//temp
	 Stack<Queue<Character>> po2 = new LinkedStack<Queue<Character>>();//st
	try {
		 Scanner p = new Scanner(new File(fileName));//input
	 while(p.hasNext()){
	        String  q=p.nextLine();//line
           	Queue<Character> pok = new ArrayQueue<Character>(10000) ;//qu
	        for(int i=0;i<q.length();i++) {
           pok.enqueue(q.charAt(i));}
           po1.push(pok);
	       	        }
                    while(!po1.empty()){
                    po2.push(po1.pop());
                    }
	 }
	   catch(FileNotFoundException e){e.printStackTrace();}
	return   po2;
	
}
	
	
	
	
	


public static void encrypt(Queue<Character> q, int k){
    LinkedStack <Character> stack = new LinkedStack <Character>(); 
    int Size =q.length();
    Character c;
    	for(int g=0;g<Size/k;g++){
      for(int i=0;i<k;i++){
      c=q.serve ();
      stack.push(c);
      }
      for(int i=0;i<k;i++){
      q.enqueue(stack.pop());}
      }
      int x=Size%k;
      if(x!=0){
      for(int i=0;i<x;i++){
      c=q.serve ();
      stack.push(c);}
      for(int i=0;i<x;i++){
      q.enqueue(stack.pop());
      }}
      
}
	
	
	

public static void decrypt(Queue<Character> q, int k){
encrypt(q,k);
		
		}
	

	
	
	
	
	


//*decrypt ************************ exption :::: 
public static  void encrypt(Stack<Queue<Character>> st, int k){
Stack<Queue<Character>> po =new LinkedStack<Queue<Character>> ();//temp
	     while(!st.empty()) {
        ArrayQueue<Character> c= (ArrayQueue<Character>) st.pop();	     
         encrypt(c,k);
	    	 po.push(c);	 
	     }
        while(!po.empty()){
        st.push(po.pop());
        }
	    	}
  

public static void decrypt(Stack<Queue<Character>> st, int k){
  encrypt(st,k); }}

