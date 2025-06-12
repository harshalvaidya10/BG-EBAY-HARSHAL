package edu.usc.bg.server;

public class ClientInfo {
	private String IP;
	int ClientId;
	private int Port;
	public ClientInfo( String ip, int p, int id)
	{
		setIP(ip);
		setPort(p);
		ClientId=id;
		
	}
	public String getIP() {
		System.out.println("Enter getIP method of ClientInfo");
		System.out.println("IP: " + IP);
		return IP;
	}
	public void setIP(String iP) {
		System.out.println("Enter setIP method of ClientInfo");
		IP = iP;
		System.out.println("IP: " + IP);
	}
	public int getPort() {
		System.out.println("Enter getPort method of ClientInfo");
		System.out.println("Port: " + Port);
		return Port;
	}
	public void setPort(int port) {
		System.out.println("Enter setPort method of ClientInfo");
		Port = port;
		System.out.println("Port: " + Port);
	}

}
