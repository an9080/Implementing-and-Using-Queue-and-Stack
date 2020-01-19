	public class ArrayQueue<T> implements Queue<T>{
    private int maxsize;
		private int size;
		private int head, tail;
		private T[] nodes;

		public ArrayQueue(int n) {
			maxsize = n;
			size = 0;
			head = tail = 0;
			nodes = ((T[])new Object[n]);
		}
	public boolean full () {
			return size == maxsize;
		}
		
		public int length () {
			return size;
		}
	public void enqueue(T e) {
			nodes[tail] = e;
			tail = (tail + 1) % maxsize;
			size++;
		}
	   public T serve () {
			T e = nodes[head];
			head = (head + 1) % maxsize;
			size--;
			return e;
		}
	   public int multiServe(T[] els, int k){
		  int l=0;
        for(int i=0;i<k;i++){
		  if(size>0){
        T e = nodes[head];
			  els[i]=e;
			head = (head + 1) % maxsize;
			size--;
         l++;
		  }}
		  return l;
		   
	   }
	   public  int multiEnqueue(T[] els, int k) {
	   int l=0;
			  for(int i=0;i<k;i++) {
				  if(size <nodes.length) {
              nodes[tail] = els[i];
			tail = (tail + 1) % maxsize;
			size++;
			  l++;}}
		  return l;  
	   }
}
