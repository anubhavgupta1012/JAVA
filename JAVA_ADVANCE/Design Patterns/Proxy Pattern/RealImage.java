class RealImage implements Image{

	private String fn;
	
	RealImage(String fn)
		{
		this.fn=fn;
		loadFromDisk(fn);		

		}
	
	public void display()
		{
		System.out.println("Displaying :"+fn );
		}

	private void loadFromDisk(String s)
		{
		System.out.println("Loading : "+s);
		}

				}