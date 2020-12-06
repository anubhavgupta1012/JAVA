interface Test
{void show();
}

class Sample
{ Test get()
{ class MyNested implements Test
	{ 
	public void show()
		{
			System.out.println("Show in Nested Class");
		}
	}

return(new MyNested());
}
}