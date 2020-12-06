package my;
	
import java.rmi.*;
import java.rmi.server.*;


public interface MyRemote extends Remote
	{

	public int add(int x,int y)throws RemoteException;

	}
