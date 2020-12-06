class ProxyImage implements Image{

	private RealImage ri;
	private String fn;
	
		
	ProxyImage(String fn)
		{
		this.fn=fn;
		}
	
	public void display()
		{
		if(ri==null)
			ri=new RealImage(fn);	
		}

				}