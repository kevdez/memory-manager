import java.util.Arrays;


public class MemoryManager{

	int mem_size;
	int[] mem;
	
	public MemoryManager(int mem_size)
	{
		this.mem_size = mem_size;
		this.mem = new int[mem_size];
		Arrays.fill(mem, 0);
		//TODO: initialize the first hole
	}
	
//	The three main memory manager functions
	public void mm_init()
	{
		this.mem = new int[mem_size];
	}
	
	public int mm_request(int n)
	{
		
		return 0;
	}
	
	public void mm_release(int p)
	{
		
	}
	
}
