import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.io.InputStreamReader;
class Client
{
	public static void main(String[] args) 
	{
		try
		{
			int i=1;
			Socket cs = new Socket("122.164.89.188",16000);
			//reading from the client 
			BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream()));
			//writing to the client
			PrintWriter pw = new PrintWriter(cs.getOutputStream(),true);// true is used for the aoto flushing so that we need not to wait for the buffer to full
			Scanner input=new Scanner(System.in);
			while(true)
			{
			System.out.println("Enter message for sending to server: ");
			
			String info = input.nextLine();
			pw.println(info);
			String msg=br.readLine();
			System.out.println("message from the server :"+msg);
			System.out.println("Enter 1 to continue :");
			i=input.nextInt();
			if (i==0)
			{
				cs.close();
			}
			}
			
			





			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
